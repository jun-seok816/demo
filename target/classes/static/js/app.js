/**
 * 사용자 정보 수정 모달 (data-* 속성 활용) 스크립트 인젝션 방지
 * @param {HTMLElement} element
 */
function openEditUserModalFromElement(element) {
  const userId = element.getAttribute("data-user-id");
  const userName = element.getAttribute("data-user-name");
  const userEmail = element.getAttribute("data-user-email");
  const department = element.getAttribute("data-user-department");

  openEditUserModal(userId, userName, userEmail, department);
}

/**
 * 걍 초기값 채우지말까 어케하는거지 이렇게 복잡할리가 없는데?ㅋㅋ
 * @param {*} container
 * @returns void
 */
function getUpdatedHTML(container) {
  // 렌더링된 DOM의 동적 값을 포함한 HTML 생성
  const inputs = container.querySelectorAll("input, select");

  inputs.forEach((input) => {
    if (input.tagName === "INPUT") {
      // 입력 요소의 동적 값을 HTML 속성에 동기화
      input.setAttribute("value", input.value);
    } else if (input.tagName === "SELECT") {
      // 선택된 옵션을 업데이트
      const options = input.querySelectorAll("option");
      options.forEach((option) => {
        option.removeAttribute("selected"); // 기존 선택 상태 초기화
        if (option.value === input.value) {
          option.setAttribute("selected", "selected");
        }
      });
    }
  });

  // 업데이트된 HTML 반환
  return container.innerHTML;
}

/**
 *
 * @param {Long} userId
 * @param {String} userName
 * @param {String} userEmail
 * @param {Long} dpId
 *
 * 사용자 정보 수정 모달
 */
function openEditUserModal(userId, userName, userEmail, dpId) {
  // 렌더링된 DOM 요소 가져오기
  const userFormContainer = document.getElementById("user-form-container");

  // 값 설정 (렌더링된 DOM 요소 수정)
  const d_userName = userFormContainer.querySelector("#swal-name");
  d_userName.value = userName;

  const d_userEmail = userFormContainer.querySelector("#swal-email");
  d_userEmail.value = userEmail;

  const d_userDepartment = userFormContainer.querySelector("#swal-department");
  d_userDepartment.value = dpId;

  // 동적으로 업데이트된 HTML 가져오기
  const userFormHTML = getUpdatedHTML(userFormContainer);

  Swal.fire({
    title: "Edit User",
    html: userFormHTML,
    focusConfirm: false,
    showCancelButton: true,
    confirmButtonText: "Update",
    preConfirm: () => {
      // SweetAlert 내 DOM 선택
      const name = Swal.getHtmlContainer()
        .querySelector(".swal-name")
        .value.trim();
      const email = Swal.getHtmlContainer()
        .querySelector(".swal-email")
        .value.trim();
      const department =
        Swal.getHtmlContainer().querySelector(".swal-department").value;

      if (!name || !email || !department) {
        Swal.showValidationMessage("Please fill out all fields.");
        return false;
      }

      return { id: userId, name, email, department };
    },
  }).then((result) => {
    if (result.isConfirmed) {
      console.log("Updated Data:", result.value);
      updateUser(result.value);
    }
  });
}

/**
 *
 * @param {*} userData UserDTO참고
 */
function updateUser(userData) {
  axios
    .post("/users/update", userData, {
      headers: {
        "Content-Type": "application/json",
      },
    })
    .then((response) => {
      if (response.status === 200) {
        Swal.fire("Success", "사용자 업데이트 완료", "success");
        setTimeout(() => window.location.reload(), 1500);
      } else {
        Swal.fire("Error", "Failed to update user.", "error");
      }
    })
    .catch((error) => {
      console.error("Error updating user:", error);
      Swal.fire("Error", "Failed to update user.", "error");
    });
}

/**
 *
 * @param {Long} userId
 * 사용자 삭제
 */
function deleteUser(userId) {
  if (confirm(`사용자를 삭제 하겠습니까?`)) {
    axios
      .delete(`/users/${userId}`)
      .then((response) => {
        alert(response.data); // 서버에서 반환한 메시지 표시
        location.reload(); // 페이지 새로고침 (필요에 따라 DOM 수정 가능)
      })
      .catch((error) => {
        console.error(error);
        alert("Failed to delete user. Please try again.");
      });
  }
}

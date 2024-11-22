/**
 * @des
 *  사용자정보 수정 모달조작
 */
document.addEventListener("DOMContentLoaded", () => {
  const editUserBtn = document.getElementById("edit-user-btn");
  const editUserModal = document.getElementById("edit-user-modal");
  const closeModalBtn = document.getElementById("close-modal-btn");

  // 모달 열기
  editUserBtn.addEventListener("click", () => {
    editUserModal.classList.remove("hidden");
    editUserModal.classList.add("flex"); // 모달 중앙 정렬을 위한 flex 추가
  });

  // 모달 닫기
  closeModalBtn.addEventListener("click", () => {
    editUserModal.classList.add("hidden");
    editUserModal.classList.remove("flex");
  });

  // 폼 제출 핸들러 (예제)
  const editUserForm = document.getElementById("edit-user-form");
  editUserForm.addEventListener("submit", (e) => {
    e.preventDefault(); // 기본 제출 동작 방지
    const name = document.getElementById("edit-name").value;
    const email = document.getElementById("edit-email").value;

    console.log(`Name: ${name}, Email: ${email}`); // 데이터를 콘솔에 출력
    // TODO: 서버로 데이터 전송

    // 모달 닫기
    editUserModal.classList.add("hidden");
    editUserModal.classList.remove("flex");
  });
});

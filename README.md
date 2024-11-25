# 사용자 관리 페이지

Spring Boot, JPA, 그리고 Thymeleaf를 활용하여 구현한 사용자 관리 페이지입니다.  
이 프로젝트는 CRUD (Create, Read, Update, Delete) 기능을 중심으로 사용자 데이터를 관리할 수 있습니다.

---

## 📋 주요 기능

- **사용자 목록 조회**: 모든 사용자 데이터를 테이블 형태로 표시
- **사용자 추가**: 새로운 사용자를 추가할 수 있는 폼 제공
- **사용자 수정**: 기존 사용자의 정보를 수정 가능
- **사용자 삭제**: 특정 사용자를 삭제
- **데이터 유효성 검사**: 입력 데이터의 유효성을 검사

---

## 🛠️ 사용 기술

- **Backend**
  - Spring Boot 3.3.5
  - Spring Data JPA  
  - Mysql
- **Frontend**
  - Thymeleaf
  - TailWind Css
- **Tooling**
  - VSCode

---

## 📦 ERD

![image](https://github.com/user-attachments/assets/0b956216-d3e3-4a69-bac6-3cff2ca789e4)

# 📄 페이지 구성

## 1. 사용자 리스트 (User List)
- **테이블 (Table):**
  - 컬럼:
    - **ID:** 사용자의 고유 식별 번호
    - **Name:** 사용자의 이름
    - **Email:** 사용자의 이메일 주소
    - **Departments:** 사용자가 속한 부서
    - **Actions:** 사용자 수정 및 삭제 버튼
  - 각 행에는 해당 사용자의 정보를 표시
- **기능:**
  - **Edit 버튼:** 선택한 사용자의 정보를 수정하는 모달 창을 띄움
  - **Delete 버튼:** 선택한 사용자를 삭제 (확인 팝업 없이 즉시 삭제)

---

## 2. 사용자 생성 폼 (Create User Form)
### 위치
- 사용자 목록 아래

### 구성 요소
- **입력 필드:**
  - **Name:** 사용자의 이름 입력
  - **Email:** 사용자의 이메일 입력
  - **Department:** 드롭다운 메뉴로 부서 선택
- **버튼:**
  - **Create User 버튼:** 입력된 정보를 기반으로 새 사용자 생성

---

## 3. 사용자 수정 모달 창 (Edit User Modal)
### 위치
- "Edit" 버튼 클릭 시 팝업

### 구성 요소
- **입력 필드:**
  - **Name:** 수정할 사용자의 이름 (기존 데이터가 기본값으로 채워짐)
  - **Email:** 수정할 사용자의 이메일 (기존 데이터가 기본값으로 채워짐)
  - **Department:** 드롭다운 메뉴로 부서 선택 (기존 부서가 기본값으로 표시됨)
- **버튼:**
  - **Update 버튼:** 수정된 데이터를 저장
  - **Cancel 버튼:** 모달 창 닫기 (변경 사항 저장 안 함)

---

## 📌 기능 흐름
1. **사용자 목록 페이지 표시**
   - 기본으로 모든 사용자 데이터가 테이블에 나타남.
2. **사용자 생성 (Create User):**
   - 폼에 데이터를 입력한 후 "Create User" 버튼을 클릭하여 새로운 사용자를 추가.
3. **사용자 수정 (Edit User):**
   - "Edit" 버튼 클릭 시, 해당 사용자의 정보가 채워진 수정 모달 창이 표시됨.
   - 입력 값을 수정한 뒤 "Update" 버튼 클릭 시 변경 사항 저장.
4. **사용자 삭제 (Delete User):**
   - "Delete" 버튼 클릭 시, 해당 사용자가 즉시 삭제됨.



## 📸 스크린샷 활용

- **User List 스크린샷:**
  https://github.com/user-attachments/assets/7db0e47b-45f5-4b39-9fb3-b465a8ab8c40  

- **Edit User Modal 스크린샷:**
  https://github.com/user-attachments/assets/d6232053-0391-450f-9f10-d46c2e23121f



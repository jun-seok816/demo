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
  - vsCode

---

## 📦 프로젝트 구조

src ├── main │ ├── java/com/example/demo │ │ ├── controller # 컨트롤러 계층: 요청과 응답 처리 │ │ │ ├── HomeController.java # 홈 페이지와 관련된 요청 처리 │ │ │ └── UserController.java # 사용자 관리 관련 요청 처리 │ │ ├── dto # 데이터 전송 객체 (DTO) │ │ │ └── UserDTO.java # 사용자 정보 데이터 전송 객체 │ │ ├── entities # JPA 엔티티 클래스 │ │ │ ├── Departments.java # 부서 정보 엔티티 │ │ │ └── User.java # 사용자 정보 엔티티 │ │ ├── repositories # JPA 레포지토리 계층 │ │ │ ├── DpRepository.java # 부서 데이터베이스 접근 │ │ │ └── UserRepository.java # 사용자 데이터베이스 접근 │ │ ├── services # 비즈니스 로직 계층 │ │ │ ├── DpService.java # 부서 서비스 인터페이스 │ │ │ ├── DpServiceImpl.java # 부서 서비스 구현체 │ │ │ ├── UserService.java # 사용자 서비스 인터페이스 │ │ │ └── UserServiceImpl.java # 사용자 서비스 구현체 │ │ └── DemoApplication.java # Spring Boot 메인 클래스 │ ├── resources │ │ ├── static # 정적 자원 (CSS, JS, 이미지 등) │ │ │ ├── css │ │ │ │ └── style.css # 공통 스타일 파일 │ │ │ ├── images │ │ │ │ ├── default_user.png # 기본 사용자 이미지 │ │ │ │ └── logo_m.svg # 로고 이미지 │ │ │ └── js │ │ │ └── app.js # 클라이언트 측 동작 정의 │ │ ├── templates # Thymeleaf 템플릿 (HTML 파일) │ │ │ ├── fragments # 공통 UI 구성 요소 │ │ │ │ ├── create-user.html # 사용자 추가 폼 │ │ │ │ ├── edit-user.html # 사용자 수정 폼 │ │ │ │ ├── header.html # 공통 헤더 │ │ │ │ └── user-list.html # 사용자 목록 페이지 │ │ │ └── index.html # 홈 페이지 │ │ └── application.properties # Spring Boot 설정 파일 └── test # 테스트 코드 디렉토리

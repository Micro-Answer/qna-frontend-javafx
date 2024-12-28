# qna-frontend-javafx
## 도전과제
### 설계
- [x] 페이지 계층 디자인 
- [x] 구독-발행 패턴을 활용한 페이지 관리 계층 디자인
- [x] Layered Architecture 설계
- [x] 작업 단위로 분리
```
org.example.qnafrontendjavafx
├── application
│   └── domain (작업 단위로 분리)
│       ├── 일반 유저 회원가입 (Layered Architecture 설계)
│       │   ├── Controller
│       │   ├── Service
│       │   └── Request
│       ├── 전문가 회원가입 
│       └── 로그인 
├── core.presentation
│   ├── page (페이지 계층 디자인 - 인터페이스, 추상 클래스 모음)
│   └── navigator (구독-발행 패턴을 활용한 페이지 관리 계층 디자인 - 인터페이스 모음)
```

### 유스케이스
- [ ] 일반 유저 회원 가입 
- [ ] 로그인 

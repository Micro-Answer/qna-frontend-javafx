# qna-frontend-javafx
## 도전과제
### v2 설계
- [x] 이벤트를 활용한 페이지 전환에 대한 흐름 제어를 맡은 프레임워크로 발전
- [x] 빌더 패턴으로 개발자가 프레임워크에 이벤트와 페이지 등록 
- [x] 모듈 분리 
- [x] 각 페이지 간 자원 공유를 위해 애플리케이션 레이어 디자인    
- [x] 애플리케이션 레이어에서 공유 자원에 대한 instanceof 패턴 매칭 활용
- [x] 공유 자원 강제에서 선택으로 전환하여 개발자의 자유도 증가 
- [ ] 애플리케이션 레이어 강제에서 선택으로 전환하여 개발자의 자유도 증가 

### v1 설계
- [x] 페이지 계층 디자인
- [x] 발행-구독 패턴을 활용한 페이지 관리 계층 디자인
- [x] Record와 불변성을 활용한 이벤트
- [x] Layered Architecture 설계
- [x] 작업 단위로 분리
- [x] 패키지 접근자로 노출 제한
- [x] 의존성 주입 Injector 객체 

```
org.example.qnafrontendjavafx
├── core (인터페이스 모음)
│   ├── event  
│   │   └── IEvent (이벤트 OCP 목표)
│   │
│   ├── loader (발행-구독 패턴을 활용한 페이지 관리 계층 디자인)  
│   │   ├── IEventListener (이벤트 수신) - 마커 인터페이스
│   │   ├── IEventPublisher (이벤트 발행)
│   │   ├── IPageEventBus (이벤트 버스)
│   │   ├── IPageLoader (페이지 관리자)
│   │   └── IPageRegistry (이벤트와 페이지 매핑)
│   │ 
│   └── page.presentation (페이지의 Presentation 계층 디자인) 
│       ├── IController (UI 구성과 이벤트 발행)
│       └── IPage (Scene 관리)
│
├── application
│   ├── event (Record와 불변성을 활용한 이벤트 모음) - 전체 공개
│   │   ├── ExpertUserSignUpEvent
│   │   ├── GeneralUserSignUpEvent
│   │   └── SignInEvent
│   │
│   ├── loader (발행-구독 패턴을 활용한 페이지 관리 계층)
│   │   ├── EventPublisher (이벤트 버스에 이벤트 발행)                   - 패키지 접근자 
│   │   ├── InjectorPageLoader (패키지 내에 있는 객체 조립)              - 전체 공개 
│   │   ├── PageEventBus (이벤트 버스)                                - 패키지 접근자 
│   │   ├── PageLoaderWithEventListener (이벤트 수신 후 관련 페이지 표현) - 패키지 접근자 
│   │   └── PageRegistry (이벤트와 페이지 매핑)                         - 패키지 접근자 
│   │ 
│   └── page (작업 단위로 페이지 구성)
│       ├── expert.user.signup 
│       │   ├── InjectorExpertUserSignUp (패키지 내에 있는 객체 조립) - 전체 공개
│       │   ├── Page                     (Presentation)          - 패키지 접근자 
│       │   ├── Controller               (Presentation)          - 패키지 접근자 
│       │   ├── Service                  (Business Logic)        - 패키지 접근자 
│       │   ├── EntityExpertUser         (Domain Model)          - 패키지 접근자 
│       │   ├── Request                  (Infrastructure)        - 패키지 접근자 
│       │   └── Response                 (Infrastructure)        - 패키지 접근자 
│       ├── general.user.signup
│       └── signin 
├── utils
│   ├── formatter 
│   └── network
```

### 유스케이스
- [ ] 일반 유저 회원 가입 
- [ ] 전문가 유저 회원 가입  
- [ ] 로그인 

### UI 
- [x] 일반 유저 회원 가입
- [x] 전문가 유저 회원 가입
- [x] 로그인 
- [x] 마이페이지 

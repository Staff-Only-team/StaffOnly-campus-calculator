---
name: 기능 Issue 본문 템플릿
about: 기능 Issue 본문 템플릿
title: ''
labels: ''
assignees: ''

---

## 기능
(미션의 한 줄 목표를 내 말로)

## 담당
@github아이디

## 내가 만들 클래스와 메소드
(미션 3번 표의 메소드 선언부를 글자 그대로 옮겨 적기)
- (OOOCalculator)
  - (메소드 선언부)
  - (메소드 선언부)
- (OOOService)
  - (메소드 선언부)
  - (메소드 선언부)

## 규칙을 내 말로
- (미션 2번 규칙을 읽고, 어떤 입력에서 어떤 결과가 나오는지 내 말로)

## 호출 흐름도
(미션 4번 호출 흐름을 보고 mermaid 로 직접 그리기)
```mermaid
sequenceDiagram
    participant A as Application (창구)
    participant S as OOOService (담당자)
    participant C as OOOCalculator (도구)
    A->>S: 메소드이름(값, 값)
    S->>C: 메소드이름(값, 값)
    C-->>S: 돌려준 값
    S-->>A: 돌려준 값
```

## 궁금한 점
- (없으면 "없음")

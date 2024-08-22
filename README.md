# Break-Out

# 벽돌 깨기!
***

### 개요
- Java 언어 학습 과정에서 배웠던 내용을 복습하고자 *벽돌 깨기*를 주제로 선정  
- 객체지향의 특징인 [ *추상화*, *상속*, *다형성*, *캡슐화* ]를 잘 적용 해보기  
- Java가 제공하는 GUI라이브러리와 event-driven 프로그래밍을 통해 프로그래밍 연습

java GUI Library
- awt
- swing

event-driven Programing
- eventListener
- MouseEvent

### 참고
프로젝트 실습에 사용될 외부 라이브러리
- Log4J2
- JUnit5

***
### DOC
[Ball](https://github.com/insub2004/Break-Out/blob/main/doc/Ball.md)

***
### 진행상황
1. World 생성후 Paintable 공 띄우기

<img width="571" alt="image" src="https://github.com/user-attachments/assets/8e6d1faf-525c-45a6-950d-da4a023bc99f">

2. 공 여러개 만들어 보기

<img width="538" alt="image" src="https://github.com/user-attachments/assets/f115b941-377f-4182-b211-fb44f58778a0">

>문제점 발생
> 
> a. 공의 완전한 형태가 World 경계 밖으로 까지 나간다.
> > 해결 방법 : 공이 world에 추가될 때 공의 좌표와 반지름을 이용해 Exception 발생
> >
> > [코드보기](https://github.com/insub2004/Break-Out/blob/85ed195ddb52ea2d3e488317c7f583c2a89971e8/src/main/java/ball/Ball.java#L13-L20)
> 
> b. 공들끼리 겹쳐서 형성된다.
> > 해결 방법 : 겹쳐졌을 때 추가적으로 어떤 행동을 취하도록 추가 할 예정

3. 고정된 것을 움직이게 하는 마술
  
- 움직이는 공과 움직이려는 공을 world에서 어떻게 구현할까?

<img src="https://github.com/user-attachments/assets/85961a11-36cd-4845-ad0c-0d236f9e3119" width="500" height="500" alt="MovableBall.gif">
  
- MovableBall 과 MovableWorld를 만들었다.
>문제점 발생
>
> a. 공이 한 방향으로 움직인다.
> > 해결 방법 : dx, dy를 random 값으로 설정하면 된다, 예제로만 적용해보고 실제 게임에서는 random으로 설정되지 않는다.
> 
> b. 공이 프레임 바깥으로 나간다.
> > 해결 방법 : 어떤 물체와 물체끼리 충돌했거나 특정 좌표를 넘어갔을 때 튕겨지게 만든다.

- 랜덤한 방향으로 이동하는 공들

<img src="https://github.com/user-attachments/assets/377c2862-95cd-4a6e-9699-ee6edb38c9a6" width="500" height="500" alt="RandomMovableBall.gif">

4. 부딪쳤으면 튕겨야지??



추가로 시간 오차에 대해서 생각해보기
- 수석님 교재 보고 편집

4. 

***
### reference
- 수석님 GitLab
- GUI 및 관련 클래스들 (https://velog.io/@jdc05163/GUI)
- AWT Swing (https://velog.io/@seochan99/9-%EC%9E%90%EB%B0%94-GUI-%EA%B8%B0%EC%B4%88-AWT%EC%99%80-Swing)
- JFrame,JPanel (https://velog.io/@msung99/GUI)
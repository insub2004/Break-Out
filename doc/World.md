# World
동작하는 공, 벽돌, 바를 전체적으로 관찰하며 관리하는 역할
벽돌 깨기 게임을 만들 때 실제 물체가 보이게 그리기 위해 아래 두 가지 이용
- JFrame(Main)
- JPanel(World)

>World 클래스의 경우 추후 몇가지 기능이 추가 확장된 클래스로 점점 진화한다.

### Variable
- List<Ball> ballList (실제 게임에서는 공이 한 개지만, 예제로 여러가지의 공을 저장해보기 위해 List로 선언)

### Method
- void add(Ball ball)
  - 공을 ballList에 추가하는 메서드
  
- void remove(Ball ball)
  - 공을 ballList에 삭제하는 메서드
  
- int getBallCount()
  - 공의 갯수를 반환하는 메서드
  
- Ball getBall(int index)
  - ballList에서 index에 위치한 공을 반환
  
- void paint(Graphics g)
  - JPanel의 정의된 void paint(Graphics g) 재정의
  - Panel을 다시 그려야하는 시점에 ball 출력
  - ballList에 있는 공들의 paint를 호출

# MovableWorld
움직이는 공을 만들었다고 공이 움직일 수 있는게 아니다.  
움직일 수 있는 환경을 만들어줘야 하는데 *MovableWorld*가 그 역할을 수행한다.

### Variable
- int moveCount
  - 단위 시간 만큼 이동한 횟수
- int limitedMaxMoveCount
  - 최대 이동할 수 있는 횟수 제한
  
### Method
- void resetMoveCount()
  - 이동 횟수(moveCount) 초기화
  - limitedMaxMoveCount는 초기화 되지 않는다.
- void move()
  - 공의 단위 거리(dx,dy) 만큼 이동
  - MovableBall인 경우에만 이동
  - 이동 후 화면을 다시 그려야 한다.
    - AWT 패키지에 repain() 메서드 참고
  - 이동에 성공하면 이동 횟수를 증가시켜 준다.
- void run()
  - 실제 공이 움직이는 것처럼 만들어주는 메서드
  - 단위 시간(Thread.sleep())동안 move()를 호출하는 역할
  - 이동 횟수가 최대 이동 횟수를 넘길 수 없다.
  - 최대 이동 횟수가 0일 경우 무한으로 움직인다.
- getter, setter 메서드
>추후 메서드나 변수들은 변경 될 수 있습니다.

### 밑에 있는 내용들은 다른 md로 옮길 것

![image](https://github.com/user-attachments/assets/8beae131-54ff-4fe7-9101-53c0c481e161)
  
#### AWT 패키지, Swing 패키지
- Swing : AWT 컴포넌트에 J가 덧붙여진 클래스
  - AWT의 Frame, Swing의 JFrame
- 대부분의 Swing 컴포넌트들은 JComponent 클래스를 상속 받음
  - JComponent는 AWT의 Container를 상속받음
- Swing의 JFrame의 경우 AWT의 Container를 상속받음

- 컨테이너 : 컴포넌트들을 담을 수 있는 컴포넌트
- 컴포넌트 : GUI 내부를 구성하는 하나하나
  
#### JFrame
- 최상위 컨테이너 (자기 컨테이너 혼자서 화면에 보여짐)
- 프로그램의 창
- 다른 그래픽 컴포넌트를 보여주는 역할을 수행
- Frame에 제목, 크기, 위치 등, set메서드들이 있다.
  
#### JPanel
- Frame 안에 컨테이너가 들어가는데 여기서 컨테이너는 JPanel, contentPane 두 가지가 있다.
- 컨테이너 안에 컴포넌트들을 추가해서 구성할 수 있다. (버튼 등)
  
#### Layout - 배치관리자
- 프레임 안에 있는 컨테이어 위에 컴포넌트들을 추가할 때, 레이아웃을 활용하면 예쁘게 잡아준다.
- 종류
  - BorderLayout(JFrame의 디폴트 배치관리자)
    - 컴포넌트를 배치할 때, [ 동서남북 + 중앙 ] 5구역 중 어디에 배치할지 지정
  - FlowLayout(JPanel의 디폴트 배치관리자)
    - 컴포넌트를 추가하다가 한 줄이 다 채워지면 아래줄부터 다시 채움
    - 윈도우 창 크기를 늘리고 줄임에 따라 컴포넌트들의 위치가 재배치 된다.
  - CardLayout
    - 여러개의 컴포넌트를 겹치게 구성
  - GridLayout
    - 격자형 배치
    - 프레임을 지정해준 i행 j열 격자칸으로 나누고, 격자에 순서대로 컴포넌트 배치
  
> 위의 예시들 추후에 추가
# Ball
실제 화면에서 움직이는 그 공 맞다.
***
### 기본 구성
![image](https://github.com/user-attachments/assets/10ac7837-2fef-440b-99ae-671231ef65fd)

- ball을 구성하는 기본 요소
  - 2차원 평면에서 ball을 설명할 수 있는 최소 정보
  - 위치
  - 크기
- ball은 생성된 후 ball의 고유 정보를 변경할 수 없다.

### Variable
- int x
  - 2차원 평면에서의 X축 상 위치
  - 생성 시 지정
- int y
  - 2차원 평면에서의 Y축 상 위치
  - 생성 시 지정
- int radius
  - 원의 반지름
  - 생성 시 지정

### Method
- int getX()
  - ball의 X 좌표 얻기
- int getY()
  - ball의 Y 좌표 얻기
- int getRadius()
  - ball의 중심에서 외곽까지의 길이를 나타내는 반지름 얻기
- String toString()
  - ball의 정보를 문자열로 출력
- getter와 setter
  - setter의 경우 접근제한자를 default로 제한한다.

> 추후에 필요한 클래스 변수, 메서드는 업데이트 하면서 추가 될 예정
***
# PaintableBall
위의 Ball 클래스를 확장해서 아래 두 가지를 포함하는 PaintableBall 클래스를 작성한다.
- 색깔
- 그려지는 행동

### Variable
- Color color
  - ball의 색상

### Method
- Color getColor()
  - ball의 색 얻기
- void paint(Graphic g)
  - 인수로 주어진 graphics context를 이용해 도형을 출력
  - ball을 화면에 출력할 수 있도록 지원하는 graphic context의 instance
  - g의 경우 개발자가 직접 넣어주는 형태가 아님

![image](https://github.com/user-attachments/assets/a021e34c-f50e-4646-be63-c8ec172e5c69)

>타원을 그리기 위해서는 fillOval(x,y,width,height) 함수를 사용
> > - 파라미터 x,y를 아래 그림처럼 왼쪽 위 상단쪽에 위치하게끔 전달
> > - 사각형에 내접하는 원을 그리는 형태
> 
> <img width="378" alt="image" src="https://github.com/user-attachments/assets/d000dcef-a776-4f01-80e3-d9146e01683d">
>
> - 중심좌표가 (10,10)이고 반지름이 10인 경우 ex) fillOval(0,0,20,20)

***
# MovableBall
고정된 공이 아닌 특정 방향으로 움직이는 공
움직이는 공이기 때문에 내가(움직이는공) 어느방향으로 어느만큼 이동할지 정보를 가지고 있어야 한다.
공이 움직이도록 보이려면 *단위 시간(dt)*만큼 *이동 거리(dx,dy)*의 변화를 그리는것을 반복해서 보여줘야한다.

- 특정 위치로 이동할 수 있다
- 단위 시간동안 일정 거리만큼 이동 가능
  - 변화량을 같는다
  
현재 프로젝트에서 *단위시간*을 화면을 재구성하는 시간으로 봐도 무방하며 **Thread.sleep()** 을 이용할 예정이다.

### Variable

- int dx
  - 단위 시간 동안 x축 방향으로 이동량을 나타내는 변위량(방향,이동거리)
- int dy
  - 단위 시간 동안 y축 방향으로 이동량을 나타내는 변위량(방향,이동거리)

### Method

- int getDX()
  - x축 방향의 변위량 가져오기
- int getDY()
  - y축 방향의 변위량 가져오기
- void setDX(int dx)
  - 단위 시간 당 x축 변위량 지정하기
- void setDY(int dy)
  - 단위 시간 당 y축 변위량 지정하기
- void move()
  - 단위 시간만큼 움직이기
- void moveTo(int x, int y)
  - 특정 위치로 옮기기

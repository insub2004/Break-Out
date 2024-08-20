# Ball
실제 화면에서 움직이는 그 공 맞습니다.
***
### 기본 구성
![image](https://github.com/user-attachments/assets/10ac7837-2fef-440b-99ae-671231ef65fd)

- ball을 구성하는 기본 요소
  - 2차원 평면에서 ball을 설명할 수 있는 최소 정보
  - 위치
  - 크기
- ball은 생성된 후 ball의 고유 정보를 변경할 수 없습니다.

### 필드멤버
- int x
  - 2차원 평면에서의 X축 상 위치
  - 생성 시 지정
- int y
  - 2차원 평면에서의 Y축 상 위치
  - 생성 시 지정
- int radius
  - 원의 반지름
  - 생성 시 지정

### 메서드
- int getX()
  - ball의 X 좌표 얻기
- int getY()
  - ball의 Y 좌표 얻기
- int getRadius()
  - ball의 중심에서 외곽까지의 길이를 나타내는 반지름 얻기
- String toString()
  - ball의 정보를 문자열로 출력
- getter와 setter
  - setter의 경우 접근제한자를 default로 준다.

> 추후에 필요한 메서드는 업데이트 하면서 추가 될 예정

# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 요구사항
* 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
* 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
* 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
* 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
* 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
* 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다.
* 우승자가 한 명 이상일 경우, 쉼표(,)로 이름을 구분해 출력한다.
* 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException를 발생시키고, ”[ERROR]”로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다. 
  * Exception이 아닌 IllegalArgumentException, IllegalStateException 등과 같은 명확한 유형을 처리한다.

## 기능 목록
- [ ] 경주할 자동차의 이름과 이동 횟수를 입력받는다.
  - 자동차는 한 대 이상 입력받을 수 있고 쉼표를 기준으로 구분한다.
- [x] 자동차의 이름은 1자 이상 5자 이하여야 한다.
- [x] 각 자동차는 이름을 기준으로 구분한다.
  - 이름이 같으면 같은 자동차, 다르면 다른 자동차이다.
- [ ] 입력받은 모든 자동차는 서로 구분 가능해야 한다.
- [ ] 이동 횟수는 0보다 큰 숫자여야 한다.
- [ ] 사용자가 잘못된 값을 입력할 경우 [ERROR]로 시작하는 에러메시지를 출력 후 그 부분부터 다시 입력받는다.
- [ ] 모든 자동차는 한번 씩 이동한다.
- [ ] 각 자동차는 한 번 이동할 때 마다 전진 또는 멈춘다.
  - 숫자(0 ~ 9)가 4 이상이면 전진하고 3 이하면 멈춘다.
  - 전진할 때 마다 자동차의 위치가 1씩 증가한다.
- [ ] 모든 자동차가 한번 씩 이동할 때 마다 자동차의 이름과 위치를 출력한다.
  - 출력하는 자동차의 순서는 입력받은 순서와 같다.
- [ ] 모든 자동차가 이동횟수만큼 이동한 후 게임이 완료된다.
- [ ] 게임이 완료된 후 최종 우승자를 출력한다.
  - 가장 멀리 전진한 자동차가 최종 우승자가 된다.
  - 최종 우승자가 둘 이상일 경우 쉼표로 이름을 구분해 출력한다.
  - 출력하는 자동차의 순서는 입력받은 순서와 같다.
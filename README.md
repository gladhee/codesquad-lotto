# codesquad-lotto

# 문제

## 물체의 충돌 판정을 이용한 로또 구현

### 구현 과정

- 내부적으로 1 ~ 45 까지의 숫자 6개를 선별한다.
- 2차원상의 맵(100 x 100) 에서 공을 무작위로 나열한 후에 각 공을 무작위로 이동
- 각 공의 위치가 동일하게 되면 무작위로 다른 방향으로 위치를 이동
- 당첨번호가 뽑히는 기준은 맵의 특정 자리(0, 0)에 오게되면 당첨 번호로 집계
- 총 6개의 공이 나올 때 까지 반복
- 매 무작위 이동마다 Console 에 맵의 상태를 표현

### 예외 상황

- 공이 벽에 닿았을 때,
  - 좌표값이 벽일 때, 다시 랜덤값을 돌려서 위치 업데이트

- 한 번에 한 공이 아닌 여러 공이 뽑힐 경우,
  - 가령 6개 초과하는 공이 뽑히는 경우 나온 순서대로 6개만 선정

- 공끼리 부딪혔을 때 
  - 다시 랜덤값을 부여한 후에 위치 업데이트

- 공이 (0, 0)에서 뽑힌 경우
  - 해당 공을 당첨 공으로 업데이트

### 설계

- **Ball**
  - 로또 번호 값
  - 당첨 여부
  - x, y위치 좌표

- **LottoMachine**
  - static final int wallMaxX = 20
  - static final int wallMaxY = 20

- **RandomGenerator**
  - 위치 업데이트의 최대 범위
    - -1 ~ 1
    - 공 번호도 랜덤생성


## 고려사항

- 공 위치 생성시 (0, 0)인 경우
- 생성할 때 겹치는 것

# java-calculator-precourse(문자열 덧셈 계산기)

`camp.nextstep.edu.missionutils.Console`의 `readLine()`으로 문자열을 입력받아, 기본/커스텀 구분자로 숫자를 분리하고 모두 더해 결과를 출력하는 콘솔 애플리케이션

## 요구 사항 상세

![SRS.png](study_archive/study_images/SRS.png)

## 기능 목록

### 입력

- Console.readLine()으로 한 줄 입력을 받는다.
    - 입력이 null인 경우 예외(IllegalArgumentException)를 발생

### 구분자 처리

- 기본 구분자는 `,`(콤마), `:`(콜론)이다.
- 입력이 맨 앞에서 `//x\n` 형식을 만족하면 `x`를 커스텀 구분자로 추가한다.
    - x는 정확히 1문자여야 한다. 아니면 예외 처리한다.
    - 헤더(`//x\n`)를 본문에서 제거한다.
- 커스텀 구분자가 없으면 기본 구분자만 사용한다.
- 구분자는 오직 구분자의 의미만을 가진다.

### 토큰화

- (기본+커스텀) 구분자 집합으로 문자열을 분리한다.
- 빈 토큰이 있으면 무시한다.

### 숫자 파싱

- 각 토큰을 Double.parseDouble()로 변환한다.
- 숫자 변환에 실패하면 IllegalArgumentException을 발생시킨다.
- Infinity, -Infinity, NaN은 예외(IllegalArgumentException)를 발생한다.

### 합산

- 모든 double 값을 합산한다.

### 출력

- 계산 결과를 표준 출력으로 출력한다.

## 시퀀스 다이어그램

![SequenceDiagram.png](study_archive/study_images/SequenceDiagram.png)

## 클라스 다이어그램

![ClassDiagram.png](study_archive/study_images/ClassDiagram.png)

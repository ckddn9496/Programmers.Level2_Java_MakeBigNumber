# Programmers.Level2_Java_MakeBigNumber

## 프로그래머스 Greedy > 큰 수 만들기

### 1. 문제 설명
문제: https://programmers.co.kr/learn/courses/30/lessons/42883

input으로 문자열 형식으로 숫자 number와 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하는 문제

### 2. 풀이
스택을 이용해서 간단히 풀 수 있다. ```char tok = number.charAt(i)``` 일때
* stack.isEmpty()

  > stack.push(tok)
  
* !stack.isEmpty()

  *  tok > stack.peek() => stack.pop()하며 위의 조건 반복
    
      > k--; k == 0 이면 중지하고 스택과 검사하지 않은 number의 문자들을 조합하여 가장 큰 숫자 return
    
  *  tok <= stack.peek()
      > stack.push(tok)

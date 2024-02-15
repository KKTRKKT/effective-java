package me.kktrkkt.effectivejava.etc.regular_expression;

/*
정규식 Pattern의 compile 작업은 비싼 작업이기 때문에 반복되는 경우에는 캐싱해서 재사용한다.

내부적으로 정규식 Pattern이 사용되는곳
    1. String.matches
    2. String.replaceFist
    3. String.replaceAll
    4. String.split

* 1문자 정규식일 경우 함수를 사용하는것이 빠르고, 2문자 이상일 경우에는 Pattern을 캐싱해 사용하는것이 빠르다.

 */
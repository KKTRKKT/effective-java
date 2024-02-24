package me.kktrkkt.effectivejava._8_avoid_finalizer_and_cleaner.autocloser;

// 자원 반납이 필요할 시 가장 권장하는 방법으로 AutoCloseable의 close를 구현하고 자원 반납 로직을 작성한다.
// try-resources 문법과 같이 사용하면 실행이 보장된다. 테스트코드 참조
public class AutoCloserExample implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("auto close");
    }
}

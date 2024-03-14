package me.kktrkkt.effectivejava._08_avoid_finalizer_and_cleaner.cleaner_as_a_saftynet;

import java.lang.ref.Cleaner;
import java.util.List;

// cleaner를 사용할 시 그나마 권장하는 방법으로 자원 반납용 안전망으로 사용한다.
// 자원 반납 안전망이란 객체가 AutoCloseable을 구현하지만
// 클라이언트가 try-with-resources 문법을 사용하지 않을 경우를 대비한 방법으로
// GC가 수거할때 자원을 같이 반납할 수 있도록 하는 방식이다.
public class CleanerSafetyNetExample implements AutoCloseable{

    private static final Cleaner cleaner = Cleaner.create();

    private static class ListCleaner implements Runnable{

        private List<Object> listToClean;

        public ListCleaner(List<Object> listToClean) {
            this.listToClean = listToClean;
        }

        @Override
        public void run() {
            listToClean = null;
            System.out.println("cleaned up");
        }
    }

    private List<Object> list;

    public CleanerSafetyNetExample(List<Object> list) {
        this.list = list;
        cleaner.register(this, new ListCleaner(list));
    }

    @Override
    public void close() throws Exception {
        System.out.println("closed");
    }
}

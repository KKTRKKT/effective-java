package me.kktrkkt.effectivejava._08_avoid_finalizer_and_cleaner.clenaer;

import java.util.List;

// cleaner는 java.lang.ref.Cleaner를 통해 객체가 GC에 의해 수거될 때 사용자가 만든 태스크를 같이 실행해준다.
// ListCleaner가 소멸시 진행할 작업이다. 테스트코드 참고
public class CleanerExample {

    private List<Object> list;

    public CleanerExample(List<Object> list) {
        this.list = list;
    }

    public static class ListCleaner implements Runnable{

        private List<Object> listToClean;

        public ListCleaner(List<Object> listToClean) {
            this.listToClean = listToClean;
        }

        public boolean isClean(){
            return listToClean == null;
        }

        @Override
        public void run() {
            listToClean = null;
            System.out.println("cleaned up");
        }
    }
}

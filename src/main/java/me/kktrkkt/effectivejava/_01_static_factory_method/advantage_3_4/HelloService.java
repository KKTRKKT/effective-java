package me.kktrkkt.effectivejava._1_static_factory_method.advantage_3_4;

public interface HelloService {

    void hello();

    // HelloService를 구현하는 하위 타입의 클래스를 생성해 반환한다.
    // 입력 매개변수에 따라 생성되는 클래스 객체가 달라진다.
    static HelloService of(String lang){
        if(lang.equals("kr")){
            return new KoreanHelloService();
        }else{
            return new EnglishHelloService();
        }
    }
}

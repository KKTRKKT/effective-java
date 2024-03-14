package me.kktrkkt.effectivejava._03_singleton._2_private_static_final;

import java.util.function.Supplier;

// Supplier를 사용하면 di, lazyinit, funtional style, reusability 등의 장점이 생긴다.
public class Concert {

    public void start(Supplier<Singer> singerSupplier){
        Singer singer = singerSupplier.get();
        singer.sing();
    }

    public static void main(String[] args) {
        Concert concert = new Concert();
        concert.start(MetaElvis::getInstance);
    }
}

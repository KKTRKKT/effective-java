package me.kktrkkt.effectivejava._03_singleton._3_enum;

import me.kktrkkt.effectivejava._03_singleton._2_private_static_final.Concert;
import me.kktrkkt.effectivejava._03_singleton._2_private_static_final.Singer;

public enum Elvis implements Singer {
    INSTANCE;

    @Override
    public void sing() {
        System.out.println("I'll have a blue- Christmas without you~");
    }

    public static void main(String[] args) {
        Concert concert = new Concert();
        concert.start(()->INSTANCE);
    }
}

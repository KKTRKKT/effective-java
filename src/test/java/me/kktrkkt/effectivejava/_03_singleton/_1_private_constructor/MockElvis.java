package me.kktrkkt.effectivejava._03_singleton._1_private_constructor;

import me.kktrkkt.effectivejava._03_singleton._1_public_static_final.IElvis;

public class MockElvis implements IElvis {
    @Override
    public void sing() {
        System.out.println("sing");
    }
}

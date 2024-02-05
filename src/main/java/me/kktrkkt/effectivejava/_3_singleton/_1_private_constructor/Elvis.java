package me.kktrkkt.effectivejava._3_singleton._1_private_constructor;

import java.io.Serial;
import java.io.Serializable;

// API에서 싱글톤임을 쉽게 알 수 있다.
public class Elvis implements Serializable, IElvis {

    public static final Elvis INSTANCE = new Elvis();

    private static boolean created;

//    private Elvis() {}

    // 최조 INSTANCE 생성 이후에는 생성자를 이용할 수 없다
    private Elvis() {
        if(created){
            throw new UnsupportedOperationException("Cannot be created by constructor");
        }
        created = true;
    }

    @Override
    public void sing() {
        System.out.println("I'll have a blue- Christmas without you~");
    }

    @Serial
    private Object readResolve() {
        return INSTANCE;
    }
}

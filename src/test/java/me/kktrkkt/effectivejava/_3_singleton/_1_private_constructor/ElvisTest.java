package me.kktrkkt.effectivejava._3_singleton._1_private_constructor;

import me.kktrkkt.effectivejava._3_singleton._1_private_constructor._1_public_static_final.Concert;
import me.kktrkkt.effectivejava._3_singleton._1_private_constructor._1_public_static_final.Elvis;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class ElvisTest {

    // 클라이언트 코드의 테스트 비용이 증가한다.
    @Test
    void clientTest() {
        Concert concert = new Concert(Elvis.INSTANCE);
        concert.perform();
    }

    // 비용이 적은 작업을 가진 구현 클래스로 교체한다.
    @Test
    void clientTest_solve() {
        Concert concert = new Concert(new MockElvis());
        concert.perform();
    }

    // 리플렉션으로 private 생성자를 호출한다.
//    @Test
//    void reflect() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        Constructor<Elvis> declaredConstructor = Elvis.class.getDeclaredConstructor((Class<?>[]) null);
//        declaredConstructor.setAccessible(true);
//        Elvis elvis = declaredConstructor.newInstance((Object[]) null);
//        assertNotEquals(Elvis.INSTANCE, elvis);
//    }

    // private 생성자에 생성됐는지 여부를 확인한다.
    @Test
    void reflect_solve() throws NoSuchMethodException {
        Constructor<Elvis> declaredConstructor = Elvis.class.getDeclaredConstructor((Class<?>[]) null);
        declaredConstructor.setAccessible(true);
        try {
            declaredConstructor.newInstance((Object[]) null);
        } catch (InstantiationException | InvocationTargetException | IllegalAccessException e) {
            assert e instanceof InvocationTargetException;
            InvocationTargetException e1 = (InvocationTargetException) e;
            assertInstanceOf(UnsupportedOperationException.class, e1.getTargetException());
        }
    }

    // 역직렬화할때 인스턴스를 생성한다
//    @Test
//    void deserializer() throws IOException, ClassNotFoundException {
//        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("elvis.obj"))){
//            out.writeObject(Elvis.INSTANCE);
//        }
//
//        try(ObjectInput in = new ObjectInputStream(new FileInputStream("elvis.obj"))){
//            Elvis elvis = (Elvis) in.readObject();
//            assertNotEquals(elvis, Elvis.INSTANCE);
//        }
//    }

    // private Object readResolve 메소드를 구현해 구현된 인스턴스를 반환한다.
    @Test
    void deserializer_solve() throws IOException, ClassNotFoundException {
        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("elvis.obj"))){
            out.writeObject(Elvis.INSTANCE);
        }

        try(ObjectInput in = new ObjectInputStream(new FileInputStream("elvis.obj"))){
            Elvis elvis = (Elvis) in.readObject();
            assertEquals(elvis, Elvis.INSTANCE);
        }
    }
}
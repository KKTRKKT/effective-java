package me.kktrkkt.effectivejava._33_consider_type_safe_heterogeneous_containers;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

// TypeReference는 추상클래스로 익명 클래스를 만들어 getGenericSuperclass으로 부모의 제네릭 타입을 추출해 구별한다.
public abstract class TypeReference<T> {
    private final Type type;

    protected TypeReference() {
        Type superclass = getClass().getGenericSuperclass();
        if (superclass instanceof ParameterizedType) {
            this.type = ((ParameterizedType) superclass).getActualTypeArguments()[0];
        } else {
            throw new RuntimeException("Invalid TypeReference; must specify type parameters.");
        }
    }

    public Type getType() {
        return this.type;
    }

    public static void main(String[] args) {
        TypeReference<List<String>> stringListType = new TypeReference<List<String>>() {};
        TypeReference<List<Integer>> integerListType = new TypeReference<List<Integer>>() {};

        System.out.println("Type for List<String>: " + stringListType.getType());
        System.out.println("Type for List<Integer>: " + integerListType.getType());
    }
}

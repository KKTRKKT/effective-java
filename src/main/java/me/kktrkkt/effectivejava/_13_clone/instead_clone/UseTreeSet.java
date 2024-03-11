package me.kktrkkt.effectivejava._13_clone.instead_clone;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// TreeSet 생성자를 통해 요소들을 복사할 수 있다.
public class UseTreeSet {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("effective");
        hashSet.add("java");
        System.out.println(hashSet);
        Set<Object> treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);
    }
}

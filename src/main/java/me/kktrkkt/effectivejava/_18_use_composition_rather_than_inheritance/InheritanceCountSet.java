package me.kktrkkt.effectivejava._18_use_composition_rather_than_inheritance;

import lombok.Getter;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

// 상속을 사용하면 수퍼클래스의 내부 구현에 영향을 받는다.
// 수퍼클래스의 메소드가 추가되면 알 수가 없다.
@Getter
public class InheritanceCountSet<E> extends HashSet<E> {

    private int addCount = 0;

    public InheritanceCountSet() {
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public static void main(String[] args) {
        final InheritanceCountSet<Integer> countSet = new InheritanceCountSet<>();
        countSet.addAll(List.of(1, 2, 3));
        System.out.println(countSet.getAddCount()); // 6
    }
}

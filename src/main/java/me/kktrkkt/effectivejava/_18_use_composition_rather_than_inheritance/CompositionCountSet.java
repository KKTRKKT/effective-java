package me.kktrkkt.effectivejava._18_use_composition_rather_than_inheritance;

import lombok.Getter;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 컴포지션을 구현한 ForwadingSet을 상속받아 사용한다
// 구현체를 주입받으므로 구현체의 구현이 변경되어도 내부 로직에 영향이 가지 않는다.
// 인터페이스가 변경되면 바로 알 수 있다.
@Getter
public class CompositionCountSet<E> extends ForwadingSet<E> {

    private int addCount;

    public CompositionCountSet(Set<E> set) {
        super(set);
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
        CompositionCountSet<Integer> countSet = new CompositionCountSet<>(new HashSet<>());
        countSet.addAll(List.of(1, 2, 3));
        System.out.println(countSet.getAddCount()); // 3
    }
}

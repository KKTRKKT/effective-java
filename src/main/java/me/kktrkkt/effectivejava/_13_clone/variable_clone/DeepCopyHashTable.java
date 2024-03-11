package me.kktrkkt.effectivejava._13_clone.variable_clone;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

// 가변객체의 clone을 구현할때 깊은 복사가 필요한 경우의 예제
public class DeepCopyHashTable implements Cloneable{

    private Entry[] buckets = new Entry[10];

    private static class Entry {
        final Object key;
        Object value;
        Entry next;

        public Entry(Object key, Object value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public void add(Object key, Object value) {
            this.next = new Entry(key, value, null);
        }

//        public Entry deepCopy() {
//            return new Entry(key, value, next == null ? null : next.deepCopy());
//        }

        // 재귀를 사용하면 스택오버플로 가능성이 있기 때문에 이터레이터를 추천
        public Entry deepCopy() {
            final Entry entry = new Entry(key, value, next);
            for(Entry e = entry.next; entry.next != null; e = e.next){
                e.next = new Entry(e.key, e.value, e.next);
            }
            return entry;
        }
    }

    @Override
    public DeepCopyHashTable clone(){
        final DeepCopyHashTable clone;
        try {
            clone = (DeepCopyHashTable) super.clone();
            final List<Entry> collect = Arrays.stream(clone.buckets)
                    .filter(Objects::nonNull)
                    .map(Entry::deepCopy)
                    .collect(Collectors.toList());
            clone.buckets = collect.toArray(new Entry[1]);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        DeepCopyHashTable hashTable = new DeepCopyHashTable();
        Entry entry = new Entry(new Object(), new Object(), null);
        hashTable.buckets[0] = entry;
        DeepCopyHashTable clone = hashTable.clone();
        System.out.println(hashTable.buckets[0] == entry);
        System.out.println(hashTable.buckets[0] == clone.buckets[0]);
    }
}

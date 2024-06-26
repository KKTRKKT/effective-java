package me.kktrkkt.effectivejava.etc.concurrent_modification_exception;

import java.util.ArrayList;
import java.util.List;

public class FailFast {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for(Integer i : list) {
           if(i == 3){
               list.remove(i); // ConcurrentModificationException 발생
           }
        }
    }
}

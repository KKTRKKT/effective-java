package me.kktrkkt.effectivejava._9_use_try_with_resources.tryfinally;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// 자원 반납할게 한 개일 경우에는 finally를 써도 코드가 많이 늘어나진 않는다.
public class TopLine {

    public static void main(String[] args) throws IOException {
        System.out.println(readTopLine("pom.xml"));
    }

    private static String readTopLine(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        try {
            return reader.readLine();
        } finally {
            reader.close();
        }
    }
}

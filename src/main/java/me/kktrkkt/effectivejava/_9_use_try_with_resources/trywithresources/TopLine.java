package me.kktrkkt.effectivejava._9_use_try_with_resources.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// try-with-resources를 사용하면 코드가 훨씬 간결해진다.
public class TopLine {

    public static void main(String[] args) throws IOException {
        System.out.println(readTopLine("pom.xml"));
    }

    private static String readTopLine(String path) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            return reader.readLine();
        }
    }
}

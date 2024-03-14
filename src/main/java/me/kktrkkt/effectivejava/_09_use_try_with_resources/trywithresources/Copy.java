package me.kktrkkt.effectivejava._09_use_try_with_resources.trywithresources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// try-with-resources는 여러개를 선언할 수 있고 close도 각기 실행되므로 이중 try문을 사용하지 않아도 된다.
public class Copy {

    private static final int BUFFER_SIZE = 8 * 1024;

    public static void copy(String src, String dst) throws IOException {
        try(FileInputStream in = new FileInputStream(src); FileOutputStream out = new FileOutputStream(dst)){
            byte[] buf = new byte[BUFFER_SIZE];
            while(in.read(buf) >= 0) {
                out.write(buf, 0, BUFFER_SIZE);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String src = "pom.xml";
        String dst = "newpom.xml";
        copy(src, dst);
    }
}

package me.kktrkkt.effectivejava._09_use_try_with_resources.tryfinally;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 자원 반납할게 여러개가 되면 finally를 쓰면 코드가 복잡해진다.
// * out이 반납하다 예외가 발생하면 in은 자원을 반납할 수 없기 때문에 따로 반납해준다.
public class Copy {

    private static final int BUFFER_SIZE = 8 * 1024;

    public static void copy(String src, String dst) throws IOException {
        FileInputStream in = new FileInputStream(src);
        try{
            FileOutputStream out = new FileOutputStream(dst);
            try{
                byte[] buf = new byte[BUFFER_SIZE];
                while(in.read(buf) >= 0) {
                    out.write(buf, 0, BUFFER_SIZE);
                }
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }

    public static void main(String[] args) throws IOException {
        String src = "pom.xml";
        String dst = "newpom.xml";
        copy(src, dst);
    }
}

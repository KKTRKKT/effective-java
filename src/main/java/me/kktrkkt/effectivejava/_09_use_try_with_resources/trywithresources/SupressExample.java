package me.kktrkkt.effectivejava._09_use_try_with_resources.trywithresources;

import java.io.CharConversionException;
import java.io.StreamCorruptedException;

// try-with-resources를 사용하면 try 내부에서 발생한 에러와 close중에 발생한 에러를 모두 보여준다.
// try finally는 마지막에 발생한 에러만 보여준다.
public class SupressExample implements AutoCloseable {

    public void readLine() throws CharConversionException {
        throw new CharConversionException();
    }

    @Override
    public void close() throws Exception {
        throw new StreamCorruptedException();
    }

    public static void main(String[] args) throws Exception {
        try{
            tryWithResourecse();
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            tryFinally();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void tryFinally() throws Exception {
        SupressExample supressExample = new SupressExample();
        try {
            supressExample.readLine();
        } finally {
            supressExample.close();
        }
    }

    private static void tryWithResourecse() throws Exception {
        try(SupressExample supressExample = new SupressExample()) {
            supressExample.readLine();
        }
    }
}

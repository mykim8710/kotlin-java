package exception;

import java.io.IOException;

public class JavaException {
    public static void main(String[] args) {
        JavaException javaException = new JavaException();

        try {
            javaException.throwException();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 코틀린에서 IOException을 발생시키는 함수를 자바에서 사용해도 예외처리가 강제되지 않는다
        KotlinException kotlinException = new KotlinException();
        try {
            kotlinException.throwException();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void throwException() throws IOException {
        throw new IOException("Checked Exception >> IO Exception 발생");
    }
}

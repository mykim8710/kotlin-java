package jvmstatic;

public class JvmStaticExample {
    public static void main(String[] args) {
        String hello = HelloClass.hello();
        System.out.println("hello = " + hello);

        String hi = HiObject.hi();
        System.out.println("hi = " + hi);
    }
}

package extensions;

public class JavaExtensionExample {
    public static void main(String[] args) {
        // 컴파일 오류
//        "ABCD".first();
//        "ABCD".addFirst('Z');

        MyExtensionKt.first("ABCD");
        //MyExtensionKt.addFirst("ABCD", 'Z');
        MyExtensionKt.addFirstChar("ABCD", 'Z');

    }
}

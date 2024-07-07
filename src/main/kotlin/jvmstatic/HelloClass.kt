package jvmstatic

class HelloClass {
    // companion 키워드를 사용해 클래스 내부에 객체 선언을 사용
    companion object {
        // 자바와 상호운용하는 경우, 자바의 static 메서드처럼 사용
        @JvmStatic
        fun hello(): String {
            return "Hello World!"
        }
    }
}

// 싱글톤 객체
object HiObject {
    @JvmStatic
    fun hi(): String {
        return "hi!"
    }
}

fun main() {
    // java의 static method와 유사
    val hello = HelloClass.hello()
    println(hello)

    val hi = HiObject.hi()
    println(hi)
}
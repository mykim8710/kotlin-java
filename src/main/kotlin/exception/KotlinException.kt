package exception

import java.io.IOException

class KotlinException {
    // 코틀린도 이와 마찬가지로 자바와의 상호 운용을 위한 @Throws 를 제공 >> 예외 전파
    @Throws(IOException::class)
    fun throwException() {
        throw IOException("Checked Exception >> IO Exception 발생");
    }
}

fun main() {
    val javaException = JavaException()
    javaException.throwException()

    val kotlinException = KotlinException()
    kotlinException.throwException()
}
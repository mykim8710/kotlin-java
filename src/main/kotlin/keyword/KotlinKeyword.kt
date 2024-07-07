package keyword

enum class CountryCodeKotlin {
    // 예를 들어 글로벌 서비스를 제공하는 회사에서 도미니카 공화국을 지원하기 위해 국가코드로 do 사용하는데 do는 do-while문 예약어
    // 자바로는 처리가 어렵지만 코틀린은 예약어 이스케이프가 가능하기 때문에 도미니카 공화국도 서비스 제공가능
    kr, jp, us, `do`;
}

fun main() {
    val javaKeyword = JavaKeyword()

    // 벡틱(`)문자를 사용해 해결
    javaKeyword.`in`
    javaKeyword.`is`



}
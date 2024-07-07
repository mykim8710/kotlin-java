package gettersetter;

fun main() {

    // 자바 스타일 : getter setter
    val person = Person()
    person.setName("mykim")
    person.setAge(36)
    person.setAddress("Seoul")

    println(person.getName())
    println(person.getAge())
    println(person.myAddress())


    // 코틀린 스타일 : 프로퍼티로 접근
    val person2 = Person()
    person2.name = "mykim"
    person2.age = 36

    println(person2.name)
    println(person2.age)


    // 프로퍼티가 없음에도 게터 메서드라면 프로퍼티처럼 사용 가능하다 >> UUID
    println(person2.uuid)


    // 세터가 있음에도(getter가 없다면) 컴파일 오류가 발생한다
//    person2.address = "Seoul"
//    println(person2.address)

    // address를 가져오는 메서드를 게터가 아닌 my로 했기때문에 세터도 생성되지 않는다
    person2.setAddress("newyork")
    person2.myAddress()
}
package gettersetter;
import java.time.LocalDate

class Student {
    // 가변변수
    @JvmField
    var name: String? = null
    var birthDate: LocalDate? = null

    // 불변변수 >> setter 사용 X
    val age : Int = 10

    var grade: String? = null
        private set // 내부에서만 setter 사용가능

    fun changeGrade(grade:String) {
        this.grade = grade
    }
}
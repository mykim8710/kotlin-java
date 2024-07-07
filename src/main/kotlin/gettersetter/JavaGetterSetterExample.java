package gettersetter;

import java.time.LocalDate;

public class JavaGetterSetterExample {
    public static void main(String[] args) {
        Student student = new Student();

        // setter
        //student.setName("mykim");
        student.name = "mykim"; // @JvmField, 코틀린방식으로 접근
        student.setBirthDate(LocalDate.of(1987, 10, 17));

        // gettter
        //String name = student.getName();
        String name = student.name;   // @JvmField, 코틀린방식으로 접근, getter setter를 만들지 않고 프로퍼티 접근
        System.out.println("name = " + name);

        LocalDate birthDate = student.getBirthDate();
        System.out.println("birthDate = " + birthDate);

        // student.setAge() // 불변변수, 컴파일오류
        int age = student.getAge();
        System.out.println("age = " + age);

        // student.setGrade() // 가변이지만 컴파일 오류
        student.changeGrade("1학년");
        String grade = student.getGrade();
        System.out.println("grade = " + grade);

    }
}

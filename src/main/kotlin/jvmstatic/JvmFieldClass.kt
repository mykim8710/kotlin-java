package jvmstatic

class JvmFieldClass {

    companion object {
        @JvmField
        val id: Int = 1234

        const val CODE = 1234
    }
}

object JvmFieldObject {
    @JvmField
    val name = "tony"

    const val FAMILY_NAME = "stark"
}

fun main() {
    val id = JvmFieldClass.id
    val name = JvmFieldObject.name
}
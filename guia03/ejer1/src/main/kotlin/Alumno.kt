class Alumno {
    var name: String = ""
    var grate: Float = 0.0F



    fun data() {
        println(" nombre del estudiante")
        name = readln()
        println(" nota del estudiate")
        grate = readln().toFloat()
    }
    fun validation() {
        if (grate >= 4) println("nota es regular")
    }
}
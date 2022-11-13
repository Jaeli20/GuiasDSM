class Empleado {

    var workers = mutableListOf<String>()
    var salaries = mutableListOf<Int>()
    var name = ""
    var salary = 0




    fun Workers() {
        var index = 1
        for (i in (1..3)) {
            println(" nombre del empleado: ")
            name = readln()
            workers.add(name)
            println(" sueldo del empleado: ")
            salary = readln().toInt()
            salaries.add(salary)
        }
        for (i in salaries) {
            println("Nombre $index: " + workers[i] + "sueldo: " + salaries[i])

            index++
        }
        val total = salaries.sum()
        println("Se gasta $total en sueldos")
    }
}
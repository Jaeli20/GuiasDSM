fun main(args: Array<String>) {

    var primero = 0
    var segundo = 0
    var tercero = 0

    println(" primer numero")
    primero = readln().toInt()
    println(" segundo numero")
    segundo = readln().toInt()
    println("tercer numero")
    tercero = readln().toInt()

    if (primero + segundo == tercero) {
        println("$tercero es igual a $primero + $segundo")
    } else {
        println("error")
    }
}
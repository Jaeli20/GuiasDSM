import java.time.LocalDateTime

fun main(args: Array<String>) {

    var year = 0
    var month = 0
    var day = 0
    val acYear = LocalDateTime.now()
    var date = 0
    var baby = 0

    do {

        println("Ingrese su dia de nacimiento")
        day = readln().toInt()
        if (day > 32) {
            println("Los meses solo tienen 31 dias")
        };if (day <= 0) {
            println("Los dias no pueden ser 0 o negativo")
        }
    } while (day > 32 || day <= 0)

    do {


        println("Ingrese su mes de nacimiento")
        month = readln().toInt()
        if (month > 12) {
            println("Los años solo tienen 12 meses")
        };if (month <= 0) {
            println("Los meses no pueden ser 0 o negativo")
        }
    } while ((month > 12) || (month <= 0))

    do {


        println("Ingrese su año de nacimiento")
        year = readln().toInt()
        if (year <= 0) {
            println("Los años no pueden ser negativos")
        }
    } while (year <= 0)

    date = (acYear.year - year)

    if (date == 0) {
        baby = acYear.monthValue - month
        println("Su fecha de nacimiento es $day,$month,$year y tiene " + baby + " meses")

    };if (date > 0) {
        println("Su fecha de nacimiento es $day,$month,$year y tiene " + date + " años")
    }


}
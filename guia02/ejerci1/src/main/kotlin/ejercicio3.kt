fun main(args: Array<String>) {

    var a = 0
    var b = 0


    println("Ingrese el primer numero")
    a= readln().toInt()

    println("Ingrese el segundo numero")
    b= readln().toInt()



    println("Los numeros son $a - $b")

    if ( a % b == 0){
        println("El primer numero es multiplo de $b")
    }else{
        println("$a no es multiplo de $b")
    }
}
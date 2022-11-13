fun main(args: Array<String>) {

    var a = 0
    var b = 0


    println("Ingrese el primer numero")
    a= readln().toInt()

    println("Ingrese el segundo numero")
    b= readln().toInt()



    println("Los numeros son $a - $b")

    if ( (a%2==0)&&(b%2==0)){
        println(" ambos son pares")
    };if ( (a%2!=0)&&(b%2!=0)){
        println(" ambos son impares")
    }else{
        println("no cumple uno es diferente del otro")
    }
}

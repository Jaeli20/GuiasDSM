import kotlin.math.sqrt

fun main(args: Array<String>) {

    var lado1 = 0.0F
    var lado2 = 0.0F
    var base = 0.0F
    var opcion = 0
    var perimetro = 0.0F

    do {
        println("Que perimetro desea calcular: \n" +
                "1. Equilatero\n" +
                "3. Isoceles\n" +
                "3. Rectangulo\n" +
                "4. Salir")
                opcion= readln().toInt()

        if (opcion == 1){
            println("Ingrese el lado")
            lado1= readln().toFloat()

            perimetro = 3 * lado1
            println("El perimetro del triangulo Equilatero de lado $lado1 es: $perimetro")
        };if (opcion == 2){
            println("Ingrese el lado")
            lado1= readln().toFloat()

            println("Ingrese la base")
            base= readln().toFloat()

            perimetro = (2*lado1)+base
            println("El perimetro del triangulo Isosceles de lado $lado1 y base $base es: $perimetro")
        };if (opcion == 3){
            println("Ingrese el lado 1")
            lado1= readln().toFloat()

            println("Ingrese lado 2")
            lado2= readln().toFloat()

            perimetro = (lado1 + lado2) + (sqrt(lado1*lado1)+(lado2*lado2))
            println("El perimetro del triangulo Isosceles de lado $lado1 y base $base es: $perimetro")
        }




    }while (opcion!=4)


}

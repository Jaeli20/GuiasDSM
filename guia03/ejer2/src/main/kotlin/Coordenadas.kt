class Coordenadas {
    var x: Int = 0
    var y: Int = 0


    fun data() {
        println(" punto y")
        y = readln().toInt()
        println(" punto x")
        x = readln().toInt()
    }
    fun validation() {


        if (x > 0 && y < 0) println("$x y $y pertenece a cuarto cuadrante")

        if (x < 0 && y > 0) println("$x y $y pertenece a segundo cuadrante")

        if (x < 0 && y < 0) println("$x y $y pertenece a tercer cuadrante")

        if (x > 0 && y > 0) println("$x y $y pertenece a primer cuadrante")
    }
}
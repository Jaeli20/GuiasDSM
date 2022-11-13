class Childrens {

    var ages = IntArray(5)

    fun data() {
        var w = 1
        for (i in 0..4) {
            print("edad $w:")
            ages[i] = readln().toInt()
            w++
        }

    }

    fun calculo() {

        var bandera = 1
        for (i in 0..4) {
            println("La edad $bandera es :" + ages[i])
            bandera++
        }

        val promedio: Int

        promedio = (ages.sum() / 5)
        println(" promedio de las edades : $promedio")

    }
}
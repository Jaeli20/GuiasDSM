    fun main(args: Array<String>) {

        var option = 0
        var option2 = 0


        do {
            println(
                "menu: \n" +
                        "1. Kg - libras\n" +
                        "2. Kg - onzas\n" +
                        "3. Kg - toneladas"
            )
            option = readln().toInt()

            do {
                if (option == 1) {
                    println("Ingrese los Kg")
                    val kilogramos = readln().toFloat()
                    val libras = kilogramos * 2.205
                    println("los $kilogramos kg en libras son $libras")
                    println(
                        "1. Calcular\n" +
                                "0. Salir"
                    )
                    option2 = readln().toInt()
                }
            } while (option2 != 0)

            do {
                if (option == 2) {
                    println("Ingrese los Kg")
                    val kilogramos = readln().toFloat()
                    val onzas = kilogramos * 35.274
                    println("los $kilogramos kg en onzas son $onzas")
                    println(
                        "1. Calcular \n" +
                                "0. Salir"
                    )
                    option2 = readln().toInt()
                }
            } while (option2 != 0)

            do {
                if (option == 3) {
                    println("Ingrese los Kg")
                    val kilogramos = readln().toFloat()
                    val toneladas = kilogramos / 1000
                    println("los $kilogramos kg en tonelada son $toneladas")
                    println(
                        "1. Calcular \n" +
                                "0. Salir"
                    )
                    option2 = readln().toInt()
                }
            } while (option2 != 0)


        } while (option != 4)

    }
class DadoRecuadro: Dado() {

    fun tirar2(){
        val asteriscos: MutableList<String> = mutableListOf()
        dado=(1..6).random()
        println("El numero es: $dado")

        var mensaje : String = "*"
        for (x in 1..dado){
            asteriscos.add("*")
        }

        println("$dado"+ " = "+asteriscos)
    }
}
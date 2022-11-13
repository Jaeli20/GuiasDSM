fun main(args: Array<String>) {
    val list = mutableListOf<Int>()


    for (x in (1..100)){
        var number =0
        number=(0..20).random()
        list.add(number)
    }
    val i = list.count { (it >= 1) && (it <= 4) }
    val x = list.count { (it >= 10) && (it <= 13) }

    if (list.contains(20)) {
        println("Existe el numnero 20 ")
    } else {
        println("No existe el numnero 20 ")
    }
    println(list.size)
    println( "Primero $i segundo $x" )

}
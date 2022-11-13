open class Dado {
    var dado = 0

   fun tirar(){
       dado = (1..6).random()
       println("El numero es: $dado")
   }

}
fun main(args: Array<String>) {

  var a = 0
  var b = 0
  var c = 0

  println("Ingrese el primer numero")
  a= readln().toInt()

  println("Ingrese el segundo numero")
  b= readln().toInt()

  println("Ingrese el tercer numero")
  c= readln().toInt()

  println("Los numeros son $a - $b - $c")

  if ( a > b && a > c){
    println("El mayor es $a")
  }; if ( b > a && b > c){
    println("El mayor es $b")
  }; if ( c > b && c > a){
    println("El mayor es $c")
  };
}
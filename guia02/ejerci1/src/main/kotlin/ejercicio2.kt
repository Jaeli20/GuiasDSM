fun main(args: Array<String>) {

                    var primer = 0
                    var segundo = 0
                    var tercero = 0

                    println(" primer numero")
                    primer = readln().toInt()

                    println(" segundo numero")
                    segundo = readln().toInt()

                    println(" tercer numero")
                    tercero = readln().toInt()

                    println("Sus numeros son $primer - $segundo - $tercero")

                    if (primer < segundo && primer < tercero) {
                        println("El menor es $primer")
                    }; if (segundo < primer && segundo < tercero) {
                        println("El menor es $segundo")
                    }; if (tercero < segundo && tercero < primer) {
                        println("El menor es $tercero")
                    };
}
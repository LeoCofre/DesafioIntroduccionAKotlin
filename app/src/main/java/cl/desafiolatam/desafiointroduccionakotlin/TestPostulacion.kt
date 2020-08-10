package cl.desafiolatam.desafiointroduccionakotlin

fun main() {
    val miNombre = "Leo Cofré"
    println("Mi nombre es: $miNombre ")

    val valorUno = 10
    val valorDos = 20
    val valorTres = 30
    val resultado = valorUno + valorDos + valorTres

    println("$valorUno + $valorDos + $valorTres = $resultado")

    val string: String
    var char: Char

    string = "Arataka Reigen"
    char = 'A'
    println("Valor de Char: $char")

    println("La variable string Tiene ${string.count()} caracteres")

    char = 'B'
    println("Nuevo valor de char $char")

    val float: Float
    float = 10f
    println("Valor de float: $float")

    val byteMaximo = Byte.MAX_VALUE
    println("Valor maximo de almacenamiento byte $byteMaximo")
    val shortMaximo = Short.MAX_VALUE
    println("Valor maximo de almacenamiento short $shortMaximo")

    val intMinimo = Int.MIN_VALUE
    println("Valor minimo de almacenamiento int $intMinimo")
    val longMinimo = Long.MIN_VALUE
    println("Valor minimo de almacenamiento long $longMinimo")

    val boleanV = true
    val boleanF = false

    println("Valor de boleanV es: $boleanV")
    println("Valor de boleanf es: $boleanF")

    fun imprimiendoParametros(parametroUno: String, parametroDos: String) {
        println("Total de caracteres parametroUno ${parametroUno.count()} ")
        println("Total de caracteres parametroDos ${parametroDos.count()} ")
    }
    println(imprimiendoParametros("Leonardo", "Cofré"))

    fun obtieneIVA(monto : Int) : Double {
        return monto*0.19

    }
     println("El valor del IVA para el valor ingresado es: ${obtieneIVA(100000)} ")

}





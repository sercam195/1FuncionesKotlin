fun main() {
    val variable1 = sumaIntegers(2, 3)
    val variable2 = sumaStrings("5", "6")
    diResultado(variable1, variable2)
}


fun sumaIntegers(int1 : Int, int2 : Int) : Double {
    return (int1+int2).toDouble()
}

fun sumaStrings(string1 : String, string2: String) : Double {
    return (string1.toInt()+string2.toInt()).toDouble()
}

fun diResultado(resultado1 : Double, resultado2 : Double){

    println("\nsumaIntegers ha devuelto $resultado1 y sumaStrings ha devuelto $resultado2")
}
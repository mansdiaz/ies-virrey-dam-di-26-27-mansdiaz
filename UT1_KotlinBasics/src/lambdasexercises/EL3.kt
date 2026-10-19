package lambdasexercises

fun main() {
    print("Introduce el primer número: ")
    val n1 = readln().toDouble()
    print("Introduce el segundo número: ")
    val n2 = readln().toDouble()
    print("Introduce el operador (+ - * /)")
    val op = readln()

    val sum = calculate(n1, n2, {n1, n2 -> n1+n2})
    val substract = calculate(n1, n2, {n1, n2 -> n1-n2})
    val multiply = calculate(n1, n2, {n1, n2 -> n1*n2})
    val divide = calculate(n1, n2, {n1, n2 -> n1/n2})

    when (op){
        "+" -> print(sum)
        "-" -> print(substract)
        "/" -> print(multiply)
        "*" -> print(divide)
        else -> print("No valido")
    }

}

//fun calculate(a:Double, b:Double, op:String):Double{
//    when (op){
//        "+" -> return a+b
//        "-" -> return a-b
//        "/" -> return a/b
//        "*" -> return a*b
//        else -> return 0.0
//    }
//}

fun calculate(a:Double, b:Double, operation:(Double, Double) -> Double):Double{
    return operation(a, b)
}




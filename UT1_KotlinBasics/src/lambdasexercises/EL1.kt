package lambdasexercises

fun main() {
    val square = { n: Int -> n * n }

    println(square(4))

    val isEven = { n: Int -> n % 2 == 0 }

    println(isEven(4))

    val fullName = {name:String, surname:String -> "$name $surname"}

    println(fullName("Nombre", "Apellido"))

    val printSeparator = {"--------------"}

    println(printSeparator())

}



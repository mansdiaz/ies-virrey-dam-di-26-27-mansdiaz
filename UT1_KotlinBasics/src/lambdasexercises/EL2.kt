package lambdasexercises

fun main(){

    val a: (Double) -> Double = {n -> n / 2}

    println(a(6.0))

    val b: (String) -> Int = {text -> text.length}

    println(b("Hola"))

    val c: (String, Int) -> String = {name:String, age:Int -> "$name is $age years old"}

    println(c("Alejandro", 19))

    val d: (Unit) -> Unit = {println("Loading...")}

    println(d)

    val e: (Int) -> Boolean =  {n:Int -> n in 1..10}

    println(e(4))



    fun calculate(a:Int, b:Int, operation:(Int, Int) -> Int):Int{
        return operation(a, b)

    }

    println(calculate(2, 2, {a, b -> a+b}))



}
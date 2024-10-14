fun hello() {
    println("Hello, world!")
}
//fun sum(x: Int, y: Int): Int {
//    return x + y
//}

// sum function can be shortened as
fun sum(x:Int, y:Int) = x + y
fun main() {
    hello()
    println(sum(1, 2))
    val upperCaseString = { text: String -> text.uppercase() }
    println(upperCaseString("hello"))

// pass lambda function into another function
    val number = listOf(1, -2, 3, -4, 5, -6)

    val positives = number.filter { x -> x > 0 }
    val isNegative = {x:Int -> x < 0}
    val negatives = number.filter(isNegative)

    println(positives)
    println(negatives)
}





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
    println(sum(1,2))
    val upperCaseString = { text : String -> text.uppercase()}
    println(upperCaseString("hello"))
}
// lamba function

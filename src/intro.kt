fun main() {
    println("Hello, world!")
    // Hello, world!
//    In Kotlin:
//
//    fun is used to declare a function
//
//    The main() function is where your program starts from
//
//    The body of a function is written within curly braces {}
//
//    println() and print() functions print their arguments to standard output
//    All programs need to be able to store data, and variables help you to do just that. In Kotlin, you can declare:
//
//    Read-only variables with val
//
//    Mutable variables with var
    val popcorn = 5    // There are 5 boxes of popcorn
    val hotdog = 7     // There are 7 hotdogs
    var customers = 10 // There are 10 customers in the queue

// Some customers leave the queue
    customers = 8
    println(customers)
// 8
//    Variables can be declared outside the main() function at the beginning
//    of your program.
//    Variables declared in this way are said to be declared at top level.
    println("There are $customers customers")
// There are 10 customers

    println("There are ${customers + 1} customers")
// There are 11 customers

    // here's a little exercise
//    Complete the code to make the program print "Mary is 20 years old" to standard output:
        val name = "Mary"
        val age = 20
        // Write your code here
}
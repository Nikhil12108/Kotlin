/*Every variable and data structure in Kotlin has a type.
 Types are important because they tell the compiler what you are allowed to do with that variable or data structure.
 In other words, what functions and properties it has.
 Kotlin was able to tell in the previous example that customers has type Int.
 Kotlin's ability to infer the type is called type inference.
 customers is assigned an integer value.
 From this, Kotlin infers that customers has a numerical type Int.
 As a result, the compiler knows that you can perform arithmetic operations with customers:*/

fun main() {
    var customers = 10

// Some customers leave the queue
    customers = 8

    customers += 3            // Example of addition: 11
    customers += 7            // Example of addition: 18
    customers -= 3            // Example of subtraction: 15
    customers *= 2            // Example of multiplication: 30
    customers /= 3            // Example of division: 10

    println(customers) // 10

    // Variable declared without initialization
    val d: Int
    d = 3
    // Variable explicitly typed and initialized
    val e: String = "Hello"
    // Variables can be read because they have been initialized
    println(d) // 3
    println(e) // hello

    // Variable declared without initialization
    val d: Int

// Triggers an error
    println(d)
// Variable 'd' must be initialized

     // here's a little exercise
    //Explicitly declare the correct type for each variable:
    val a: Int = 1000
    val b = "log message"
    val c = 3.14
    val f = 100_000_000_000_000
    val g = false
    val h = '\n'
}
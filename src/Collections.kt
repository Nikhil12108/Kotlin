//When programming, it is useful to be able to group data into structures for later processing. Kotlin provides collections for exactly this purpose.
//
//Kotlin has the following collections for grouping items:

//list: ordered collection of items

// sets: unique unordered collection of items

// maps: sets of key-value pairs where keys are unique and map to only one value

//Each collection type can be mutable or read only.

fun main() {
    // LISTS
    val readOnlyShapes = listOf("Triangle", "square","circle")
    println(readOnlyShapes)

    // Mutable list with explicit type declaration

    val shapes: MutableList<String> = mutableListOf("Triangle", "square","circle")
    println(shapes)
    shapes[0] = "pentagon" // access elements based on index
    println(shapes.last())
//        .last() functions is examples of extension functions. To call an extension function on an object, write the function name after the object appended with a period .
    println(shapes)
//    To prevent unwanted modifications, you can create a read-only view of a mutable list by assigning it to a
    val shapesLocked: List<String> = shapes
    //This is also called casting.


    // some more extension functions
        //. count
    val value = readOnlyShapes.count()
    println(value)

    // in operator
    println("circle" in readOnlyShapes)

    // .add
    shapes.add("hexagon")
    println(shapes)
    shapes.remove("square")
    print(shapes)

    // SET: unordered and unique
    val readOnlyFruits = setOf("apple", "banana", "cherry", "banana")
    val fruits: MutableSet<String> = mutableSetOf("apple", "banana")

    println("immutable set: $readOnlyFruits")
    //output -> [apple, banana, cherry], only one cherry came out
    //As sets are unordered, you can't access an item at a particular index.\
    // rest function are same as lists

    // map
    //Maps store items as key-value pairs. You access the value by referencing the key. You can imagine a map like a food menu. You can find the price (value), by finding the food (key) you want to eat. Maps are useful if you want to look up a value without using a numbered index, like in a list.
    val readOnlyJuiceMenu = mapOf("Apple" to 100, "kiwi" to 150, "orange" to 60)
    println(readOnlyJuiceMenu)

    val juiceMenu: MutableMap<String, Int> = mutableMapOf("Apple" to 100, "kiwi" to 150, "orange" to 60)
//  To access a value in a map, use the indexed access operator [] with its key:
    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")
    println("The value of pineapple juice is: ${readOnlyJuiceMenu["pineapple"]}")
// The value of pineapple juice is: null
    juiceMenu["coconut"] = 150
    println("The value of coconut juice is: ${juiceMenu["coconut"]}")
    // rest functions are same as list and set like remove count
    //To check if a specific key is already included in a map, use the .containsKey() function:
    println(readOnlyJuiceMenu.containsKey("kiwi"))
    //To obtain a collection of the keys or values of a map, use the keys and values properties respectively:
    println(readOnlyJuiceMenu.keys)
// [apple, kiwi, orange]
    println(readOnlyJuiceMenu.values)
// [100, 190, 100]
    //To check that a key or value is in a map, use the in operator:
    println("orange" in readOnlyJuiceMenu.keys)
// true
// Alternatively, you don't need to use the keys property
    println("orange" in readOnlyJuiceMenu)
// true
    println(200 in readOnlyJuiceMenu.values)
// false

    // here's a little exercise
    val greenNumbers = listOf(1, 4, 23);
    val redNumber = listOf(17,2);
   // print the sum of number of elements in green and red numbers


    // 2nd exercise:
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = // write here
//        You have a set of protocols supported by your server. A user requests to use a particular protocol. Complete the program to check whether the requested protocol is supported or not (isSupported must be a Boolean value).
    //println("Support for $requested: $isSupported")
}
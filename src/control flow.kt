//Like other programming languages, Kotlin is capable of making decisions based on whether a piece of code is evaluated to be true. Such pieces of code are called conditional expressions. Kotlin is also able to create and iterate through loops.
//If you have to choose between if and when, we recommend using when because it:
//
//Makes your code easier to read.
//
//Makes it easier to add another branch.
//
//Leads to fewer mistakes in your code.
fun main() {
    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }
    //There is no ternary operator condition ? then : else in Kotlin. Instead, if can be used as an expression. If there is only one line of code per action, the curly braces {} are optional:
    val a = 3
    val b = 2
    println(if(a > b) a else b) //return value = 3
//When﻿
//Use when, when you have a conditional expression with multiple branches.
//
//To use when:
//
//Place the value you want to evaluate within parentheses ().
//
//Place the branches within curly braces {}.
//
//Use -> in each branch to separate each check from the action to take if the check is successful.
//
//when can be used either as a statement or as an expression. A statement doesn't return anything but performs actions instead.
    val obj = "hello"

    when(obj) {
        "1" -> {
            println("this is one")
        }

        "hello" -> println("hello")

        else -> println("unknown")
    }
    //Note that all branch conditions are checked sequentially until one of them is satisfied. So only the first suitable branch is executed.\
    //An expression returns a value that can be used later in your code.
    //
    //Here is an example of using when as an expression. The when expression is assigned immediately to a variable which is later used with the println() function:
    val number = 1
    val result = when(number) {
        1 -> "one"
        2 -> "two"
        3 -> "three"
        else -> "its bigger then 3 or less then 1"
    }
    println(result)
    //This example uses a when expression without a subject to check a chain of Boolean expressions:
    val trafficLight = "red"

    val TrafficAction = when {
        trafficLight == "green" -> "go"
        trafficLight == "yellow" -> "slow down"
        trafficLight == "red" -> "stop"
        else -> "MAlFUNCTION"
    }
    println(TrafficAction)

    // the above code can also be written in better practice
    val trafficLightState = "Red" // This can be "Green", "Yellow", or "Red"

    val trafficAction = when (trafficLightState) {
        "Green" -> "Go"
        "Yellow" -> "Slow down"
        "Red" -> "Stop"
        else -> "Malfunction"
    }

    println(trafficAction)


    // ranges
    //  The most common way to create a range in Kotlin is to use the .. operator. For example, 1..4 is equivalent to 1, 2, 3, 4.
    //Before talking about loops, it's useful to know how to construct ranges for loops to iterate over.
    //
    //The most common way to create a range in Kotlin is to use the .. operator. For example, 1..4 is equivalent to 1, 2, 3, 4.
    //
    //To declare a range that doesn't include the end value, use the ..< operator. For example, 1..<4 is equivalent to 1, 2, 3.
    //
    //To declare a range in reverse order, use downTo. For example, 4 downTo 1 is equivalent to 4, 3, 2, 1.
    //
    //To declare a range that increments in a step that isn't 1, use step and your desired increment value. For example, 1..5 step 2 is equivalent to 1, 3, 5.
    //
    //You can also do the same with Char ranges:
    //
    //'a'..'d' is equivalent to 'a', 'b', 'c', 'd'
    //
    //'z' downTo 's' step 2 is equivalent to 'z', 'x', 'v', 't'

    // for loop
    for(number in 1..5) {
        println(number)
    }

    // collections can also be iterated over loops
    val cake = listOf("carrot", "cheese", "choclate")
    for(c in cake) {
        println("yummy its $c cake")
    }
    var cakesEaten = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }
    var cakesBaked = 0
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}


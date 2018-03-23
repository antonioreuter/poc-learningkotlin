package com.learn.kotlin.module1

import java.util.*

fun main(args:Array<String>) {
    ranges()
}


fun ranges() {
    var numbers = listOf(1,2,3,4,5)
    for (i in numbers) {
        println(i)
    }

    // with index
    for ((index, element) in numbers.withIndex())
        println("$element at position $index")

    var ages = TreeMap<String, Int>()
    ages["Kevin"] = 8
    ages["Sam"] = 15
    ages["Alex"] = 22
    ages["Harry"] = 40
    ages["Bill"] = 37

    for ((name, age) in ages) {
        println("$name is $age")
    }
}
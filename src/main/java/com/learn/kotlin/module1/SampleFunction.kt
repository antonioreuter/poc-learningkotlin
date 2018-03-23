@file:JvmName("DisplayFunctions")

package com.learn.kotlin.module1

fun main(args:Array<String>) {
    log(message = "Hello Kotlin!", logLevel = 3)
    log(logLevel = 7, message = "Hello Kotlin, again!")

    print(10 multi 4)
}

@JvmOverloads
fun log(message: String, logLevel: Int = 1) {
    println("$message - log level {$logLevel}")
}

//Extention function to Int class
infix fun Int.multi(multi:Int):Int {
    return this * multi
}
package com.learn.kotlin.module1

import java.math.BigInteger

fun main(args:Array<String>) {
    println(fib(10))
}

tailrec fun fib(count: Int, a:BigInteger = BigInteger.ONE, b:BigInteger = BigInteger.ZERO): BigInteger {
    when(count == 0) {
        true -> return b
        false -> return fib(count - 1, a + b, a)
    }
}
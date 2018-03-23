package com.learn.kotlin.module2

sealed class Operation {
    class Add(val value: Int):Operation()
    class Subtract(val value: Int):Operation()
    class Multiply(val value: Int):Operation()
    class Divide(val value: Int):Operation()
    object Increment : Operation()
    object Decrement : Operation()
}


fun execute(value:Int, op:Operation) = when(op) {
    is Operation.Add -> value + op.value
    is Operation.Subtract -> value - op.value
    is Operation.Multiply -> value * op.value
    is Operation.Divide -> value / op.value
    is Operation.Increment -> value + 1
    Operation.Decrement -> value -1
}

fun main(args:Array<String>) {
    println(execute(10, Operation.Add(15)))
    println(execute(15, Operation.Add(18)))
}
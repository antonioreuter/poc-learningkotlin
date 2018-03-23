package com.learn.kotlin.module1

fun main(args:Array<String>) {
    var h1 = Header("H1")
    var h2 = Header("H2")

    var h3 = h1 plus h2
    println(h3.name)

    var h4 = h1 + h2
    println(h4.name)
}


class Header(var name: String) {}

operator infix fun Header.plus(other: Header): Header {
    return Header(this.name + other.name)
}
package com.learn.kotlin.module1

fun main(args: Array<String>) {
    println("Hello world!")
    var q = Question() // mutable
    val q1 = Question() // immutable

    q1.answer = "4A"
    q1.display()
    println("The answer to the question ${q1.question} is ${q1.answer}")

   q1.printReult()

    val number:Int? = try {
        Integer.parseInt(q1.answer)
    } catch (e:NumberFormatException) {
        null
    }

    println("Number is $number")
}

class Question {
    var answer:String = ""
    val correctAnswer:String = "42"
    val question = "What is the answer to life, the universe and everything?"

    fun isCorrect():Boolean {
        return (answer == correctAnswer)
    }

    fun printReult() {
        when(answer) {
            correctAnswer -> println("You are correct!")
            else -> println("Try again?")
        }
    }

    fun display() {
        println("You said $answer")
    }
}
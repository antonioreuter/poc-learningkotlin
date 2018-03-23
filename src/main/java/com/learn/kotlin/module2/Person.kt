package com.learn.kotlin.module2

sealed class StudentType {
    class MathStudent
}

abstract class Person(val firstName: String, val lastName: String, val age: Int) {
    abstract fun nickName(): String

    fun fullName(): String {
        return "$firstName $lastName"
    }

    open fun display(): String {
        return "I am ${this.fullName()}, I am $age years old"
    }
}

class Employee(firstName:String, lastName:String, age: Int) : Person(firstName, lastName, age) {

    override fun nickName(): String {
        return this.firstName
    }

    override fun display(): String {
        return "Hello! I am an employee, ${super.display()}"
    }
}

open class Student(firstName:String, lastName:String, age: Int) : Person(firstName, lastName, age) {

    override fun nickName(): String {
        return this.firstName
    }

    override fun display(): String {
        return "Hello! I am a student, ${super.display()}"
    }

    open fun greeting():String {
        return "Hi five!"
    }
}

class MathStudent(firstName: String, lastName: String, age: Int, val year: Int): Student(firstName, lastName, age) {

    override fun display(): String {
        return "${super.display()} and I love math since ${this.year}"
    }

    override fun greeting():String {
        return "Hi PI!"
    }
}

class ScienceStudent(firstName: String, lastName: String, age: Int, val year: Int): Student(firstName, lastName, age) {

    override fun display(): String {
        return "${super.display()} I love science since ${this.year}."
    }
}

fun main(args: Array<String>) {
    val student = Student("John", "Doe", 32)
    println(student.display())

    val mathStudent = MathStudent("Steve", "Johnson", 41, 1983)
    println(mathStudent.display())
}
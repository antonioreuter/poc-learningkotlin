package com.learn.kotlin.module2

interface Time {
    fun setTime(hours: Int, mins: Int = 0, secs: Int = 0)
    fun setTime(time: KevinTime) = setTime(time.hours)
}

interface GlobalTime {
    fun setTime(hours: Int, mins: Int, secs: Int)
    fun setTime(time: KevinTime) = setTime(time.hours, time.mins, time.seconds)
}

class KevinTime {
    var hours: Int = 0
    var mins: Int = 0
    var seconds: Int = 0
}

class YetiTime : Time, GlobalTime {
    override fun setTime(time: KevinTime) {
        super<GlobalTime>.setTime(time)
    }

    override fun setTime(hours: Int, mins: Int, secs: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

fun main(args: Array<String>) {

}

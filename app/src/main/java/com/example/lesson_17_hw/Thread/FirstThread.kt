package com.example.lesson_17_hw.Thread

class FirstThread : Thread() {

    override fun run() {
        for (i in 0..1000) {
            println("Thread that is made by the 1 way! $i")
        }
    }
}
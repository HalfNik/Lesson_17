package com.example.lesson_17_hw.Runnable

class FourthRunnable : Thread() {

    override fun run() {
        for (i in 0..1000) {
            println("Thread that is made by the second way! $i")
        }
    }
}
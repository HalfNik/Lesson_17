package com.example.lesson_17_hw.Thread

class SecondThread : Thread() {

    override fun run() {
        for (i in 0..1000) {
            println("The first thread is working! $i")
        }
    }
}
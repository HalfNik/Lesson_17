package com.example.lesson_17_hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.example.lesson_17_hw.Runnable.FourthRunnable
import com.example.lesson_17_hw.Runnable.ThirdRunnable
import com.example.lesson_17_hw.Thread.FirstThread
import com.example.lesson_17_hw.Thread.SecondThread
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Способ - 1

        val firstThread = FirstThread()
        val secondThread = SecondThread()

        firstThread.start()
        secondThread.start()

        //Способ - 2

        val thirdRunnable = Thread(ThirdRunnable())
        val fourthRunnable = Thread(FourthRunnable())

        thirdRunnable.start()
        fourthRunnable.start()

        //Способо - 3

        val fifthThread = Thread {
            for (i in 0..1000) {
                println("Thread that is made by the third way! $i")
            }
        }

        val sixthThread = Thread {
            for (i in 0..1000) {
                println("Thread that is made by the 3 way! $i")
            }
        }

        fifthThread.start()
        sixthThread.start()

        //Способо - 4

        thread (start = true) {
            for (i in 0..1000) {
                println("Thread that is made by the fourth way! $i")
            }
        }

        thread (start = true)
        for (i in 0..1000) {
            println("Thread that is made by the 4 way! $i")
        }
    }
}
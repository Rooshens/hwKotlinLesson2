package qr.a.rooshen.hwkotlinlesson2

import android.util.Log

class Dog : Animal() {
    override fun voice() {
        Log.d("hwKotlinLesson2", "Woof-woof-woof")
    }

    fun bite() {
        Log.d("hwKotlinLesson2", "Im biting")
    }
}
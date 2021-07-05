package qr.a.rooshen.hwkotlinlesson2

import android.util.Log

class Cat : Animal() {
    override fun voice() {
        Log.d("hwKotlinLesson2", "Meow-meow-meow")
    }

    fun scratch() {
        Log.d("hwKotlinLesson2", "Im scratching")
    }
}
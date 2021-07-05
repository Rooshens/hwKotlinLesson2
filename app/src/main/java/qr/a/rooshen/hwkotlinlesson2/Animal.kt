package qr.a.rooshen.hwkotlinlesson2

import android.util.Log

abstract class Animal {
    open fun voice() {
        Log.d("hwKotlinLesson2", "Voice")
    }
}
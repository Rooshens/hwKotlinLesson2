package qr.a.rooshen.hwkotlinlesson2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cat: Animal = Cat()
        val dog: Animal = Dog()

        dog.voice()
        cat.voice()

        if (dog is Dog) {
            dog.bite()
        }
        if (cat is Cat) {
            cat.scratch()
        }
    }
}
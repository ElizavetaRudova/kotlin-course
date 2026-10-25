package org.example.lessons.lesson14.homeworks

class Emotion (val type: String, val intensity: Int) {
    fun express() {
            println("Эмоция: $type, интенсивность: $intensity из 10.")
        }
    }

fun main() {
    val myemotion = Emotion("positive", 9)
    myemotion.express()
}
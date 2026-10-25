package org.example.lessons.lesson14.homeworks

object Moon {
    val isVisible: Boolean = false
    val phase: String = "New Moon"
    fun showPhase() {
        if (isVisible == true) {
            println("Фаза луны: $phase")
        } else {
                println("Луна не видна")
            }
        }
    }

fun main() {
    Moon.showPhase()
}
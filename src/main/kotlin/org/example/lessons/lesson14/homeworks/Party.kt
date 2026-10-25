package org.example.lessons.lesson14.homeworks

import org.example.lessons.lesson03.homework.details

class Party (val location: String, var attendees: Int){
    fun details() {
        println("Встречаемся в $location составом в $attendees человек")
    }
}

fun main() {
    val myParty = Party("Кафе", 20)
    myParty.details()
}
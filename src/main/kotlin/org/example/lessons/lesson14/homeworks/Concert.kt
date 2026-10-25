package org.example.lessons.lesson14.homeworks

class Concert (
    val group: String,
    val venue: String,
    var price: Int,
    val hallCapacity: Int,
    private var ticketsSold: Int = 0) {
    fun buyTicket() {
        if (ticketsSold < hallCapacity) {
            ticketsSold++
            println("Билет успешно куплен! Осталось мест: ${hallCapacity - ticketsSold}")
        } else {
            println("Извините, все билеты на концерт группы $group распроданы!")
        }
    }

    fun info() {
        println("Концерт группы $group в $venue, стоимость билетов $price. Осталось ${hallCapacity - ticketsSold} мест")
    }
}
    fun main() {
        val concert = Concert("Тату", "Лужники", 5000, 1000)
        concert.info()
        concert.buyTicket()
    }


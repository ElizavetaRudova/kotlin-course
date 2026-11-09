package org.example.lessons.lesson18.homeworks

class Oven : SmartThermalDevice(), Timable {
    override fun setTimer(time: Int) {
        if (!isPoweredOn) {
            println("Ошибка: духовка выключена, таймер не работает")
            return
        }
        println("Таймер духовки установлен на $time минут")
    }
}
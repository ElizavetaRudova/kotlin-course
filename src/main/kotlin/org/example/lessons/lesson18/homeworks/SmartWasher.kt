package org.example.lessons.lesson18.homeworks

class SmartWasher : SmartThermalDevice(), WaterContainer, Drainable {
    override val capacity: Int = 5

    override fun fillWater(amount: Int) {
        println("Стиралка набирает $amount литров воды")
    }

    override fun getWater(amount: Int) {
        println("Стиралка использует $amount литров воды")
    }

    override fun connectToDrain() {
        println("Стиралка подключена к канализации")
    }

    override fun drain() {
        println("Стиралка сливает грязную воду")
    }
}
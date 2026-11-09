package org.example.lessons.lesson18.homeworks

class Kettle : SmartThermalDevice(), WaterContainer {
    override val capacity: Int = 2 // Максимальный объем чайника

    override fun fillWater(amount: Int) {
        println("В чайник налито $amount литров воды (максимум $capacity)")
    }

    override fun getWater(amount: Int) {
        println("Из чайника вылито $amount литров воды")
    }
}
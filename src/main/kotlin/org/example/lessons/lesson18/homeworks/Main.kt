package org.example.lessons.lesson18.homeworks

fun main() {
    println("--- ХОЛОДИЛЬНИК ---")
    val fridge = Fridge()
    fridge.setTemperature(5)

    fridge.powerOn()
    fridge.setTemperature(5)
    fridge.open()
    fridge.programAction("Быстрое охлаждение")
    fridge.execute()

    println("\n--- ЧАЙНИК ---")
    val kettle = Kettle()
    kettle.powerOn()
    kettle.fillWater(1)
    kettle.setTemperature(100)
    kettle.powerOff()

    println("\n--- ДУХОВКА ---")
    val oven = Oven()
    oven.powerOn()
    oven.setTimer(45)

    println("\n--- СТИРАЛЬНАЯ МАШИНА ---")
    val washer = SmartWasher()
    washer.powerOn()
    washer.fillWater(3)
    washer.drain()
}
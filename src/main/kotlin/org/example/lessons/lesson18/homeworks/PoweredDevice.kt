package org.example.lessons.lesson18.homeworks

abstract class PoweredDevice : Powerable {
    var isPoweredOn = false
        private set

    override fun powerOn() {
        if (isPoweredOn) {
            println("Устройство уже включено")
            return
        }
        isPoweredOn = true
        println("Устройство включено")
    }

    override fun powerOff() {
        if (!isPoweredOn) {
            println("Устройство уже выключено")
            return
        }
        isPoweredOn = false
        println("Устройство выключено")
    }
}
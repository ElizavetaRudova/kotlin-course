package org.example.lessons.lesson17.homeworks

//Игровой автомат
//Опиши схематически класс игрового автомата,
// правильно расставив объявление полей (val или var) и методов
// (аргументы и возвращаемые значения), включая модификаторы доступа
// (private для приватных)

class SlotMachine() {
    val color = "Серый" //цвет
    val model = "Xiaomi" //модель
    private var poweredOn = false //включен
    private var osLoaded = false //ОС загружена
    private val gameList = mutableListOf("Tetris", "Mario") //список установленных игр
    val hasGamepad = true //наличие джойстика
    private var balance: Double = 800.00 //баланс вырученных средств
    val owner = "Владелец" //владелец
    var supportPhone = "89998889988"
        private set //телефон поддержки.
    private var gamingPaid = false //игровой сеанс оплачен
    private var costGamingSession = 100 //стоимость одного игрового сеанса
    private var pin: String = "0000" //пин-код автомата

    //включить
    fun turnOn() {
        if (poweredOn) {
            println("Автомат уже включен")
            return
        }
        poweredOn = true
        loadOs()
        println("Автомат включен")
    }

    //выключить
    fun turnOff() {
        if (!poweredOn) {
            println("Автомат уже выключен")
            return
        }
        shutdownOs()
        poweredOn = false
        println("Автомат выключен")
    }

    //загрузить ОС
    private fun loadOs() {
        if (!poweredOn) {
            println("Ошибка: автомат выключен")
            return
        }
     osLoaded = true
            println("ОС загружена")
    }

    //завершить работу ОС
    private fun shutdownOs() {
        if (!osLoaded) {
            println("ОС и так не работает")
            return
        }
        osLoaded = false
        println("Работа ОС завершена")
    }

    //показать список игр
    fun showGameList(): List<String> {
        return gameList.toList()
    }

    //включить игру
    fun startGame(gameName: String) {
        if (!poweredOn) {
            println("Ошибка: автомат выключен!")
            return
        }
        if (!osLoaded) {
            println("Ошибка: ОС не загружена!")
            return
        }
        if (!gamingPaid) {
            println("Ошибка: игра не оплачена!")
            return
        }
        if (gameName !in gameList) {
            println("Ошибка: игра отсутствует")
            return
        }
        gamingPaid = false
        balance += costGamingSession
        println("Игра ${gameName} началась")
    }

    //оплатить игровой сеанс
    fun processPayment(money: Double) {
        if (money < costGamingSession) {
            println("Ошибка: недостаточно денег. Нужно: $costGamingSession")
            return
        }
        gamingPaid = true
        balance += money
        println("Оплата прошла успешно. Можно играть!")
    }


    //забрать наличные с помощью пин-кода
    fun withdrawCashWithPin(inputPin: String): Double {
        if (inputPin != pin) {
            println("Ошибка: неверный пин-код")
            return 0.0
        }
        // Если пин верный, идем в сейф за деньгами
        return openSafeAndDispenseCash()
    }
    //открыть сейф и выдать наличные
    private fun openSafeAndDispenseCash(): Double {
        val cash = balance
        balance = 0.0
        println("Сейф открыт. Выдано наличных: $cash")
        return cash
    }
}

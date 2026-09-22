package org.example.lessons.lesson06.homeworks

fun main() {
    example1 (month = 12)
    example2 (age = 2.7)
    example3 (length = 4.0)
    example4(sum = 500)
    example5(extension = "txt")
    example6(value = 12.0, unit = 'C')
    example7(temp = 24)
    example8(ageRating = 23)
}

fun example1(month: Int) {
    when (month) {
        12, 1, 2 -> println("Зима")
        3, 4, 5  -> println("Весна")
        6, 7, 8  -> println("Лето")
        9, 10, 11 -> println("Осень")
    else -> println("Ошибка: Месяца с номером $month не существует. Введите число от 1 до 12.")
    }
}
fun example2(age: Double) {
    when {
        age in 0.0..2.0 -> println(age * 10.5)
        age > 2 -> println(21.0 - (age - 2.0) * 4.0)
        else -> println("Неверный возраст")
    }
}
    fun example3(length: Double) {
        if (length <= 1) {
            println("Пешком")
        } else if (length <= 5.0) {
            println("Велосипед")
        } else {
            println("Автотранспорт")
        }
    }
fun example4(sum: Int) {
    when {
        sum <= 1000 -> println ((sum / 100) * 2)
        sum > 1000 -> println ((sum / 100) * 3)
        else -> println("Ошибка. Сумма покупки не может быть меньше 0")
    }
}
fun example5(extension: String) {
    when (extension){
        "txt", "pdf" -> println("Текстовый документ")
        "jpg", "png" -> println("Изображение")
        "xlsx", "xls" -> println("Таблица")
        else -> println("Неизвестный тип")
    }
}
fun example6(value: Double, unit: Char) {
    when (unit) {
        'C' -> {
            val fahrenheit = (value * 9 / 5) + 32
            print(fahrenheit)
            print("F")
            println()
        }

        'F' -> {
            val celsius = (value - 32) * 5 / 9
            print(celsius)
            print("C")
            println()
        }
        else -> println("Ошибка: неизвестная единица измерения")
    }
}
fun example7(temp: Int) {
    if (temp < -30 || temp > 35) {
        println("Оставайтесь дома! Не выходите на улицу.")
    } else if (temp < 10) {
            println("куртка и шапка")
    } else if (temp in 10..18) {
            println("ветровка")
   } else if (temp > 18) {
            println("футболка и шорты")
   } else {
            println("Апокалипсис")
        }
    }
private fun example8(ageRating: Int) {
    if (ageRating < 0) {
        println("Некорректный возраст")
    }
if (ageRating >= 0) {
    println("детские")
}
    if (ageRating >= 10) {
        println("подростковые")
    }
        if (ageRating >= 18) {
            println("взрослые")
        }
    }


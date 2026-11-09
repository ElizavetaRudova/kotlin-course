package org.example.lessons.org.example.lessons
//Переопределение методов
//Базовый Класс MusicalInstrument: Создайте базовый класс для музыкальных инструментов с методом playNote(), который принимает название ноты.
//
//Производные Классы: Разработайте несколько производных классов для конкретных инструментов (например, Violin, Cello, Flute, Drum). В каждом классе реализуйте метод playNote(), чтобы он выводил в консоль уникальное сообщение о том, как этот инструмент играет данную ноту.
//
//Демонстрация Полиморфизма: Создайте массив или список объектов MusicalInstrument, включающий разные инструменты. Пройдитесь по массиву и вызовите метод playNote() для каждого инструмента, демонстрируя, как один и тот же метод может быть реализован по-разному.
//
//Для стилизации вывода “звука” разных музыкальных инструментов используем цвет.

object Colors {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[30m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"
}
object Background {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[40m"
    const val RED = "\u001B[41m"
    const val GREEN = "\u001B[42m"
    const val YELLOW = "\u001B[43m"
    const val BLUE = "\u001B[44m"
    const val PURPLE = "\u001B[45m"
    const val CYAN = "\u001B[46m"
    const val WHITE = "\u001B[47m"
}
fun printColored(text: String, color: String, backgroundColor: String = "") {
    println("$color$backgroundColor$text${Colors.RESET}")
}
abstract class MusicalInstrument {
    abstract fun playNote(note: String)
    protected fun shortNote(note: String, color: String, backgroundColor: String = "") {
        printColored("Play short note $note", color, backgroundColor)
    }
    protected fun longNote(note: String, color: String, backgroundColor: String = "") {
        printColored("Play long note $note", color, backgroundColor)
    }
}
class Violin : MusicalInstrument() {
    override fun playNote(note: String) {
        longNote(note, Colors.RED)
    }
}
class Drum : MusicalInstrument() {
    override fun playNote(note: String) {
        shortNote(note, Colors.BLACK, Background.WHITE)
    }
}
 class Flute : MusicalInstrument() {
     override fun playNote(note: String) {
         longNote(note, Colors.PURPLE, Background.YELLOW)
     }
 }
class Calculator {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }
    fun sum(a: Double, b: Double): Double {
        return a + b
    }
    fun sum(list: List<Int>): Int {
        return list.sum()
    }
    fun sum(array: Array<Int>): Int {
        return array.sum()
    }
    fun sum(a: Int, vararg b: Int): Int {
        return b.sum() + a
    }
}
class Printer {
    fun print(text: String) {
        println(text)
    }
    fun print(text: String, color: String) {
        printColored(text, color)
    }
    fun print(text: String, color: String, backgroundColor: String) {
        printColored(text, color, backgroundColor)
    }
    fun print(array: Array<String>) {
        for (text in array)
            println(text)
    }
    fun print(pairs: List<Pair<String, String>>) {
        pairs.forEach {
            printColored(it.first, it.second)
        }
    }
}

fun main() {
    val violin: Violin = Violin()
    violin.playNote("do")

    val drum: Drum = Drum()
    drum.playNote("Fa")
    val flute: Flute = Flute()
    flute.playNote("Re")

    val orchestr: List<MusicalInstrument> = listOf(violin, drum, flute)
    val notes: List<String> = listOf("Do", "Re", "Mi")
    notes.forEach { note ->
        orchestr.forEach {
            it.playNote(note)
            val i = it
        }
    }
    val calculator = Calculator()
    calculator.sum(5, 3)
}
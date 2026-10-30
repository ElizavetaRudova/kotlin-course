package org.example.lessons.lesson16.homeworks

abstract class Printer() {
    abstract fun printDocument(text: String)
}

class Laser : Printer() {
    override fun printDocument(text: String) {
        val words = text.split(" ")
        for (word in words) {
            if (word.isNotEmpty()) {
                printColored(" $word ", Colors.BLACK, Background.WHITE) // Добавил пробелы для красоты
            }
        }
    }
}

class Inkjet : Printer() {
    private val colorPairs = listOf(
        Pair(Colors.RED, Background.WHITE),
        Pair(Colors.GREEN, Background.BLACK),
        Pair(Colors.YELLOW, Background.BLUE),
        Pair(Colors.CYAN, Background.PURPLE),
        Pair(Colors.WHITE, Background.RED),
        Pair(Colors.BLACK, Background.YELLOW)
    )

    override fun printDocument(text: String) {
        val words = text.split(" ")
        words.forEachIndexed { index, word ->
            if (word.isNotEmpty()) {
                val colorIndex = index % colorPairs.size
                val pair = colorPairs[colorIndex]
                printColored(" $word ", pair.first, pair.second)
            }
        }
    }
}

fun main() {
    println("--- Лазерный принтер ---")
    val laser = Laser()
    laser.printDocument("Лазерный принтер печатает хорошо")

    println("\n--- Струйный принтер (проверка на длинном тексте) ---")
    val inkjet = Inkjet()
    val longText = "Струйный принтер печатает каждое слово своим уникальным цветом и фоном этот текст достаточно длинный чтобы цикл цветов повторился несколько раз"
    inkjet.printDocument(longText)
}
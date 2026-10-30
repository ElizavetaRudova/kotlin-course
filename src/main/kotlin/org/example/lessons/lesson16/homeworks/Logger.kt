package org.example.lessons.lesson16.homeworks

class Logger {
    fun log(prefix: String, message: String) {
        when (prefix.uppercase()) {
            "WARNING" -> printColored("[$prefix] $message", Colors.YELLOW)
            "ERROR" -> printColored("[$prefix] $message", Colors.WHITE, Background.RED)
            "DEBUG" -> printColored("[$prefix] $message", Colors.CYAN)
            "INFO" -> printColored("[$prefix] $message", Colors.GREEN)
            else -> println("[$prefix] $message")
        }
    }
    // 2. Перегрузка: принимает список сообщений (все с уровнем INFO)
    fun log(messages: List<String>) {
        for (msg in messages) {
            log("INFO", msg)
        }
    }

    // 3. Перегрузка: принимает Exception (выводит message с префиксом ERROR)
    fun log(exception: Exception) {
        val errorMessage = exception.message ?: "Неизвестная ошибка"
        log("ERROR", errorMessage)
    }
}

fun main() {
    val logger = Logger()

    println("--- Тест 1: Разные уровни ---")
    logger.log("INFO", "Система запущена")
    logger.log("DEBUG", "Подключение к БД...")
    logger.log("WARNING", "Заканчивается место на диске")
    logger.log("ERROR", "Не удалось сохранить файл")

    println("\n--- Тест 2: Список сообщений ---")
    logger.log(listOf("Пользователь зашел", "Пользователь вышел"))

    println("\n--- Тест 3: Исключение ---")
    logger.log(Exception("Ошибка 404: Страница не найдена"))
}
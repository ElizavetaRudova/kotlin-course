package org.example.lessons.lesson08.homeworks

// 1
fun transformPhrase(phrase: String): String {
    return when {
        phrase.contains("невозможно") ->
            phrase.replace("невозможно", "совершенно точно возможно, просто требует времени")

        phrase.startsWith("Я не уверен") ->
            phrase + ", но моя интуиция говорит об обратном"

        phrase.contains("катастрофа") ->
            phrase.replace("катастрофа", "интересное событие")

        phrase.endsWith("без проблем") ->
            phrase.replace("без проблем", "с парой интересных вызовов на пути")

        phrase.trim().split(" ").size == 1 ->
            "Иногда, $phrase, но не всегда"

        else -> phrase
    }
}

// 2
fun printDateTimeFromLog(log: String) {
    val rightPart = log.substring(log.indexOf("->") + 2).trim()
    val parts = rightPart.split(" ")
    when {
        parts.size == 2 -> {
            println(parts[0])
            println(parts[1])
        }
    }
}

// 3
fun maskCard(card: String): String {
    var totalDigits = 0
    for (ch in card) {
        when {
            ch.isDigit() -> totalDigits++
        }
    }

    var current = 0
    var result = ""
    for (ch in card) {
        when {
            ch.isDigit() -> {
                current++
                result += when {
                    current <= totalDigits - 4 -> "*"
                    else -> ch.toString()
                }
            }
            else -> result += ch
        }
    }
    return result
}

// 4
fun formatEmail(email: String): String {
    return when {
        email.contains("@") && email.contains(".") ->
            email.replace("@", " [at] ").replace(".", " [dot] ")
        else -> email
    }
}

// 5
fun extractFileName(path: String): String {
    val parts = path.split("/")
    return when {
        parts.size > 1 -> parts[parts.size - 1]
        else -> path
    }
}

// 6
fun makeAbbreviation(phrase: String): String {
    val words = phrase.split(" ")
    var result = ""
    for (word in words) {
        when {
            word.isNotEmpty() -> result += word.substring(0, 1).uppercase()
        }
    }
    return result
}
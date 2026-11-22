package org.example.lessons.lesson22.homeworks

//Воспроизвести фрагменты кода, которые могут привести к возникновению исключений:
//1. NullPointerException
//2. IndexOutOfBoundsException
//3. ClassCastException
//4. IllegalArgumentException
//5. NumberFormatException
//6. IllegalStateException
//7. OutOfMemoryError
//8. StackOverflowError
//Задание 9. Оберни все вызовы из предыдущего задания в блок try-catch и создай для каждого типа ошибки свой catch блок

fun main() {
    // 1. NullPointerException
    try {
        val arg1: Int? = null
        println(arg1 as Int)
    } catch (e: NullPointerException) {
        println("1. Обработано: NullPointerException")
    }
    // 2. IndexOutOfBoundsException
    try {
        val arg2: Array<Int> = arrayOf(1, 2, 3)
        println(arg2[7])
    } catch (e: IndexOutOfBoundsException) {
        println("2. Обработано: IndexOutOfBoundsException")
    }
    // 3. ClassCastException
    try {
        val arg3: String = "String"
        println(arg3 as Int)
    } catch (e: ClassCastException) {
        println("3. Обработано: ClassCastException")
    }
    // 4. IllegalArgumentException
    try {
        arg4(12)
    } catch (e: IllegalArgumentException) {
        println("4. Обработано: IllegalArgumentException")
    }
    // 5. NumberFormatException
    try {
        val arg5: String = "10.2"
        println(arg5.toInt())
    } catch (e: NumberFormatException) {
        println("5. Обработано: NumberFormatException")
    }
    // 6. IllegalStateException
    try {
        Arg6(8)
    } catch (e: IllegalStateException) {
        println("6. Обработано: IllegalStateException")
    }
    // 7. OutOfMemoryError
    try {
        arg7()
    } catch (e: OutOfMemoryError) {
        println("7. Обработано: OutOfMemoryError")
    }
    // 8. StackOverflowError
    try {
        arg8()
    } catch (e: StackOverflowError) {
        println("8. Обработано: StackOverflowError")
    }

//Задание 11
    try {
        throw MyAssertionError("Это ошибка!")
    } catch (e: AssertionError) {
        println("Поймано: ${e.message}")
    }

//Задание 12
    try {
        val list = listOf(1, 2, 3)
        println(list[5])
    } catch (e: IndexOutOfBoundsException) {
        println("Поймано исключение: ${e.message}")
        throw MyIndexOutOfBoundsException(e)
    }
}

fun arg4(argfun: Int) {
    require(argfun < 0) { "argfun должно быть меньше 0" }
}

class Arg6(arg: Int) {
    init {
        check(arg < 5) { "Класс не отвечает требованиям" }
    }
}

fun arg7() {
    val argfun2 = mutableListOf<Int>()
    while (true) {
        argfun2.add(1)
    }
}

fun arg8() {
    arg8()
}

// Задание 10
// Напиши функцию, которая принимает nullable аргумент типа Any и в блоке try/catch выполни набор действий с этим аргументом которые могут потенциально вызвать одно из исключений в этом же порядке:

fun example10(arg: Any?) {
    try {
//NullPointerException
        arg!!
//IndexOutOfBoundsException
        val list = arg as? List<*> ?: emptyList<Any>()
        list[100]
//ClassCastException
        val number = arg as Int
//IllegalArgumentException
        require(arg is String) { "Аргумент не является строкой" }
//NumberFormatException
        val parsed = arg.toString().toInt()
//IllegalStateException
        check(arg == 42) { "Состояние неверное" }
        println("Переданный аргумент фантастически хорош!")
    } catch (e: Throwable) {
        //В блоке catch перехватывай исключение с общим типом Throwable а внутри через when определи тип исключения
// и выведи сообщение с названием исключения. Сразу после when выброси перехваченное исключение через throw,
// чтобы прекратить работу программы. Если аргумент функции не вызвал исключение, то выведи текст, сообщающий
// что переданный аргумент фантастически хорош!
        when (e) {
            is NullPointerException -> println("Пойман NullPointerException")
            is IndexOutOfBoundsException -> println("Пойман IndexOutOfBoundsException")
            is ClassCastException -> println("Пойман ClassCastException")
            is IllegalArgumentException -> println("Пойман IllegalArgumentException")
            is NumberFormatException -> println("Пойман NumberFormatException")
            is IllegalStateException -> println("Пойман IllegalStateException")
            else -> println("Поймано другое исключение: ${e::class.simpleName}")
        }
        throw e
    }
}
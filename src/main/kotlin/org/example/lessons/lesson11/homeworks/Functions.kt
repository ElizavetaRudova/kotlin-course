package org.example.lessons.org.example.lessons.lesson11.homeworks

fun main() {

}
//Задачи на сигнатуру метода
//Не принимает аргументов и не возвращает значения.
fun stimmax1() {

}

//Принимает два целых числа и возвращает их сумму.
fun stimmax2(a: Int, b: Int): Int {
    return a + b
}

//Принимает строку и ничего не возвращает.
fun stimmax3(str: String) {

}

//Принимает список целых чисел и возвращает среднее значение типа Double.
fun stimmax4(list: List<Int>): Double {
     return list.average()
}

//Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
private fun stimmax5(str2: String?): Int? {
    if (str2 == null) {
        return null
    }
    var count = 0
    for (char in str2) {
        count++
    }
    return count
}

//Не принимает аргументов и возвращает nullable вещественное число.
fun stimmax6(): Double? {
return null
}

//Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
private fun stimmax7(arg: List<Int>?) {

}

//Принимает целое число и возвращает nullable строку.
fun stimmax8(arg2: Int): String? {
return null
}

//Не принимает аргументов и возвращает список nullable строк.
fun stimmax9(): List<String>? {
return null
}

//Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun stimmax10(arg3: String?, arg4: Int?): Boolean? {
return null
}

//Задачи на написание кода
//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(arg4: Int): Int {
    return arg4 * 2
}

//Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun isEven(arg5: Int): Boolean {
    if (arg5 % 2 == 0) {
        return true
    } else {
        return false
    }
}

//Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n. Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int) {
if (n < 1) {
    return
}
    for (i in 1..n) {
        println(i)
    }
}

//Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке. Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(arg6: List<Int>): Int? {
    for (num in arg6) {
     if (num < 0) {
         return num
     }
    }
    return null
}

//Напишите функцию processList, которая принимает список строк.
// Функция должна проходить по списку и выводить каждую строку.
// Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(arg7: List<String?>) {
    for (str2 in arg7) {
        if (str2 == null) {
            return
        }
        println(str2)
    }
}
package org.example.lessons.lesson09.homeworks

//Работа с массивами Array
//Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
fun main() {
    val e1 = intArrayOf(1, 2, 3, 4, 5)

//Создайте пустой массив строк размером 10 элементов.
    val e2 = Array(10) { "" }

//Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    val e3 = doubleArrayOf(0.0, 2.0, 4.0, 6.0, 8.0)

//Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
    val e4 = IntArray(5)
    for (i in 0..4) {
        e4[i] = i * 3
    }
    println(e4.joinToString())
//Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val e5: Array<String?> = arrayOf(null, "Привет", "Котлин")
    println(e5.joinToString(", "))

//Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val e6 = intArrayOf(10, 20, 30, 40, 50)
    val copye6 = IntArray(e6.size)
    for (i in 0 until e6.size) {
        copye6[i] = e6[i]
    }
    println(copye6.joinToString())

//Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого. Распечатайте полученные значения.
    val e7 = intArrayOf(6, 7, 8)
    val e7e7 = intArrayOf(1, 2, 3)
    val eMin = IntArray(e7.size)
    for (i in e7.indices) {
        eMin[i] = e7[i] - e7e7[i]
    }
    println(eMin.joinToString())

//Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, печатаем -1. Реши задачу через цикл while.
    val e8 = intArrayOf(98, 76, 9, 5, 14)
    var i = 0
    var index = -1
    while (i < e8.size) {
        if (e8[i] == 5) {
            index = i
            break
        }
        i++
    }
    if (index != -1) {
        println("Индекс элемента 5: ${index}")
    } else {
        println(-1)
    }

//Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
    val e9 = intArrayOf(11, 12, 13, 14, 15)
    for (e9 in e9)
        if (e9 % 2 == 0) {
            println("$e9 - четное")
        } else {
            println("$e9 - нечетное")
        }

    //Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()). Распечатай найденный элемент.
    fun newexample(stringArray: Array<String>, searchStr: String) {
        for (item in stringArray) {
            if (item.contains(searchStr)) {
                println("Найдено: $item")
            }
        }
    }

    val e10 = arrayOf("Привет", "Котлин", "Мир")
    newexample(e10, "Мир")

//Работа со списками List
//Создайте пустой неизменяемый список целых чисел.
    val w1: List<Int> = listOf()

//Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
    val w2: List<String> = listOf("Hello", "World", "Kotlin")

//Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val w3: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

//Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    w3.addAll(listOf(6, 7, 8))

//Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
    val w4: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
    w4.remove("World")

//Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    val w5: List<Int> = listOf(10, 20, 30)
    for (i in w5) {
        println(i)
    }

//Создайте список строк и получите из него второй элемент, используя его индекс.
    val w6: List<String> = listOf("Один", "Два", "Три", "Четыре", "Пять")
    println("Второй элемент: ${w6[2]}")

//Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент с индексом 2 на новое значение).
    val w7: MutableList<Int> = mutableListOf(5, 6, 7, 8, 9, 0)
    w7[2] = 1
    println(w7)

//Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
    val w8: List<String> = listOf("А", "Б", "В")
    val w9: List<String> = listOf("Г", "Д", "Е")
    val w10new: MutableList<String> = mutableListOf<String>()
    for (i in w8) {
        w10new.add(i)
    }
    for (i in w9) {
        w10new.add(i)
    }
    println(w10new.joinToString(", "))

//Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    val w11: List<Int> = listOf(3, 8, 6, 4, 6)
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    for (num in w11) {
        if (num < min) min = num
        if (num > max) max = num
    }
    println("Минимум: $min, Максимум: $max")


//Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    val w12: List<Int> = listOf(2, 5, 6, 7, 8, 9)
    val w13new: MutableList<Int> = mutableListOf<Int>()
    for (num in w12) {
        if (num % 2 == 0) {
            w13new.add(num)
        }
    }
    println(w13new.joinToString())


//Работа с Множествами Set
//Создайте пустое неизменяемое множество целых чисел.
    val set1: Set<Int> = setOf()

//Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
    val set2: Set<Int> = setOf(1, 2, 3)

//Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
    val set3: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")

//Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
    set3.addAll(listOf("Swift", "Go"))
    println(set3)

//Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
val set4: MutableSet<Int> = mutableSetOf(2, 3, 4, 5, 8, 7)
    set4.remove(2)
    println(set4)

//Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
val set5: Set<Int> = setOf(10, 20, 30, 40, 50)
    for (i in set5) {
        println(i)
    }

//Создайте неизменяемое множество строк и конвертируйте его в изменяемый список строк с использованием цикла.
val set7: Set<String> = setOf("Kotlin", "Java", "Scala")
    val set8new: MutableSet<String> = mutableSetOf<String>()
    for (item in set7) {
        set8new.add(item)
    }
    println("Наш новый список: ${set8new.joinToString(", ")}")
}
//Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка.
// Нужно распечатать булево значение true если строка есть. Реши задачу через цикл.
fun set6(set: Set<String>, searchStr: String) {
    var isFound = false
    for (item in set) {
        if (item == searchStr) {
            isFound = true
            break
        }
    }
    if (isFound) {
        println(true)
    }
}















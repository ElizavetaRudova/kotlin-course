package org.example.lessons.lesson10.homeworks

fun main() {

    //Задачи на работу со словарём
//Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    val map1: Map<Int, Int> = mapOf<Int, Int>()

//Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
    val map2 = mapOf(0.58F to 0.58, 0.36F to 0.36)

//Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val mutablemap3: Map<Int, String> = mutableMapOf<Int, String>()

//Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    val mutablemap4 = mutableMapOf("Россия" to "Москва")
    mutablemap4["Япония"] = "Токио"
    mutablemap4["Франция"] = "Париж"

//Используя словарь из предыдущего задания, извлеките значение, используя ключ.
// Попробуй получить значение с ключом, которого в словаре нет.
    val capital = mutablemap4["Россия"]
    println(capital)

//Удалите определенный элемент из изменяемого словаря по его ключу.
    mutablemap4.remove("Франция")

//Создайте словарь (ключи Double, значения Int) и выведи в цикле результат
// деления ключа на значение. Не забудь обработать деление на 0
// (в этом случае выведи слово “бесконечность”)
    val mutablemap5 = mutableMapOf<Double, Int>()
    mutablemap5[10.0] = 3
    mutablemap5[5.0] = 0
    for ((key, value) in mutablemap5) {
        if (value == 0) {
            println("бесконечность")
        } else {
            println(key / value)
        }
    }

//Измените значение для существующего ключа в изменяемом словаре.
    mutablemap5[10.0] = 5
    println(mutablemap5)

//Создайте два словаря и объедините их в третьем изменяемом словаре
// через циклы.
    val map6 = mapOf("Кот" to "Мяу", "Собака" to "Гав")
    val map7 = mapOf("Корова" to "Му", "Лягушка" to "Ква")
    val mutablemap6 = mutableMapOf<String, String>()
    for ((key, value) in map6) {
        mutablemap6[key] = value
    }
    for ((key, value) in map7) {
        mutablemap6[key] = value
    }
    println(mutablemap6)


//Создайте словарь, где ключами являются строки, а значениями -
// списки целых чисел. Добавьте несколько элементов в этот словарь.
val mutablemap7 = mutableMapOf<String, List<Int>>()
    mutablemap7["Оценки"] = listOf(5, 4, 3, 2)
    println(mutablemap7)

//Создай словарь, в котором ключи - это целые числа, а значения -
// изменяемые множества строк. Добавь данные в словарь.
// Получи значение по ключу (это должно быть множество строк) и добавь
// в это множество ещё строку. Распечатай полученное множество.
val mutablemap8 = mutableMapOf<Int, MutableSet<String>>()
    mutablemap8[20] = mutableSetOf("температура")
    mutablemap8[25] = mutableSetOf("влажность")
    val mySet = mutablemap8[20]
    if (mySet != null) {
        mySet.add("давление")
    }
    println(mySet)

//Создай словарь, где ключами будут пары чисел. Через перебор найди
// значение у которого пара будет содержать цифру 5 в качестве первого
// или второго значения.
val pairMap8 = mapOf(
    (1 to 3) to "Значение А",
    (5 to 8) to "Значение Б",
    (8 to 5) to "Значение В"
)
for ((key, value) in pairMap8) {
    val (first, second) = key
    if (first == 5 || second == 5) {
        println("Найдено значение: '$value' (Ключ-пара: $first и $second)")
    }
}
//Задачи на подбор оптимального типа для словаря
//Словарь библиотека: Ключи - автор книги, значения - список книг
val mutablemap9: MutableMap<String, MutableList<String>> = mutableMapOf(
    "Лев Толстой" to mutableListOf("Война и мир"),
    "Антон Чехов" to mutableListOf("Дама с собачкой", "Вишнёвый сад")
)

//Справочник растений: Ключи - типы растений (например, "Цветы", "Деревья"),
// значения - списки названий растений
val mutablemap10: MutableMap<String, MutableList<String>> = mutableMapOf(
    "Цветы" to mutableListOf("Лилии"),
    "Деревья" to mutableListOf("Березы")
)

//Четвертьфинала: Ключи - названия спортивных команд, значения -
// списки игроков каждой команды
val mutablemap11: Map<String, MutableList<String>> = mapOf(
    "Динамо" to mutableListOf("Иван Иванов", "Петр Петров"),
    "ЦСКА" to mutableListOf("Алексей Сидоров", "Сергей Васильев")
)

//Курс лечения: Ключи - даты, значения - список препаратов принимаемых
// в дату
val map12: Map<String, List<String>> = mapOf(
    "12.01.2027" to listOf("Анальгин")
)

//Словарь путешественника: Ключи - страны, значения - словари из городов
// со списком интересных мест.
val map13: Map<String, Map<String, List<String>>> = mapOf(
    "Россия" to mapOf(
        "Москва" to listOf("ВДНХ")
    )
)
}
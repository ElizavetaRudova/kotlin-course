package org.example.lessons.lesson15.homeworks

//Иерархия Мебели
//Базовый класс: Мебель
//Производные классы: …
//Дополнительное разветвление для …: …

open class Furniture(val name: String)
open class Table(name: String, val purpose: String) : Furniture(name)
open class Sofa(name: String, val view: String) : Furniture(name)
class DiningTable(name: String, purpose: String, val countLegs: Int) : Table(name, purpose)
class CornerSofa(name: String, view: String, val isFoldable: Boolean) : Sofa(name, view)

fun main() {
    val sofa = CornerSofa ("Диван", "Угловой", true)
    println("${sofa.view} диван: " + if (sofa.isFoldable) "раскладывается" else "не раскладывается")

    val table = DiningTable("Обеденный", "Кухонный", 4)
    println("${table.purpose} стол: ${table.countLegs} ножки")
}

package org.example.lessons.lesson15.homeworks

//Учебные Заведения
//Базовый класс: Учебное Заведение
//Производные классы: Школа, …
//Дополнительное разветвление для …: …

open class EducationalInstitution(val name: String)
open class School(name: String, val classCount: Int) : EducationalInstitution(name)
open class University(name: String, val faculties: Int) : EducationalInstitution(name)
class Institute(name: String, faculties: Int, val researchAreas: List<String>) : University(name, faculties)
fun main() {
    val school = School("Школа №3", 11)
    println("${school.name}, классов: ${school.classCount}")
}
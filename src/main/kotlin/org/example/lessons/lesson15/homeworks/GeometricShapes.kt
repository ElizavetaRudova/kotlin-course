package org.example.lessons.lesson15.homeworks

//Геометрические Фигуры
//Базовый класс: Геометрическая Фигура
//Производные классы: Многоугольник, Круг
//Дополнительное разветвление для Многоугольник: Треугольник, Четырехугольник

open class GeometricFigure(val name: String)
open class Polygon(name: String, val sidesCount: Int) : GeometricFigure(name)
class Triangle(val a: Double, val b: Double, val c: Double) : Polygon("Треугольник", 3)
class Quadrilateral(val width: Double, val height: Double) : Polygon("Четырехугольник", 4)
class Circle(val radius: Double) : GeometricFigure("Круг")

fun main() {
    val tri = Triangle(3.0, 4.0, 5.0)
    println("${tri.name}, сторон: ${tri.sidesCount}")
    val circle = Circle(5.0)
    println("${circle.name}, радиус: ${circle.radius}")
}
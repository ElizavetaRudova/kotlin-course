package org.example.lessons.org.example.lessons.lesson16.homeworks

import kotlin.math.PI
import kotlin.math.sin

//Геометрические Фигуры и Их Площадь
//Абстрактный (базовый) класс: Shape с open методом area().
//Классы наследники: Circle, Square, Triangle.
//Метод area() возвращает 0.0.
//Переопределите метод area() в каждом классе-наследнике для расчета площади
//соответствующей фигуры.
//Подсказка: каждый класс должен иметь аргументы конструктора,
// позволяющие вычислить площадь (для круга это радиус, для квадрата это сторона,
// для треугольника это две стороны и угол между ними)
//Создай набор геометрических фигур и выведи в цикле их площадь

abstract class Shape() {
    open fun area (): Double = 0.0
    open fun name(): String = "Shape"
}
class Circle(val radius: Double) : Shape() {
    override fun name() = "Circle"
    override fun area(): Double = PI * radius * radius
    }
class Square(val side: Double) : Shape() {
    override fun name() = "Square"
    override fun area(): Double = side * side
    }
class Triangle(val a: Double, val b: Double, val angle: Double) : Shape() {
    override fun name(): String = "Triangle"
    override fun area(): Double = 0.5 * a * b * sin(Math.toRadians(angle))
    }

fun main() {
val circle = Circle(radius = 5.0)
    circle.area()
val square = Square(side = 4.0)
    square.area()
val triangle = Triangle(a = 6.0, b = 8.0, angle = 30.0)
    triangle.area()
val shapes: List<Shape> = listOf(circle, square, triangle)
    for (shape in shapes) {
        val formattedArea = "%.2f".format(shape.area())
        println("${shape.name()}: Shape = $formattedArea")
    }
}

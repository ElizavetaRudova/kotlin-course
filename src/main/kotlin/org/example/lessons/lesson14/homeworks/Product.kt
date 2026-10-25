package org.example.lessons.lesson14.homeworks

data class Product (
    val name: String,
    var price: Int,
    var quantity: Int)

fun main() {
    val Milk = Product ( "Молоко", 200, 3)
    println(Milk)
}
package org.example.lessons.lesson16.homeworks

//Класс “Корзина товаров”: содержит поле словаря из ID товаров и их количества
class ShoppingCart {
    private val items: MutableMap<String, Int> = mutableMapOf()

    // 1. Базовый метод: добавляет одну единицу
    fun addToCart(itemId: String) {
        items[itemId] = (items[itemId] ?: 0) + 1
    }

    // 2. Перегрузка: принимает ID и количество (amount)
    fun addToCart(itemId: String, amount: Int) {
        items[itemId] = (items[itemId] ?: 0) + amount
    }

    // 3. Перегрузка: принимает словарь (ID и количество)
    fun addToCart(newItems: Map<String, Int>) {
        for ((id, amount) in newItems) {
            items[id] = (items[id] ?: 0) + amount
        }
    }

    // 4. Перегрузка: принимает список из ID (добавляет по одной единице)
    fun addToCart(itemIds: List<String>) {
        for (id in itemIds) {
            items[id] = (items[id] ?: 0) + 1
        }
    }

    // 5. Переопределение toString для красивого вывода таблицы
    override fun toString(): String {
        if (items.isEmpty()) return "Корзина пуста"

        val sb = StringBuilder()
        sb.append("        КОРЗИНА\n")
        sb.append(String.format("%-15s | %s\n", "АРТИКУЛ", "КОЛИЧЕСТВО"))
        sb.append("------------------------\n")

        // Выводим строки таблицы
        for ((id, quantity) in items) {
            // padEnd(15) делает так, чтобы текст занимал ровно 15 символов в ширину
            sb.append(String.format("%-15s | %d\n", id.padEnd(15), quantity))
        }

        sb.append("----------------------------------\n")

        // Считаем итоги:
        // items.size — количество уникальных ключей (артикулов)
        // items.values.sum() — сумма всех значений (общее количество штук)
        sb.append("Итого артикулов: ${items.size}\n")
        sb.append("Всего товаров: ${items.values.sum()} шт.")

        return sb.toString()
    }
}

fun main() {
    val cart = ShoppingCart()

    println("Добавляем товары разными способами...\n")

    // Способ 1: базовый (+1 шт.)
    cart.addToCart("apple")
    cart.addToCart("apple")

    // Способ 2: артикул + количество (amount)
    cart.addToCart("banana", 5)

    // Способ 3: словарь
    cart.addToCart(mapOf(
        "orange" to 3,
        "apple" to 1
    ))

    // Способ 4: список артикулов (каждого по +1)
    cart.addToCart(listOf("milk", "bread", "banana"))

    println(cart)
}
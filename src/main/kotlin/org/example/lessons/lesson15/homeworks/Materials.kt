package org.example.lessons.lesson15.homeworks
//Создай подклассы этого контейнера, которые будут добавлять строку material
//(или коллекции или словари строк) в какое-то определённое место (места).

//Первый класс должен вставлять строку на дно контейнера (должно появиться под индексом 0)

//Второй класс должен получать список строк и вставлять их в начало контейнера но поочерёдно
//с теми данными, которые уже есть. То-есть, наш список должен появиться в контейнере
//по индексам 0, 2, 4 и так далее.

//Третий класс при добавлении строки должен отсортировать весь список метиралов
//в алфавитном порядке включая добавляемый материал.

//Четвёртый класс должен принимать словарь (ключи и значения строки).
//Каждая пара ключа и значения должна попадать в контейнер следующим образом -
//ключ в начало, значение в конец. Таким образом в начале должны быть ключи
//в обратном порядке, потом существующие материалы, потом все значения.

abstract class Materials {
    private val materials = mutableListOf<String>()
    fun addMaterial(material: String) {
        materials.add(material)
    }
    fun extractMaterials(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }
    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}
class InsertFirstMaterial : Materials() {

    fun insert(item: String) {
        val materials = extractMaterials()
        addMaterial(item)
        materials.forEach {
            addMaterial(it)
        }
    }
}

class InsertOneByOneMaterials : Materials() {

    fun insert(items: List<String>) {
        val materials = extractMaterials()
        val maxIndex = maxOf(items.lastIndex, materials.lastIndex)
        for (i in 0..maxIndex) {
            if (i < items.size) {
                addMaterial(items[i])
            }
            if (i < materials.size) {
                addMaterial(materials[i])
            }
        }
    }
}

class InsertSortedMaterials : Materials() {

    fun insert(item: String) {
        val materials = (extractMaterials() + item).sorted()
        materials.forEach {
            addMaterial(it)
        }
    }
}

class InsertMapMaterials : Materials() {

    fun insert(items: Map<String, String>) {
        val materials = items.keys.reversed() + extractMaterials() + items.values
        materials.forEach {
            addMaterial(it)
        }
    }
}
fun main() {
    val a = InsertFirstMaterial()
    a.addMaterial("Старое1")
    a.addMaterial("Старое2")
    a.insert("Новое")
    println("1. InsertFirst:")
    a.printContainer()

    val b = InsertOneByOneMaterials()
    b.addMaterial("A")
    b.addMaterial("B")
    b.insert(listOf("X", "Y", "Z"))
    println("\n2. OneByOne:")
    b.printContainer()

    val c = InsertSortedMaterials()
    c.addMaterial("Яблоко")
    c.addMaterial("Арбуз")
    c.insert("Банан")
    println("\n3. Sorted:")
    c.printContainer()

    val d = InsertMapMaterials()
    d.addMaterial("Старое")
    d.insert(mapOf("K1" to "V1", "K2" to "V2"))
    println("\n4. Map:")
    d.printContainer()
}
package org.example.lessons.lesson19.homeworks

//Создай функцию transposition с двумя дженериками, которая принимает словарь с дженериками и возвращает словарь, в котором ключ и значения поменялись местами.

fun <K, V> transposition(map: Map<K, V>): Map<V, K> {
    return map.entries.associate { (key, value) -> value to key }
}
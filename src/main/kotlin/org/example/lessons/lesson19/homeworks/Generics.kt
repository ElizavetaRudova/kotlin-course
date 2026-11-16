package org.example.lessons.lesson19.homeworks

import kotlin.math.max

class Container<T>(private val item: T) {
    fun getItem(): T = item
}
class PairBox<K, V>(
    private val key: K,
    private val value: V
) {
    fun getMap(): Map<K, V> = mapOf(key to value)
}
class Multiplier<T : Number> {
    fun multiplierTwo(value: T): Double = value.toDouble() * 2
}
class NullableBox<T> {
    fun isNull(value: T?): Boolean = value == null
}
interface Storage<T> {
    fun save(item: T)
    fun get(): T
}
interface Transformer<T, R> {
    fun transform(value: T): R
}
interface PairProcessor<T, R> {
    fun process(first: T, second: R)
}
interface ConnectionDifferent<T, R, S> {
    fun connect(first:List<T>, second: List<R>): List<S>
}
fun <T> swap(
    list: MutableList<T>,
    index1: Int,
    index2: Int
): List<T> {
    val arg1 = list[index1]
    val arg2 = list[index2]
    list.add(index2, arg1)
    list.add(index1, arg2)
    return list.toList()
}
fun <T : Number> mergeLists(
    first: List<T>,
    second: List<T>
): List<Double> {
    val size = max(first.size, second.size)
    val sum = mutableListOf<Double>()
    for (i in 0 ..< size) {
        val arg1 = first.getOrNull(i)?.toDouble() ?: 0.0
        val arg2 = second.getOrNull(i)?.toDouble() ?: 0.0
        sum.add(arg1.toDouble() + arg2.toDouble())
    }
    return sum.toList()
}
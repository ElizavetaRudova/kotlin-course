package org.example.lessons.lesson19.homeworks

//Создай интерфейс Mapper с двумя дженериками, который будет определять методы для преобразования:
//элементов одного типа в элементы другого типа
//списка элементов одного типа в список элементов другого типа

interface Mapper<T, R> {
    fun map(item: T): R
    fun mapList(items: List<T>): List<R>
}
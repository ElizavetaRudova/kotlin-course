package org.example.lessons.lesson19.homeworks

//Напиши интерфейс Validator с дженериком с функцией валидации, которая будет принимать элемент с типом дженерика и возвращать булево значение.

interface Validator<T> {
    fun validate(value: T): Boolean
}
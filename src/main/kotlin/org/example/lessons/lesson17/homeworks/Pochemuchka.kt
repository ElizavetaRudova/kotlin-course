package example.lessons.lesson17.homeworks

abstract class BaseClass(
    // 1. объясни, почему это поле доступно в main() для чтения из класса ChildrenClass
    // ОТВЕТ: В ChildrenClass есть свой аргумент val privateVal в конструкторе (класс ниже).
    // main() читает не приватное поле базового класса, а публичное поле дочернего!
    private val privateVal: String,
    // 2. объясни, почему это поле недоступно в main()
    // ОТВЕТ: Модификатор protected означает, что поле доступно только внутри класса BaseClass
    // и в его наследниках (ChildrenClass). Для функции main() оно закрыто.
    protected val protectedVal: String,
    val publicVal: String
) {
    var publicField = "3. измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "4. Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }
    protected var protectedField = "5. измени меня из функции main() через сеттер в наследнике"
    private var privateField = "6. добавь сеттер чтобы изменить меня из main()"
    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
            "generate" to generate(),
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }
    fun printText() {
        privatePrint()
    }
    // 7. объясни, почему эта функция не может быть публичной
    // ОТВЕТ: Она возвращает ProtectedClass. Если бы метод был public,
    // он бы "светил" наружу protected-класс, что запрещено правилами языка.
    protected open fun getProtectedClass() = ProtectedClass()
    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }
    // 8. Распечатай getAll() и объясни, почему в поле "generate" другой текст
    // ОТВЕТ: Потому что в ChildrenClass этот метод переопределен.
    // Вызывается версия из дочернего класса.
    open fun generate(): String {
        return "Это генерация из родительского класса"
    }
    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }
    // 9. объясни, почему эта функция не может быть публичной или protected
    // ОТВЕТ: Она возвращает PrivateClass, который объявлен как private.
    // Публичная функция не может возвращать приватный тип, иначе нарушится инкапсуляция.
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass() {}

    private class PrivateClass() {}
}
class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // 10. объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    // ОТВЕТ: Из-за слова val перед privateVal в конструкторе, Kotlin автоматически создает
    // публичное свойство с геттером прямо в классе ChildrenClass.
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {
    // 11. объясни, почему в main() доступна функция getAll() хотя её здесь нет
    // ОТВЕТ: Это наследование. ChildrenClass наследует все public-методы от BaseClass.
    // 12. проверь, что выводится на печать при вызове функции printText()
    // и объясни, почему не происходит переопределение метода privatePrint()
    // ОТВЕТ: Выведется "Печать из класса BaseClass".
    // Приватные методы не наследуются и не могут быть переопределены.
    // BaseClass вызывает СВОЙ приватный метод, а не метод наследника.
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }
    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }
}
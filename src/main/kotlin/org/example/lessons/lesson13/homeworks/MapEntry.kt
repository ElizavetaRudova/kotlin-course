package org.example.lessons.org.example.lessons.lesson13.homeworks

fun main() {
//Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах.
//Определите среднее время выполнения теста.
    val testResults = mapOf(
        "Test1" to 12,
        "Test2" to 45,
        "Test3" to 8
    )
    val stim1 = testResults.values.average()
    println(stim1)

//Имеется словарь с метаданными автоматизированных тестов,
// где ключи — это имена тестовых методов, а значения - строка с метаданными.
// Выведите список всех тестовых методов.
    val testMetadata = mapOf(
        "loginTest" to "status:PASSED, author:Ivan, severity:critical",
        "paymentTest" to "status:FAILED, author:Alex, severity:blocker",
        "logoutTest" to "status:PASSED, author:Ivan, severity:minor",
        "registerTest" to "status:SKIPPED, author:Olga, severity:critical"
    )
    val stim2: List<String> = testMetadata.keys.toList()
    println(stim2)

//В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    val mutabletestProgress: MutableMap<String, String> = mutableMapOf(
        "loginTest" to "status:PASSED, author:Ivan",
        "paymentTest" to "status:FAILED, author:Alex"
    )
    mutabletestProgress["logoutTest"] = "status:PASSED, author:Ivan"
    println(mutabletestProgress)

//Посчитайте количество успешных тестов в словаре с результатами
// (ключ - название, значение - результат из passed, failed, skipped).
    val testResults2 = mapOf(
        "testLogin" to "passed",
        "testLogout" to "failed",
        "testRegistration" to "passed",
        "testProfile" to "skipped",
        "testPayment" to "passed"
    )
    val stim3 = testResults2.count { it.value == "passed"}
    println(stim3)

//Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен
// (ключ - название, значение - статус исправления).
mutabletestProgress.remove("loginTest")
    println(mutabletestProgress)

//Для словаря с результатами тестирования веб-страниц
// (ключ — URL страницы, значение — статус ответа),
// выведите сообщение о странице и статусе её проверки.
    val pageStatuses = mapOf(
        "https://example.com/" to 200,
        "https://example.com/about" to 200
    )
    pageStatuses.forEach { (url, status) ->
        println("Страница $url — статус проверки: $status")
    }

//Найдите в словаре с названием и временем ответа сервисов только те,
// время ответа которых превышает заданный порог.
    val serviceResponseTimes = mapOf(
        "auth-service" to 120,
        "payment-service" to 340,
        "user-service" to 95,
        "notification-service" to 210,
        "report-service" to 480
    )
    val threshold = 200
    val stim4: Map<String, Int> = serviceResponseTimes.filterValues { it > threshold }
    println(stim4)

//В словаре хранятся результаты тестирования API
// (ключ — endpoint, значение — статус ответа в виде строки).
// Для указанного endpoint найдите статус ответа, если endpoint отсутствует,
// предположите, что он не был протестирован.
    val apiResults = mapOf(
        "/api/login" to "200 OK",
        "/api/users/999" to "404 Not Found",
        "/api/admin" to "403 Forbidden",
        "/api/payments" to "500 Internal Server Error",
    )
    val endpoint = "/api/orders"
    val status = apiResults.getOrElse(endpoint) { "не был протестирован" }
    println("Endpoint $endpoint — статус: $status")

//Из словаря, содержащего конфигурации тестового окружения
// (ключ — название параметра конфигурации, значение - сама конфигурация),
// получите значение для "browserType". Ответ не может быть null.
    val testConfig = mapOf(
        "browserType" to "Chrome",
        "baseUrl" to "https://test.example.com",
        "timeout" to "30s",
        "headless" to "true"
    )
    val stim5: String = testConfig.getValue("browserType")
    println(stim5)

//Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО,
// добавив новую версию.
val appversion = mapOf(
    "prod" to 35098,
    "test" to 35099
)
    val mutableNew = appversion.toMutableMap()
    mutableNew.put("betaTest", 35060)
    val newAppversion: Map<String, Int> = mutableNew
    println(newAppversion)

//Используя словарь с настройками тестирования для различных мобильных устройств
// (ключ — модель устройства, значение - строка с настройками),
// получите настройки для конкретной модели или верните настройки по умолчанию.
    val deviceSettings = mapOf(
        "iPhone 13" to "iOS 16, Safari",
        "Pixel 6" to "Android 13, Chrome"
    )
    val stim6 = deviceSettings.getOrDefault("Pixel 6", "Safari" )
    println(stim6)

//Проверьте, содержит ли словарь с ошибками тестирования
// (ключ - код ошибки, значение - описание ошибки) определенный код ошибки.
    val testErrors = mapOf(
        404 to "Not Found",
        500 to "Internal Server Error"
    )
    val stim7 = testErrors.containsKey(404)
    println(stim7)

//Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев
// в формате "TestID_Version", а значения — статусы выполнения этих тестов
// ("Passed", "Failed", "Skipped"). Отфильтруйте словарь, оставив только те сценарии,
// идентификаторы которых соответствуют определённой версии тестов,
// то-есть в ключе содержится требуемая версия.
    val testScenarios = mapOf(
        "LOGIN_1.0" to "Passed",
        "PAYMENT_1.0" to "Failed",
        "REGISTER_1.0" to "Passed",
        "LOGIN_2.0" to "Passed",
        "PAYMENT_2.0" to "Skipped",
        "REPORT_2.0" to "Failed"
    )
    val targetVersion = "2.0"
    val stim8 = testScenarios.filterKeys { it.contains(targetVersion)}
    println(stim8)

//У вас есть словарь, где ключи — это названия функциональных модулей приложения,
// а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.
    val moduleResults = mapOf(
        "Auth" to "Passed",
        "Payments" to "Failed",
        "Reports" to "Passed",
        "Notifications" to "Skipped",
        "Profile" to "Passed"
    )
    val stim9: Boolean = moduleResults.any { it.value == "Failed" }
    println(stim9)

//Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    val envSettings = mutableMapOf(
        "browser" to "Chrome",
        "baseUrl" to "https://test.example.com",
        "timeout" to "30s"
    )
    val extraSettings = mapOf(
        "headless" to "true"
    )
    envSettings.putAll(extraSettings)
    println(envSettings)

//Объедините два неизменяемых словаря с данными о багах.
    val bugs = mapOf(
        101 to "Login fails on Safari",
        102 to "Wrong price calculation"
    )
    val bugs2 = mapOf(
        103 to "Timeout on checkout",
        104 to "Broken link in email"
    )
    val newbugs: Map<Int, String> = bugs + bugs2
    println(newbugs)

//Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    val lastRunData = mutableMapOf(
        "testLogin" to "Passed",
        "testPayment" to "Failed",
        "testProfile" to "Skipped"
    )
    lastRunData.clear()
    println(lastRunData)

//Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены
// (имеют статус “skipped”). Ключи - название теста, значения - статус.
    val report = mapOf(
        "testLogin" to "passed",
        "testLogout" to "skipped",
        "testPayment" to "passed",
        "testProfile" to "skipped",
        "testSearch" to "failed"
    )
    val stim10 = report.filterNot { it.value == "skipped" }
    println(stim10)

//Создайте копию словаря с конфигурациями тестирования удалив из него несколько конфигураций.
    val configs = mapOf(
        "browser" to "Chrome",
        "baseUrl" to "https://test.example.com",
        "timeout" to "30s",
        "debug" to "true",
        "mockServer" to "false"
    )
    val stim11 = configs - listOf("debug", "mockServer")
    println(stim11)

//Создайте отчет о тестировании, преобразовав словарь с результатами тестирования
// (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
    val testResults3 = mapOf(
        "T-1" to "Passed",
        "T-2" to "Failed",
        "T-3" to "Passed"
    )
    val stim12: List<String> = testResults3.map { (id, result) -> "$id: $result" }
    println(stim12)

//Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
    val liveResults = mutableMapOf(
        "test1" to "Passed",
        "test2" to "Failed"
    )

    val stim13: Map<String, String> = liveResults.toMap()
    println(stim13)

//Преобразуйте словарь, содержащий числовой ID теста и данные о времени выполнения тестов,
// заменив идентификаторы тестов на их строковый аналог (например через toString()).
    val executionTimes = mapOf(
        101 to 12.5,
        102 to 45.0,
        103 to 8.3
    )
    val stim14: Map<String, Double> = executionTimes.mapKeys { it.key.toString() }
    println(stim14)

//Для словаря с оценками производительности различных версий приложения
// (ключи - строковая версия, значения - дробное число времени ответа сервера)
// увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.
    val perfScores = mapOf(
        "v1.0.0" to 120.0,
        "v1.1.0" to 95.5,
        "v1.2.0" to 200.0
    )
    val stim15 = perfScores.mapValues { it.value * 1.1 }
    println(stim15)

//Проверьте, пуст ли словарь с ошибками компиляции тестов.
    val compileErrors = mapOf<String, String>()

    val stim16 = compileErrors.isEmpty()
    println("Ошибок компиляции нет: $stim16")

//Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
    val loadResults = mapOf(
        "rps" to "1500",
        "avgTime" to "120ms",
        "errors" to "0"
    )
    val stim17 = loadResults.isNotEmpty()
    println("Есть данные: $stim17")

//Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
    val allTests = mapOf(
        "testA" to "Passed",
        "testB" to "Passed",
        "testC" to "Passed"
    )
    val stim18 = allTests.all { it.value == "Passed" }
    println("Все тесты прошли: $stim18")

//Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
    val mixedResults = mapOf(
        "testA" to "Passed",
        "testB" to "Failed",
        "testC" to "Passed"
    )
    val stim19 = mixedResults.containsValue ("Failed")
    println("Есть хотя бы одна ошибка: $stim19")

//Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты,
// которые не прошли успешно и содержат в названии “optional”.
    val serviceTests = mapOf(
        "auth_test" to "Passed",
        "optional_cache_test" to "Failed",
        "payment_test" to "Failed"
    )
    val stim20 = serviceTests.filter { (name, result) ->
        name.contains("optional") && result != "Passed"
    }
    println(stim20)

}
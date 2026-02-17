fun main() {
    try {
        println("Вычисление функции f(y):")
        println("Введите y = ")
        var y = readln().toDouble()

        var result = when {
            y > 2 -> y + 2
            y < 1 -> y * y + 2 * y + 0.3
            else -> y * y * y + 2 * y * y + 0.3 * y + 1
        }

        println("\nРезультат:")
        println("f($y) = $result")

    } catch (e: NumberFormatException) {
        println("Ошибка: введите корректное число")
    }
}
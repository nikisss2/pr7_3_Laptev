fun main() {
    try {
        print("Введите длину первого отрезка a: ")
        var a = readln().toDouble()
        print("Введите длину второго отрезка b: ")
        var b = readln().toDouble()
        print("Введите длину третьего отрезка c: ")
        var c = readln().toDouble()
        var isExists = false

        if (a <= 0 || b <= 0 || c <= 0) {
            println("Ошибка: длины отрезков должны быть положительными числами")
            return
        }
        if (a + b > c && a + c > b && b + c > a){
            isExists = true
        }

        when (isExists){
            true -> println("Такой треугольник существует")
            else -> println("Такой треугольник не существует")
        }
        when {
            a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a -> println("Треугольник прямоугольный")
            else -> println("Треугольник не прямоугольный")
        }

    } catch (e: NumberFormatException) {
        println("Ошибка: введите корректное число")
    }
}
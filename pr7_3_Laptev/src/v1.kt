fun main (){
    try {
        print("Введите R1 (Ом): ")
        var r1 = readln().toDouble()
        print("Введите R2 (Ом): ")
        var r2 = readln().toDouble()
        print("Введите R3 (Ом): ")
        var r3 = readln().toDouble()

        if (r1 <= 0 || r2 <= 0 || r3 <= 0) {
            println("Сопротивления должны быть положительным")
            return
        }

        var result = (r1 * r2 * r3) / (r1*r2 + r1*r3 + r2*r3)
        println("Общее сопротивление R = ${"%.3f".format(result)} Ом")

    } catch (e: NumberFormatException) {
        println("Ошибка: введите корректные числа")
    }
}
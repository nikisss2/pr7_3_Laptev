fun main() {

    println("Введите вариант (a, б, в, г):")
    var variant = readLine()!!

    println("Введите x:")
    var x = readLine()!!.toDouble()

    var y = when (variant) {
        "a" -> when {
            x in -3.0..0.0 -> (x + 3) / 3
            x in 0.0..1.0 -> -x + 1
            else -> 0.0
        }
        "б" -> when {
            x in -1.0..1.0 -> -2 * Math.abs(x) + 2
            else -> 0.0
        }
        "в" -> when {
            x in -1.0..1.0 -> 2.0
            else -> 0.0
        }
        "г" -> when {
            x in -2.0..0.0 -> (x + 2) / 2
            x in 0.0..1.0 -> -x + 1
            else -> 0.0
        }
        else -> {
            println("Неверный вариант")
            return
        }
    }

    println("f(x) = $y")
}

fun main (){
    try {
        println("Введите первое число: ")
        var num1: Double = readLine()!!.toDouble()
        println("Введите второе число: ")
        var num2: Double = readLine()!!.toDouble()

        var result: Double
        var result1: Double

        if (num1 >= 0 || num2 >= 0) {
            result = (Math.sqrt(num1) + Math.sqrt(num2)) / 2
            println(result)
        } else {
            println("Из числа <0 корень не извлекается!")
        }

        result1 = (Math.abs(num1) + Math.abs(num2)) / 2
        println(result1)

    } catch (e: NumberFormatException) {
    println("Ошибка: введите корректные числа")
    }
}
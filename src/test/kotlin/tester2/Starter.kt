package tester2

object Starter {
    @JvmStatic
    fun main(args: Array<String>) {
        val numbers = arrayListOf(15, -5, 11, -39)
        val nonNegativeNumbers = numbers.filter { it >= 0 }
        println(nonNegativeNumbers)
    }
// Вывод: 15, 11
}
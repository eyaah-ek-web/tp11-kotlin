fun divide(dividende: Int, diviseur: Int): Int {
    try {
        return dividende / diviseur
    } catch (e: ArithmeticException) {
        println("Erreur : division par zéro impossible")
        return 0
    }
}
fun main() {
    println(divide(10, 2))
    println(divide(10, 0))
}

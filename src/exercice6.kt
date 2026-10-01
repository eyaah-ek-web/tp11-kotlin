class NegativeNumberException(message: String) : Exception(message)
fun convertToInt(text: String): Int {
    try {
        val number = text.toInt()
        if (number < 0) {
            throw NegativeNumberException("Le nombre est négatif")
        }
        return number
    } catch (e: NumberFormatException) {
        println("Erreur : la chaîne n'est pas un nombre entier")
        return 0
    } catch (e: NegativeNumberException) {
        println("Erreur : le nombre est négatif")
        return 0
    }
}
fun main() {
    println(convertToInt("25"))
    println(convertToInt("abc"))
    println(convertToInt("-10"))
    println(convertToInt("50"))
}

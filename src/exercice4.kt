fun main() {
    val estPair = fun(nombre: Int): Boolean {
        return nombre % 2 == 0
    }
    val nombres = listOf(4, 7, 10, 13, 20, 25)
    for (nombre in nombres) {
        if (estPair(nombre)) {
            println("$nombre est pair")
        } else {
            println("$nombre est impair")
        }
    }
}

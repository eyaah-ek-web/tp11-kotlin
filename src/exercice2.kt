fun main() {
    val nombres = listOf(3, 8, 12, 5, 17, 10, 21, 6, 14, 9)
    println("Liste : $nombres")
    val pairs = nombres.filter { nombre -> nombre % 2 == 0 }
    println("Nombres pairs : $pairs")
    val impairs = nombres.filter { nombre -> nombre % 2 != 0 }
    println("Nombres impairs : $impairs")
    val superieursA10 = nombres.filter { nombre -> nombre > 10 }
    println("Nombres supérieurs à 10 : $superieursA10")
}

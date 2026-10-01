fun main(){
    var nbr = listOf(4, 3, 2, 1)
    val somme = fun(): Int {
        var total = 0
        for (nombre in nbr) {
            total += nombre
        }
        return total
    }
    println("La somme est : ${somme()}")
}

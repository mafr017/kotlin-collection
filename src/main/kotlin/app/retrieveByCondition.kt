package app

fun main() {
    /** Retrieve by Condition
     * mengambil single element berdasarkan kondisi
     * first((T) -> Boolean) ==>> mengambil element pertama yang sesuai dengan kondisi
     * last((T) -> Boolean) ==>> mengambil element terakhir yang sesuai dengan kondisi
     * firstOrNull((T) -> Boolean) / find() ==>> mengambil element pertama yang sesuai dengan kondisi,..
     * ..null jika tidak ada
     * lastOrNull((T) -> Boolean) / findLast() ==>> mengambil element pertama yang sesuai dengan kondisi,..
     * ..null jika tidak ada
     */
    val range = (1..20).toList()
    println(range.first { it > 6 })
    println(range.last { it > 6 })
    println(range.first { it % 6 == 4 })
    println(range.last { it % 6 == 4 })
    println(range.firstOrNull { it > 21 })
    println(range.firstOrNull { it > 15 })
    println(range.lastOrNull { it > 21 })
    println(range.lastOrNull { it > 15 })
}
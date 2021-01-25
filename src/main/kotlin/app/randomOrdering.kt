package app

fun main() {
    /** Random Ordering
     * mengurutkan isi element secara random
     * shuffled() membuat collection baru
     */
    val range = (1..10).toList()
    println(range.shuffled())
    println(range.shuffled())
    println(range.shuffled())
    println(range.shuffled())

}
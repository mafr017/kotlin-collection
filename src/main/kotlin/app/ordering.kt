package app

fun main() {
    /** Ordering
     * operasi mengurutkan collection
     * sorted() mengurutkan collection secara ascending kecil -> besar
     * sortedDescending() mengurutkan collection secara descending besar -> kecil
     */
    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
    val sorted = numbers.sorted()
    val sortedDescending = numbers.sortedDescending()

    println(numbers)
    println(sorted)
    println(sortedDescending)
}
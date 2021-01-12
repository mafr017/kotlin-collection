package app

fun main() {
    /** Konversi Collection
     * konversi collection ke jenis collection lain (array -> list) / (range -> set) / (set -> list)
     * semua function dimulai dengan kata "to", misal toList, toSet, toMutableList, dll.
     */
    val array1 = arrayOf(1, 2, 3, 4, 5, 10, 9, 8, 7, 6)
    val range1 = 1..15
    val list1 = range1.toList()
    val mutableList1 = array1.toMutableList()
    val set1 = array1.toSet()
    val mutableSet1 = array1.toMutableSet()
    val sortedSet1 = array1.toSortedSet()

    println(array1)
    println()
    println(range1)
    println()
    println(list1)
    println()
    println(mutableList1)
    println()
    println(set1)
    println()
    println(mutableSet1)
    println()
    println(sortedSet1)
}
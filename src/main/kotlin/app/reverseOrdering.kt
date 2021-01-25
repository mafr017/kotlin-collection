package app

fun main() {
    /** Reverse Ordering
     * mendapatkan collection dengan urutan data terbalik dari data aslinya
     * reversed() membentuk collection baru
     * asReversed()
     */
    val list1 = mutableListOf("Android", "Kotlin", "JAVA")
    val listReversed = list1.reversed()
    val listAsReversed = list1.asReversed()

    println(listReversed)
    println(listAsReversed)

    list1.add("Flutter")

    println(listReversed)
    println(listAsReversed)
}
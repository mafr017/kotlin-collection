package app

fun main() {
    /** List Specific Operation
     * getOrElse(index, (index) -> T) mengambil element di index, jika tidak ada mengembalikan nilai lambda
     * getOrNull(index) mengambil element di index, jika tidak ada mengembalikan nilai null
     * subList(from, to) mengambil semua element dari (from) ke (to)
     * binarySearch(value) melakukan pencarian menggunakan algoritma binary search
     */
    val list = listOf("Android", "Kotlin", "JAVA")
    println(list.get(1))
    println(list.getOrNull(4))
    println(list.getOrElse(4) { i -> "tidak ada" })
    println(list.subList(0, 2))

    val sortedList = list.sorted()
    println(sortedList)
    println(sortedList.binarySearch("Kotlin"))
    println(sortedList.binarySearch("JAVA"))
    println(sortedList.binarySearch("Android"))
    println()

    /** next
     * indexOf(value) mengambil index element yang sama dengan value
     * lastIndexOf(value) mengambil index element terakhir yang sama dengan value
     * indexOfFirst((T) -> Boolean) mengambil index element yang sama dengan kondisi
     * indexOfLast((T) -> Boolean) mengambil index element terakhir yang sama dengan kondisi
     */
    val numbers = listOf(1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 6, 6, 6, 6,)
    println(numbers.indexOf(2))
    println(numbers.lastIndexOf(4))
    println(numbers.indexOfFirst { it > 4 })
    println(numbers.indexOfLast { it > 4 })
}
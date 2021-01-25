package app

fun main() {
    /** Checking Existence
     * operasi untuk mengecek apakah dalam collection terdapat data yang dicari
     * constains(element)
     * containsAll(Collection<T>)
     * isEmpty()
     * isNotEmpty()
     */
    val range = (1..10).toList()
    println(range)
    println(range.contains(5))
    println(range.containsAll(listOf(2,7,9)))
    println(range.isEmpty())
    println(range.isNotEmpty())
    println(range.contains(11))
    println(range.containsAll(listOf(2,7,-1)))
}
package app

fun main() {
    /** Aggregate
     * max() dan min() mengambil nilai max dan min
     * average() mengambil rata-rata
     * sum() mengambil nilai jumlah di element
     * count() berapa banyak element
     * maxBy(selector) dan maxBy(selector)
     * maxWith(comparator) dan minxWith(comparator)
     * sumBy(selector)
     * sumByDouble(selector)
     */
    val numbers = (1..100).toList()
    println(numbers.max())
    println(numbers.min())
    println(numbers.average())
    println(numbers.sum())
    println(numbers.sumBy { it + 1 })
}
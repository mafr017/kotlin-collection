package app

fun main() {
    /** Grouping Interface
     * eachCount() Menghitung jumlah data di tiap group
     * reduce() dan fold()
     * aggregate(key: K, accumulator: R?, element: T, first: Boolean)
     */
    val list1 = listOf("a", "a", "b", "b", "c", "c", "c")
    val grouping: Grouping<String, String> = list1.groupingBy { it }
    println(grouping.eachCount())
    println(grouping.fold("") { accumulator, element -> accumulator + element })
    println(grouping.reduce { key, accumulator, element -> accumulator + element })
    println(grouping.aggregate { key, first: String?, second, isFirst ->
        if (isFirst) second
        else first + second
    })
}
package app

fun main() {
    /** Grouping
     * operasi untuk meng-grup kan element-element yang ada di collection
     * groupBy((T) -> K) : Map<K, List<T>> ==>> menggabungkan collection menjadi group map
     */
    val list1 = listOf("a", "c", "b", "c", "a", "b", "d", "c", "aa", "aa", "bb", "abc", "cc")
    val map: Map<String, List<String>> = list1.groupBy { it }
    println(map)
    val map2: Map<Int, List<String>> = list1.groupBy { it.length }
    println(map2)
}
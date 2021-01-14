package app

fun main() {
    /** Association
     * operasi transformasi dari collection menjadi map
     * dalam beberapa operasi association, element hasil bisa menjadi key atau value
     */
    val list1 = listOf("Android", "JAVA", "Kotlin")

//    val map1: Map<String, Int> = list1.associate { value -> Pair(value, value.length) }
    val map1: Map<String, Int> = list1.associate { Pair(it, it.length) }
    println(map1)
    val map2: Map<String, Int> = list1.associateWith { it.length }
    println(map2)
    val map3: Map<Int, String> = list1.associateBy { it.length }
    println(map3)
}
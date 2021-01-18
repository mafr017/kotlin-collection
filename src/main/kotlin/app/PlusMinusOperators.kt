package app

fun main() {
    /** Plus & Minus Operators
     * parameter pertama adalah collection, dan paramter selanjutnya bisa collection atau element, dan akan..
     * ..menghasilkan collection baru
     */
    val list1 = listOf("Muhammad", "Aditya", "Fathur")
    println(list1)
//    val list2 = list1.plus("Rahman")
    val list2 = list1 + "Rahman"
    println(list2)
    val list3 = list2 + listOf("Junior Android Developer", "JAVA", "Kotlin")
    println(list3)
//    val list4 = list3.minus("Junior Android Developer")
    val list4 = list3 - "Junior Android Developer"
    println(list4)
    val list5 = list3 - listOf("Junior Android Developer", "JAVA", "Kotlin")
    println(list5)

    println()

    val map1 = mapOf("A" to "Android", "K" to "Kotlin", "J" to "Java")
    println(map1)
//    val map2 = map1 + Pair("I", "Ionic")
    val map2 = map1 + ("I" to "Ionic")
    println(map2)
//    val map3 = map2 - "A" - "I"
    val map3 = map2 - listOf("A", "I")
    println(map3)
}
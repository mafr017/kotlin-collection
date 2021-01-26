package app

fun main() {
    /** Destructuring Declarations di Map
     * Map menyimpan datanya dalam Entry<K, V> dimana Entry memiliki function component1() untuk mendapatkan Key,..
     * ..dan component2() untuk mendapatkan value
     * hal ini memungkinkan melakukan destructuring di Entry Map
     */
    val map = mapOf(
        "a" to "Android",
        "k" to "Kotlin",
        "j" to "JAVA"
    )

//    for (entry in map) {
//        println("${entry.component1()} : ${entry.component2()}")
    for ((key, value) in map) {
        println("$key : $value")
    }
    println()

//    map.forEach { entry -> println("${entry.component1()} : ${entry.component2()}") }
    map.forEach { (key, value) -> println("$key : $value") }
}
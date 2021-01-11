package app

fun main() {
    /** Pair
     * representasi dari data yang berpasangan
     * di Map, Pair digunakan sebagai data Map ketika pertama kali Map dibuat
     */
    val pair1 = Pair("Aditya", "Fathur")
    println(pair1.first)
    println(pair1.second)

    val pair2: Pair<String, String> = "Aditya" to "Fathur"
    println(pair2.first)
    println(pair2.second)

    val pair3: Pair<String, Int> = "Aditya" to 22
    println(pair3.first)
    println(pair3.second)
}
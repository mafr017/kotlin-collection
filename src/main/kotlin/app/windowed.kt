package app

fun main() {
    /** Windowed
     * operasi untuk mendapatkan semua kemungkinan collection sesuai dengan range yang telah ditentukan
     */
    val range = (1..8).toList()
    println(range.windowed(5, 1, false))
    println(range.windowed(5, 1, true))
    println(range.windowed(5, 2, false))
    println(range.windowed(5, 2, false) { it.size })
    println(range.windowed(5, 2, true))
    println(range.windowed(5, 2, true) { it.size })
    println(range.windowed(2, 4, false))
}
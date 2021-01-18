package app

fun main() {
    /** Take & Drop Operators
     * operasi mengambil sebagian element di collection
     * take(n) ==>> mengambil collection diawala sejumlah n |->
     * takeLast(n) ==>> mengambil collection diakhir sejumlah n <-|
     * takeWhile((T) -> Boolean) ==>> mengambil element dari awal selama kondisi bernilai true
     * takeLastWhile((T) -> Boolean) ==>> mengambil element dari awal selama kondisi bernilai true, namun..
     * ..dimulai dari element akhir
     */
    val chars = ('a'..'z').toList()

    println(chars.take(3))
    println(chars.takeLast(5))
    println(chars.takeWhile { it < 'g' })
    println(chars.takeLastWhile { it > 'r' })

    println(chars.drop(17))
    println(chars.dropLast(17))
    println(chars.dropWhile { it < 'v' })
    println(chars.dropLastWhile { it > 'f' })
}
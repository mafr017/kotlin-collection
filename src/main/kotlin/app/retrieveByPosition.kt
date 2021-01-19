package app

fun main() {
    /** Retrieve Single Elements by Position
     * mengambil satu element di collection menggunakan posisi
     * elementAt(index) ==>> mengambil element pada posisi index
     * first() ==>> mengambil element pertama
     * last() ==>> mengambil element terakhir
     * elementAtOrNull(index) ==>> mengambil element pada posisi index, null jika tidak ada
     * elementAtOrElse(index, defaultValue) ==>> mengambil element pada posisi index, null jika tidak ada, atau..
     * ..defaultValue jika tidak ada
     */
    val set = setOf("Adroid", "Kotlin", "JAVA", "Ionic")
    println(set)
    println(set.first())
    println(set.last())
    println(set.elementAt(2))
    println(set.elementAtOrNull(6))
    println(set.elementAtOrElse(6) { "tidak ada!" })
}
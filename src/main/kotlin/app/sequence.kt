package app

fun main() {
    /** Sequence
     * Sequence sekilas sama dengan collection lain, namun berbeda cara kerjanya ketika kita menambahkan banyak..
     * ..operasi ke sequence
     * collection lain, ketika kita menambahkan beberapa operasi, semua akan dieksekusi secara eager. setiap proses..
     * ..akan mengembalikan collection baru.
     * berbeda dengan sequence, sequence mengeksekuksi semua operasi secara lazy. hanya akan dieksekusi ketika dibutuhkan
     *
     * digunakan ketika :
     * -data collection besar
     * -operasi collection kompleks dan banyak
     *
     * jangan digunakan ketika :
     * -data collection tidak terlalu besar, karena ada overhead lazy object di sequence
     * -operasi yang dilakukan sederhana
     */

//    CONTOH BUKAN SEQUENCE
    val words = "Menceritakan tentang pintu misterius yang dapat membawa orang ke sisi lain".split(" ")
    println(words)

    val result = words
        .filter {
            println("filter $it")
            it.length > 4
        }
        .map {
            println("map $it")
            it.toUpperCase()
        }
        .take(5)

    println(result)
    println("++++++++++++++++++++++++++++++++")
    println()

//    CONTOH SEQUENCE
    val sequence = words.asSequence()
//    val sequence = "Menceritakan tentang pintu misterius yang dapat membawa orang ke “sisi lain”".split(" ").asSequence()
//    val sequence = sequenceOf("asasd", "asdsad", "asdsad")
    val resultSequence = sequence
        .filter {
            println("filter $it")
            it.length > 5
        }
        .map {
            println("map $it")
            it.toUpperCase()
        }
        .take(5)

    println(resultSequence.toList())
}
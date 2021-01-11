package app

fun <T> displayCollection(collection: Collection<T>) {
    for (element in collection) {
        println(element)
    }
    println()
}

fun <T> displayMutableCollection(collection: MutableCollection<T>) {
    for (element in collection) {
        println(element)
    }
    println()
}

fun main() {
    /** Collection
     * semua data collection adalah turunan dari interface collection
     * digunakan sebagai general operation terhadap struktur data collection
     */
    displayCollection(listOf("Aditya", "Fathur", "Rahman"))
    displayCollection(mutableListOf("Aditya", "Fathur", "Rahman")) //ini bisa
    displayCollection(setOf("Aditya", "Fathur", "Rahman"))
    displayCollection(mutableSetOf("Aditya", "Fathur", "Rahman")) //ini bisa
    displayCollection(mapOf("Aditya" to "Fathur").entries)
    println()

    //mutable collection
//    displayMutableCollection(listOf("Aditya", "Fathur", "Rahman"))          //error karena tidak bisa berubah datanya
    displayMutableCollection(mutableListOf("Aditya", "Fathur", "Rahman"))
//    displayMutableCollection(setOf("Aditya", "Fathur", "Rahman"))           //error karena tidak bisa berubah datanya
    displayMutableCollection(mutableSetOf("Aditya", "Fathur", "Rahman"))
//    displayMutableCollection(mapOf("Aditya" to "Fathur").entries)           //error karena tidak bisa berubah datanya
    displayMutableCollection(mutableMapOf("Aditya" to "Fathur").entries)
}
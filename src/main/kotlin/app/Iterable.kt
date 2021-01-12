package app

fun <T> displayIterable(iterable: Iterable<T>) {
//    for (value in iterable) {
//        println(value)
//    }
    val iterator = iterable.iterator()
    while (iterator.hasNext()) {
        val value = iterator.next()
        println(value)
    }
}

fun <T> displayMutableIterable(iterable: MutableIterable<T>) {
    val iterator = iterable.iterator()
    while (iterator.hasNext()) {
        val value = iterator.next()
//        iterator.remove() //menghapus data di iterasi saat ini
        println(value)
    }
}

fun main() {
    /** Iterable
     * superclass dari collection interface
     * general operation untuk melakukan iterasi seluruh data di collection, atau menghapus data di collection
     */
    displayIterable(listOf("Aditya", "Fathur", "Rahman"))
    displayIterable(setOf("Aditya", "Fathur", "Rahman"))

    println()

    //mutable iterable (hanya bisa remove data saja)
    displayMutableIterable(mutableListOf("Aditya", "Fathur", "Rahman"))
}
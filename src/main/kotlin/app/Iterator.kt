package app

fun <T> displayListIterator(listIterator: ListIterator<T>) {
    println("Display Next")
    while (listIterator.hasNext()) {
        println(listIterator.next())
    }
    println()

    println("Display Previous")
    while (listIterator.hasPrevious()) {
        println(listIterator.previous())
    }
}

fun <T> displayMutableListIterator(mutableListIterator: MutableListIterator<T>) {
    while (mutableListIterator.hasNext()) println(mutableListIterator.next())
}

fun removeOddNumber(mutableListIterator: MutableListIterator<Int>) {
    while (mutableListIterator.hasNext()) {
        val value = mutableListIterator.next()
        if (value % 2 == 1) {
            mutableListIterator.remove()
        }
    }
}

fun main() {
    /** Iterator
     * Iterator memiliki child interface, yaitu ListIterator dan MutableListIterator
     * ListIterator digunakan oleh List, MutableListIterator digunakan oleh MutableList
     * set tetap menggunakan Iterator
     * sedangkan Map tidak mendukung Iterator
     */
    displayListIterator(listOf("Aditya", "Fathur", "Rahman").listIterator())

    val mutableList = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    removeOddNumber(mutableList.listIterator())
    displayMutableListIterator(mutableList.listIterator())
}
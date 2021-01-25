package app

import java.util.Comparator

data class Fruit(val name: String, val quantity: Int)

fun main() {
    /** Custom Ordering
     * operasi untuk membuat mengurutkan/comparable sendiri
     * sortedBy(selector: (T) -> (R))
     * sortedByDescending(selector: (T) -> (R))
     * sortedWith(Comparator<T>)
     */
    val fruits = listOf(
        Fruit("Apple", 10),
        Fruit("Orange", 7),
        Fruit("Banana", 4)
    )

    println(fruits.sortedBy { it.name })
    println(fruits.sortedByDescending { it.name })
    println(fruits.sortedBy { it.quantity })
    println(fruits.sortedByDescending { it.quantity })

    println(fruits.sortedWith(Comparator { fruit1, fruit2 ->
        fruit1.quantity.compareTo(fruit2.quantity)
    }))
    println(fruits.sortedWith(compareBy { it.quantity }))
    println(fruits.sortedBy { it.quantity })
}
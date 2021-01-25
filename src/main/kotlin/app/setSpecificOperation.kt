package app

fun main() {
    /** Set Specific Operation
     * union(collection) mengembalikan semua element dari kedua set
     * intersect(collection) mengembalikan semua element yang terdapat di kedua set
     * substract(collection) mengembalikan semua element yang dimiliki oleh set
     */
    val range1 = (1..10).toSet()
    val range2 = (6..15).toSet()

    println(range1.union(range2))
//    println(range1 union range2)

    println(range1.intersect(range2))

    println(range1.subtract(range2))
    println(range2.subtract(range1))
}
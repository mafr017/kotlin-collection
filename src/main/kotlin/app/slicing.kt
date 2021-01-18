package app

fun main() {
    /** Slicing
     * Slice adalah operator yang digunakan untuk mengambil sebagian element yang ada di collection yang sesuai..
     * ..dengan parameter range
     */
    val list1 = (0..100).toList()
    val list2 = list1.slice(50..60)
    val list3 = list1.slice(0..20 step 2)
    val list4 = list1.slice(100 downTo 90)
    val list5 = list1.slice(100 downTo 0 step 25)
//    println(list1)
    println(list2)
    println(list3)
    println(list4)
    println(list5)
}
package app

fun main() {
    /** Testing
     * operation yang bisa digunakan untuk mengecek isi data dari collection
     * hasil dari filtering testing adalah boolean
     * any((T) -> Boolean) -> apakah minimal ada satu data yang sesuai dengan kondisi
     * none((T) -> Boolean) -> apakah tidak ada satupun data yang sesuai dengan kondisi
     * all((T) -> Boolean) -> apakah semua data yang sesuai dengan kondisi
     * any() -> apakah collection memiliki data
     * none() -> apakah collection tidak memiliki data
     */
    val list1 = listOf("Android", "Kotlin", "JAVA", "Ionic")
    println(list1.any { it.length > 5 })
    println(list1.none { it.length > 0 })
    println(list1.all { it.length > 0 })
    println(list1.any())
    println(list1.none())
}
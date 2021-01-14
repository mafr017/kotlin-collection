package app

fun main() {
    /** Filtering
     * filtering bisa menggunakan predicate berupa  lambda yang berisi kondisi filter nya
     * jika return dari predicate true, maka data diterima, jika false maka data dibuang
     */
    val list1 = listOf("Android", "JAVA", "Kotlin", "Flutter", "React Native", "Ionic")
    val list2 = list1.filter { it.length > 5 }
    println(list2)
    println()
    val list3 = list1.filterIndexed { index, value -> index % 2 == 0 }
    println(list3)
    println()
    val list4 = listOf(null, 9, "April", 1998, null, "M Aditya FR")
    val listString = list4.filterIsInstance<String>()
    println(listString)
    val listInt = list4.filterIsInstance<Int>()
    println(listInt)
    val listNotNull = list4.filterNotNull()
    println(listNotNull)
}
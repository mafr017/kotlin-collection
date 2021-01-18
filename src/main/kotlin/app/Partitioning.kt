package app

fun main() {
    /** Partitioning
     * pada filtering by predicate, akan menghilangkan data yang tidak masuk kondisi filter
     * dengan filtering partitioning, kita akan membagi collection menjadi dua, dimana collection pertama..
     * ..yang masuk filtering, dan collection kedua yang tidak masuk filtering
     */
//    val pair: Pair<list<String>, List<Any>> = list.partition {  }
    val list = listOf("M Aditya FR", 9, 4, 1998, "Bandung")
    val (listMatch, listNotMatch) = list.partition { it is String }
    println(list)
    println(listMatch)
    println(listNotMatch)

}
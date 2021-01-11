package app

fun main() {
    /** List
     * collection yang datanya seperti Array dan memiliki akses data menggunakan index
     * data di list boleh di-duplicate
     * secara standar list bersifat imutable
     */
    val list: List<String> = listOf("Aditya", "Kotlin", "Android") //imutable list

    println(list[0])
    println(list[1])
    println(list[2])
    println(list.indexOf("Aditya"))
    println(list.indexOf("Tidak Ada"))
    println(list.contains("Aditya"))
    println(list.contains("Tidak Ada"))
    println(list.containsAll(listOf("Aditya", "Kotlin")))
    println(list.containsAll(listOf("Aditya", "Tidak Ada")))
    println(list.isEmpty())
    println(list.isNotEmpty())
    println()

    //list yang bisa ditambah atau diubah (mutablelist)
    val mutablelist: MutableList<String> = mutableListOf() //boleh dikosongkan elementnya
    mutablelist.add("Kotlin")
    mutablelist.add("Android")
    mutablelist.add("Developer")
    mutablelist.add("Aditya")

    println(mutablelist[0])
    println(mutablelist[1])
    println(mutablelist[2])
    println(mutablelist[3])
    println(mutablelist)
    println(mutablelist.remove("Aditya"))
    println(mutablelist.removeAt(2))
    println(mutablelist)
}
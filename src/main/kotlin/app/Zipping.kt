package app

fun main() {
    /** Zipping
     * transformasi yang digunakan untuk menggabungkan dua buah collection
     */
    val list1 = listOf("Aditya", "Fathur", "Rahman")
    val list2 = listOf("Android", "JAVA", "Kotlin")
    val list22 = listOf("Android", "Kotlin")

//    val list3: List<Pair<String, String>> = list1.zip(list2)
//    val list4: List<String> = list1.zip(list2) { item1, item2 ->
//        item1 + item2
//    }
    val list3 = list1.zip(list2)
    val list33 = list1.zip(list22)
    val list4 = list1.zip(list2) { item1, item2 ->
        item1 + " " + item2
    }
    val list44 = list1.zip(list2) { item1, item2 ->
        item1 to item2
    }

    println(list3)
    println(list33)
    println(list4)
    println(list44)
    println()

    val list5: List<Pair<String, String>> = listOf(
        "Aditya" to "Android",
        "Fathur" to "JAVA",
        "Rahman" to "Kotlin"
    )
    val pair: Pair<List<String>, List<String>> = list5.unzip()
    println(pair.first)
    println(pair.second)
    println()

    val (list6, list7) = list5.unzip()
    println(list6)
    println(list7)
}
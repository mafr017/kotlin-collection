package app

fun main() {
    /** Map
     * collection yang berbentuk key-value, dimana key berperan sebagai index
     * key harus unik, jika menggunakan key yang sama, maka data sebelumnya akan di replace
     * tipe data key bisa menggunakan tipe data apapun
     */
    val map: Map<String, String> = mapOf(
        "a" to "Android",
        "b" to "Kotlin",
        "c" to "Java",
        "c" to "JAVA"
    )

    println(map)
    println(map.keys)
    println(map.values)
    println(map.size)
    println(map["a"])
//    println(map[1]) //hasilnya akan null, karena map tidak bisa dipanggil dengan index
    println(map["b"])
    println(map["c"])

    for ((key, value) in map) {
        println("$key to $value")
    }

    val mutableMap: MutableMap<String, String> = mutableMapOf()
    mutableMap.put("a", "Muhammad")
    mutableMap["b"] = "Aditya"
    mutableMap["c"] = "Fathur"
    mutableMap["d"] = "Rahman"
    mutableMap["e"] = "Kotlin"

    println(mutableMap)
    println(mutableMap.get("b"))
    println(mutableMap["d"])
    println(mutableMap.getOrDefault("f", "tidak ada"))
    println(mutableMap.remove("e"))
    println(mutableMap)

    for ((key, value) in mutableMap) {
        println("$key to $value")
    }

}
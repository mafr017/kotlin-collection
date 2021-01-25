package app

fun main() {
    /** Map Specific Operation
     * getOrElse(key, (key) -> V) mengambil value sesuai key, jika tidak ada eksekusi lambda
     * getValue(key) mengambil value sesuai key atau throw exception
     * filter((Entry<K, V>) -> Boolean) filter sesuai kondisi
     * filterKeys((K) -> Boolean) filter dengan kondisi key
     * filterValues((V) -> Boolean) filter dengan kondisi value
     */
    val map = mapOf("a" to "Android", "k" to "Kotlin", "j" to "JAVA")
    println(map.get("a"))
    println(map.getValue("a"))
//    println(map.getValue("b"))        // exception
    println(map.getOrElse("c") {"Tidak ada"})
    println(map.filter { entry -> entry.value.length > 5 })
    println(map.filterKeys { it != "b" })
    println(map.filterValues { it.length > 5 })
}
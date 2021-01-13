package app

fun main() {
    /** Mapping
     * transformasi mapping digunakan untuk mengubah data ke data lain
     * mapping membutuhkan lambda function sebagai parameter, dan akan mengembalikan collection hasil resilt lambda nya
     * urutan collection baru hasil dari mapping adalah sama dengan urutan collection aslinya
     */

    /** Mapping Operations
     * map -> mengubah collection menjadi collection baru sesuai lambda transform
     * mapIndexed -> dengan tambahan parameter index
     * mapNotNull -> menghiraukan hasil null
     * mapIndexedNotNull -> dengan tambahan parameter index dan menghiraukan nilai null
     */

    val list: List<String> = listOf("Aditya", "Fathur", "Rahman")
    //cara manual
//    val temp = mutableListOf<String>()
//    for (value in list) {
//        temp.add(value.toUpperCase())
//    }
//    val list2 = temp.toList()
//    println(list2)

    //cara praktis
//    val list2 = list.map { value -> value.toUpperCase() }
    val list2 = list.map { it.toUpperCase() }
    println(list2)
    println()

    val set = setOf("Aditya", "Fathur", "Rahman")
    val set2 = set.map { it.toLowerCase() }
    println(set2)
    println()

    val names = listOf("Muhammad", "Aditya", "Fathur", "Rahman", "MAFR")
    val namesganjil = names.mapIndexedNotNull { index: Int, name: String ->
        if (index % 2 == 0) null
        else name
    }
    println(namesganjil)

    val numbers = (1..100).toList()
    val ganjil = numbers.mapNotNull {
        if (it % 2 == 0) null
        else it
    }
    println(ganjil)

    /** Mapping operations untuk map
     * mapKeys -> mengubah map menjadi map baru dengan nilai key baru sesuai dengan lambda transform
     * mapValues -> mengubah map menjadi map baru dengan nilai value baru sesuai dengan lambda transform
     */
    val map1: Map<Int, String> = mapOf(
        1 to "Aditya",
        2 to "Fathur",
        3 to "Rahman"
    )
    val mapkeys = map1.mapKeys { it.key * 10 }
    println(mapkeys)

    val mapvalues = map1.mapValues { it.value.toUpperCase() }
    println(mapvalues)
}
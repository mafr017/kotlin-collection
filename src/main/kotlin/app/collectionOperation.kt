package app

fun main() {
    /** Collection Operations
     * kotlin menyediakan operations tambahan berupa extension function
     * extension function menghasilkan collection baru, tanpa mengubah data di collection aslinya
     * sehingga collection aslinya aman
     */

    /** Jenis Opeartions
     * Transformations, transformasi terhadap collection
     * Filetering, filtering atau seleksi terhadap collection
     * plus and minus operators, operasi + dan - terhadap collection
     * Grouping, pemisahan dalam group terhadap collection
     * Retrieving collection parts, mengambil sebagian data di collection
     * Retrieving single elements, mengambil satu data di collection
     * Ordering, pengurutan data di collection
     * Aggregate operations, melakukan agregasi terhadap data yang ada di collection
     */

    //function untuk meng-iterasi " .forEach " mengiterasi hanya value nya saja dan " .forEachIndexed " mengiterasi value dan index
    listOf("Aditya", "Fathur", "Rahman").forEach {
        println(it)
    }

    mutableListOf("Aditya", "Fathur", "Rahman").forEachIndexed { index, value ->
        println("$index : $value")
    }
}
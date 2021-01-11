package app

import data.Person

fun main() {
    /** Set
     * collection yang datanya harus unik dan tidak pasti berurut
     * ketika memasukan data duplicate, maka hanya satu data saja yang akan disimpan
     * cocok untuk menyimpan data yang memang unik (tidak boleh sama)
     * Set menggunakan function hashCode() dan equals() untuk membandingkan data duplicate
     * secara default bersifat imutable
     */
    val setOrg: Set<Person> = setOf(
        Person("Aditya"), Person("Fathur"), Person("Rahman"), Person("Aditya")
    )

    println(setOrg.size)
    println(setOrg.contains(Person("Aditya")))

    for (org in setOrg) {
        println(org)
    }

    val mutableSetOrang: MutableSet<Person> = mutableSetOf() //boleh dikosongkan
    mutableSetOrang.add(Person("Android"))
    mutableSetOrang.add(Person("JAVA"))
    mutableSetOrang.add(Person("Kotlin"))
    mutableSetOrang.add(Person("JAVA"))
    mutableSetOrang.add(Person("Flutter"))

    println(mutableSetOrang.size)
    println(mutableSetOrang.contains(Person("Kotlin")))

    mutableSetOrang.remove(Person("Flutter"))
    println(mutableSetOrang.size)
    println(mutableSetOrang)
}
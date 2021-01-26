package app

class Application(map: Map<String, Any>) {
    val name: String by map
    val version: Int by map
}

fun main() {
    /** Properties di Map
     * menyimpan value properties di Map (hal ini dilakukan ketika parsing data JSON atau hal-hal dinamis lainnya.)
     * keaddan tersebut dapat kita lakukan menggunakan delegate properties di Map
     */
    val map = mapOf(
        "name" to "Belajar Kotlin",
        "version" to 1.0
    )

    val application = Application(map)

    println(application.name)
    println(application.version)
}
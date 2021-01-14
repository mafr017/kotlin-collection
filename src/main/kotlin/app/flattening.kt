package app

class Member(val name: String, val hobies: List<String>)

fun main() {
    /** Flattening
     * menjadikan nested collection menjadi flat (menggabungkan 2 atau lebih collection di dalam collection)
     * flatten
     */
    val list1: List<List<String>> = listOf(
        listOf("Aditya", "Fathur", "Rahman"),
        listOf("Android", "JAVA", "Kotlin"),
        listOf("Mobile", "Developer", "Fullstack")
    )
    val listString: List<String> = list1.flatten()
    println(listString)
    println()

    val members: List<Member> = listOf(
        Member("Aditya", listOf("Gaming", "Coding")),
        Member("Rika", listOf("Drawing", "Gaming"))
    )
//    val hobies = members.map {it.hobies}.flatten()
    val hobies: List<String> = members.flatMap { it.hobies }
    println(hobies)
}
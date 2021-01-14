package app

fun main() {
    /** String Representation
     * mengubah collection menjadi string
     */
    val list: List<String> = listOf("Aditya", "Fathur", "Rahman")

    val string1: String = list.joinToString(" ", "|", "|")
    println(string1)

    val string2: String = list.joinToString(" ", "|", "|") { it.toUpperCase() }
    println(string2)

//    val builder = StringBuilder()
//    list.joinTo(builder, " ", "|", "|")
//    list.joinTo(builder, " ", "<", ">")
//    list.joinTo(builder, " ", "#", "#")
//    val string3 = builder.toString()
//    println(string3)

    val builder1 = StringBuilder()
    val builder2 = StringBuilder()
    val builder3 = StringBuilder()
    list.joinTo(builder1, " ", "|", "|")
    list.joinTo(builder2, " ", "<", ">")
    list.joinTo(builder3, " ", "#", "#")
    val string3 = builder1.toString()
    println(string3)
    val string4 = builder2.toString()
    println(string4)
    val string5 = builder3.toString()
    println(string5)

    val numbers: List<Int> = (1..12).toList()
    println(numbers.joinToString())
}

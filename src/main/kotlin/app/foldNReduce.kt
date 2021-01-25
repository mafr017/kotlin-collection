package app

fun main() {
    /** Fold & Reduce
     * untuk membuat aggregate secara manual, gunakan operator fold & reduce
     * fold dan reduce merupakan operasi yang dilakukan pada element-element yang ada di collection secara iterasi..
     * ..sequential dan mengembalikan hasil
     * hasil dari operasi ini akan digunakan untuk iterasi selanjutnya
     */
    val numbers = (1..100).toList().shuffled()
    println(numbers)

    val max = numbers.reduce { first, second ->
        if ( first > second ) first
        else second
    }
    val min = numbers.reduce { first, second ->
        if ( first < second ) first
        else second
    }
    val sum = numbers.fold(0) { first, second ->
        first + second
    }

    println(max)
    println(min)
    println(sum)

    val names = listOf("Android", "Kotlin", "JAVA")
    val count = names.fold(0) { first, second ->
        first + 1
    }
    println(names)
    println(count)
}
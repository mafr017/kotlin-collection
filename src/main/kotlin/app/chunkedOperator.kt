package app

fun main() {
    /** Chunked Operator
     * operasi untuk memotong collection menjadi beberapa collection
     * chunked(n): List<List<T>> ==>> memotong menjadi beberapa collection dengan jumlah data n
     * chunked(n, (List<T>) -> R): List<R> ==>> memotong menjadi beberapa collection dengan jumlah data n..
     * ..lalu melakukan transformasi List<T> menjadi R, sehingga menghasilkan List<R>
     */
    val range = (1..100).toList()
    val list1 = range.chunked(10)
    println(list1)
//    val list2 = range.chunked(10).map { values ->
//        var total = 0
//        for (value in values) {
//            total += value
//        }
//        total
//    }
    val list2 = range.chunked(10)  { values ->
        var total = 0
        for (value in values) {
            total += value
        }
        total
    }
    println(list2)
}
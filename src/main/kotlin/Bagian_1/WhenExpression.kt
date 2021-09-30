fun main () {
    println()
    println("Silahkan ketik a/b/c ")
    val ketik : String? = readLine()
    var nilai = println("Yang kamu ketik adalah : $ketik").toString()

    println()
    println("Hasilnya adalah ")
    when(nilai) {
        'a'.toString() -> println("Lukman")
        'b'.toString() -> println("Elfa")
        'c'.toString() -> println("Haiqa")
        else -> println("Syifa")
    }
}
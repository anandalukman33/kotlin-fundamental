fun main() {
    println("== Membuat function dengan banyak variabel ==")
    manyData("Nama ku Lukman", 23, "Ganteng Maksimal")
    println()
    println("------------------------------------------------------------------- ")
    println()

    println("== Nilai balik dari suatu function ==")
    val namaKu = returnValue()
    print(namaKu)
    println()
    println("------------------------------------------------------------------- ")
    println()
}
//
fun manyData(Lukman: String, Umur: Int, Kegantengan: String) {
    println(Lukman)
    println(Umur)
    println(Kegantengan)
}

private fun returnValue() : String{
    val name = "Lukman"
    return name
}
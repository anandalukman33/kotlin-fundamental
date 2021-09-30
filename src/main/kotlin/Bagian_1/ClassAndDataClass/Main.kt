package Bagian_1.ClassAndDataClass

fun main () {
    val lukman = Sample()
    lukman.name()
    lukman.hobi("Hobiku bermain futsal","Hobiku bermain game")
    println()
    println("[ Ini adalah contoh dari pengambilan nilai dari class sample ]")

    val ketikJudul = readLine()
    val ketikSynopsis = readLine()
    val ketikEpisode = readLine()
    val ketikRating = readLine()

    val mAnime = Anime()
    mAnime.description("$ketikJudul", "$ketikSynopsis", "$ketikEpisode", "$ketikRating")
}
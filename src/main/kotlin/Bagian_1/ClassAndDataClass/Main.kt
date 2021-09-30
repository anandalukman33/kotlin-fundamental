package Bagian_1.ClassAndDataClass

import javax.xml.crypto.Data

fun main () {
    // class Sample
    val lukman = Sample()
    lukman.name()
    lukman.hobi("Hobiku bermain futsal","Hobiku bermain game")
    println()
    println("[ Ini adalah contoh dari pengambilan nilai dari class sample ]")

    // class Anime
    println("")
    println("[ Class Anime (Ketikan yang diperitahkan) ]")
    println("")
    val mAnime = Anime()
    println("Silahkan ketik Judul Anime yang kamu sukai")
    val ketikJudul = readLine()
    println("Silahkan ketik Sinopsis Animenya")
    val ketikSynopsis = readLine()
    println("Ada berapa epside?")
    val ketikEpisode = readLine()
    println("Ratingnya berapa")
    val ketikRating = readLine()
    mAnime.description("$ketikJudul", "$ketikSynopsis", "$ketikEpisode", "$ketikRating")

    // class Null
    val mNull = Null()
    mNull.name = "asd" // ini dari variabel name yang bertipe string dengan value null yang di timpa oleh hardcode di main dengan value asd
    println(mNull.name)


    //Class DatasClass
    val datasClass = DatasClass("Lukman", "12","Taman Kedaung")
    println(datasClass.name)
    println(datasClass.age)
    println(datasClass.address)
}
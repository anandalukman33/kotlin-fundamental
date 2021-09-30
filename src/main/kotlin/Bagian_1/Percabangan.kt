/*
 Belajar percabagan Kotlin menggunakan readLine untuk menerima input yang kita ketik
 lalu karena angka berarti angka didalam logic IF harus diconvert menjadi string.
 */

fun main() {
    println("Silahkan ketik angka di bawah ini! ")
    val value = readLine()

    if (value != null)
        // nilai yang lebih dari 60 dan nilai yang kurang dari 60 maka Lulus.
    if (value > 60.toString() && value < 90.toString()) {
        println("Selamat anda Lulus")
        // nilai yang lebih dari 90 maka Awesome
    } else if (value > 90.toString()) {
        println("Mantap jiwa kawan")
    } else {
        // nilai yang kurang dari logic if dan else if diatas
        // atau kurang dari 60 maka tidak lulus
        println("Tidak lulus")
    }
}
package Bagian_1

class ForLooping {
}

fun main () {

    val member = arrayOf("Ananda","Muhamad","Lukman")

    for (name in member){
        //println(name)
    }

    for (i in 0..10 step 2) {
        //println(i)
    }

    for (i in 10 downTo  0 step 5) {
        //println(i)
    }

    for (i in member.indices) {
        println(i)
    }
}
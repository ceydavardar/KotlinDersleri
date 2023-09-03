package com.example.kotlindersleri.degiskenler

import kotlin.math.ln

fun main() {

    //Sayısaldan sayısala
    val i = 42
    val d = 77.98

    val sonuc1 = i.toDouble()
    val sonuc2 = d.toInt()

    println(sonuc1)
    println(sonuc2)

    //Sayısaldan metine
    val sonuc3 = i.toString()
    val sonuc4 = d.toString()
    println(sonuc3)
    println(sonuc4)

    //Metinden Sayısala
    val yazi = "76.90a"

    val sonuc5 = yazi.toDoubleOrNull()

    if (sonuc5 != null){
        println(sonuc5)
    }else{
        println("hatalı.")
    }

    val metin = "66"
    val sonuc6 = metin.toIntOrNull()

    sonuc6?.let {
        println(it)
    }



    println("-----------------")
    val golub = listOf("Huysuz", "Yaramaz", "Bebeğine aşık")
    println(golub)
    println(golub.joinToString(","))

    println("golub".golub())
    val kusKokusu = 3 carpanı 5
    println(kusKokusu)

    val logaritma = 3 logaritmasi 5
    println(logaritma)

}

fun String.golub(): String {
    return "$this güzel kokar"
}

infix fun Int.carpanı(sayi: Int): Int{
    return this*sayi

}

infix fun Int.logaritmasi(base: Int): Double {
    return if (this > 0 && base > 1 && base != 0 && this != 1) {
        ln(this.toDouble()) / Math.log(base.toDouble())
    } else {
        Double.NaN // Return NaN for invalid inputs
    }
}
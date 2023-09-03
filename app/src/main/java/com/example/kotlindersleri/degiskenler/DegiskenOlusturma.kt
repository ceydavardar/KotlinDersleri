package com.example.kotlindersleri.degiskenler

fun main() {
    val ogrenciAdi = "Ceyda"
    val ogrenciYas = 25
    val ogrenciBoy = 1.70
    val ogrenciBasHarf = 'C'
    val ogrenciDevamEdiyorMu = true

    println(ogrenciAdi)
    println(ogrenciYas)
    println(ogrenciBoy)
    println(ogrenciBasHarf)
    println(ogrenciDevamEdiyorMu)

    val urun_id: Int = 3416
    val urun_adi: String = "HP"
    val urun_adet: Int = 100
    val urun_fiyat: Double = 34500.99
    val urun_tedarikçi: String = "xyz"

    println("Ürün id : $urun_id")
    println("Ürün adı : $urun_adi")
    println("Ürün adet : $urun_adet")
    println("Ürün fiyat : $urun_fiyat")
    println("Ürün tedarikçi : $urun_tedarikçi")

    val a = 10
    val b = 20

    println("$a x $b : ${a*b}")

    //Sabitler - Constant (javada final)

    var sayi = 30
    println(sayi)
    sayi = 100
    println(sayi)
}
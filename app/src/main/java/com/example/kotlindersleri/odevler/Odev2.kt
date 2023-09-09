package com.example.kotlindersleri.odevler

fun icAcilariniHesapla(kenar: Int): Int {

    if (kenar > 2) {
        val icAcılarToplami = (kenar-2)*180
        return icAcılarToplami
    } else {
        return 0
    }

}

fun maasHesapla(gun: Int): Double {

    val saatlikMaas = 10.0
    val mesaiUcreti = 20.0
    val gunlukCalismaSaati = 8

    val toplamCalisma = gun * gunlukCalismaSaati

    var mesaiSuresi: Int = 0

    if (toplamCalisma > 160) {
        mesaiSuresi = toplamCalisma - 160
    }

    val maas = (gun * gunlukCalismaSaati * saatlikMaas) + (mesaiSuresi * mesaiUcreti)

    return maas

}

fun fahrenheitaCevir(celsius: Double): Double {

    val fahrenheit = celsius * 1.8 + 32

    return fahrenheit

}

fun cevreHesapla(uzunKenar: Double, kisaKenar: Double): Double {

    val cevre = (kisaKenar + uzunKenar) * 2

    return cevre

}

fun faktoriyelHesapla(sayi: Int): Long {

    var faktoriyel: Long = 1

    for (i in 1..sayi) {
        faktoriyel *= i.toLong()
    }

    return faktoriyel

}

fun faturaHesapla(kota: Int): Double {

    val elliGBfiyat = 100.0
    val ekstraGBFiyat = 4.0

    val kotaAsimi = kota - 50

    var ekstraUcret = 0.0

    if (kotaAsimi > 0) {
        ekstraUcret = kotaAsimi * ekstraGBFiyat
    }

    return elliGBfiyat + ekstraUcret

}

fun aHarfiniSay(kelime: String): Int {

    val harfler = kelime.toCharArray()

    var harfSayisi = 0

    for (harf in harfler) {
        if (harf == 'a') {
            harfSayisi++
        }
    }

    return harfSayisi

}
package com.example.kotlindersleri

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var mesaj:String? = null  //bunu çok tercih etmiyoruz.

    lateinit var yazi:String  //daha sonra init edeceğim/tanımlayacağım


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}


//soru : lateinit tanımlarsak val kullanabilir miyiz? hayır. daha sonra değer
//atayacağımız için val ile kullanılmaz.
// lateinit var sayi:Int (şeklinde bir kullanım olmaz- ilkel tiplerde,
    // bir atama sanımlama yapmamız gerekir)

//veri tabanındaki özellikleri class'a aktarma -> Composition

//overriding : bunun olması için özellik aktarımı olması lazım(kalıtım) -mülakatlarda!
//overloading : metodun tekrar kullanılması.

//emülator : wipe data (fabrika ayarlarına dönme)

//hashset ile arraylist arasındaki fark (mülakatlarda çıkıyor)

//material color (material design) - uplabs.com(tasarım için) - color.adobe.com
//klavyeden n ile gece modu
//google fonts
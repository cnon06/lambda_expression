package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      var tt =  {sayi: String -> println(sayi) }
        //bu tür yazıma lambda expression deniliyor

       
        gdggffg("Sinem",tt)
    }

    fun gdggffg(ad: String, action: (String) -> Unit)

    {
    for(i in 1..10)    action (ad)
    }


}
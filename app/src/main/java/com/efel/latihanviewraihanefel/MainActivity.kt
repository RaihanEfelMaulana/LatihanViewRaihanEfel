package com.efel.latihanviewraihanefel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private lateinit var listHome: ListView
    lateinit var btn: Button
    private var homeArrayList: ArrayList<HomeModel>?=null
    private var homeAdapter: HomeAdapter?=null

    val homeImageList= intArrayOf(

        R.drawable.rumah1, R.drawable.rumah2,
        R.drawable.rumah3, R.drawable.rumah4,
        R.drawable.rumah5, R.drawable.rumah6,
        R.drawable.rumah7, R.drawable.rumah8,
        R.drawable.rumah9, R.drawable.rumah10
    )

    private val luasBangunanList = arrayOf(
        "20x20 m","25x20 m","25x27 m","30x20 m","23x21 m",
        "15x15 m","18x18 m","24x26 m","28x27 m","26x27 m"
    )

    private val luasTanahList= arrayOf(
        "15x15 m","18x18 m","24x26 m","28x27 m","26x27 m",
        "20x20 m","25x20 m","25x27 m","30x20 m","23x21 m"
    )

    private val kamarTidurList= arrayOf(
        "1","2","3","4","3",
        "2","4","3","2","1"
    )

    private val kamarMandiList= arrayOf(
        "2","1","1","3","1",
        "1","3","2","1","2"
    )

    private val alamatList= arrayOf(
        "Solok","Padang","Bukittinggi","Sungai Penuh","Suliki",
        "Cengkeh","Indaruang","Banda Buek","Lubeg","Sungai Limau"
    )

    private val hargaList= arrayOf(
        "Rp. 100.000.000","Rp. 150.000.000","Rp. 180.000.000","Rp. 200.000.000","Rp. 190.000.000",
        "Rp. 276.000.000","Rp. 250.000.000","Rp. 120.000.000","Rp. 220.000.000","Rp. 200.000.000"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listHome = findViewById(R.id.listHome)
        homeArrayList = populateList()
        Log.d("success", homeArrayList!!.size.toString()+"")
        homeAdapter=HomeAdapter(this,homeArrayList!!)
        listHome.adapter= homeAdapter
        btn = findViewById(R.id.btngrid)

        btn.setOnClickListener {
            val intent = Intent(this,ResultActivity::class.java)
            startActivity(intent)
        }
    }

    private fun populateList(): ArrayList<HomeModel>? {
        val list = ArrayList<HomeModel>()
        for (i in 0..9) {

            var food = HomeModel()
            food.setluasBangunan("Luas Bangunan : "+luasBangunanList[i])
            food.sethomeImage(homeImageList[i])
            food.setluasTanah("Luas Tanah : "+luasTanahList[i])
            food.setkamarTidur("Kamar Tidur : "+kamarTidurList[i])
            food.setkamarMandi("Kamar Mandi : "+kamarMandiList[i])
            food.setalamat("Alamat : "+alamatList[i])
            food.setharga("Harga : "+hargaList[i])
            list.add(food)
        }

        return list
    }
}
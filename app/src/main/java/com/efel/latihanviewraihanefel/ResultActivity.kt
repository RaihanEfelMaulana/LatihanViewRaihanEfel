package com.efel.latihanviewraihanefel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Button
import android.widget.GridView
import android.widget.Toast

class ResultActivity : AppCompatActivity() {
    private lateinit var gridView: GridView
    lateinit var btn: Button
    private lateinit var gridRumahList: List<GridModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        gridView= findViewById(R.id.gridHome)
        gridRumahList= ArrayList<GridModel>()
        gridRumahList=gridRumahList+GridModel("Luas Bangunan : 20x30 m",R.drawable.rumah1,"Luas Tanah : 26x29 m","1 Kamar Tidur","3 Kamar Mandi","Alamat : Padang","Rp. 150.000.000")
        gridRumahList= gridRumahList+ GridModel("Luas Bangunan : 10x20 m", R.drawable.rumah2,"Luas Tanah : 20x24 m","3 Kamar Tidur","4 Kamar Mandi","Alamat : Solok","Rp. 200.000.000")
        gridRumahList= gridRumahList+ GridModel("Luas Bangunan : 22x25 m", R.drawable.rumah3,"Luas Tanah : 22x21 m","2 Kamar Tidur","1 Kamar Mandi","Alamat : SUliki","Rp. 160.000.000")
        gridRumahList= gridRumahList+ GridModel("Luas Bangunan : 20x20 m", R.drawable.rumah4,"Luas Tanah : 30x20 m","4 Kamar Tidur","2 Kamar Mandi","Alamat : Indaruang","Rp. 120.000.000")
        gridRumahList= gridRumahList+ GridModel("Luas Bangunan : 23x26 m", R.drawable.rumah5,"Luas Tanah : 19x23 m","2 Kamar Tidur","1 Kamar Mandi","Alamat : Cengkeh","Rp. 220.000.000")
        gridRumahList= gridRumahList+ GridModel("Luas Bangunan : 19x23 m", R.drawable.rumah6,"Luas Tanah : 23x26 m","1 Kamar Tidur","2 Kamar Mandi","Alamat : Banda buek","Rp. 120.000.000")
        gridRumahList= gridRumahList+ GridModel("Luas Bangunan : 30x20 m", R.drawable.rumah7,"Luas Tanah : 20x20 m","3 Kamar Tidur","2 Kamar Mandi","Alamat : Bukittinggi","Rp. 190.000.000")
        gridRumahList= gridRumahList+ GridModel("Luas Bangunan : 22x21 m", R.drawable.rumah8,"Luas Tanah : 22x25 m","1 Kamar Tidur","4 Kamar Mandi","Alamat : lubeg","Rp. 250.000.000")
        gridRumahList= gridRumahList+ GridModel("Luas Bangunan : 20x24 m", R.drawable.rumah9,"Luas Tanah : 10x20 m","2 Kamar Tidur","4 Kamar Mandi","Alamat : lumin","Rp. 210.000.000")
        gridRumahList= gridRumahList+ GridModel("Luas Bangunan : 26x29 m", R.drawable.rumah10,"Luas Tanah : 20x30 m","4 Kamar Tidur","2 Kamar Mandi","Alamat : padang","Rp. 170.000.000")

        btn = findViewById(R.id.btnlist)

        btn.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        val gridMobilAdapter= GridAdapter(gridRumahList,this )
        gridView.adapter= gridMobilAdapter
        gridView.onItemClickListener= AdapterView.OnItemClickListener{ adapterView, view, i, l ->
            Toast.makeText(applicationContext, "Pilihan Harga : "+gridRumahList[i].harga,
                Toast.LENGTH_LONG).show()
        }

    }
}
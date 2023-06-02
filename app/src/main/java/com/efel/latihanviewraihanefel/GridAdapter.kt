package com.efel.latihanviewraihanefel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class GridAdapter (
    private val gridRumahList: List<GridModel>,
    private val context: Context
): BaseAdapter() {
    private lateinit var luasBangunan: TextView
    private lateinit var homeImage: ImageView
    private lateinit var luasTanah: TextView
    private lateinit var kamarTidur: TextView
    private lateinit var kamarMandi: TextView
    private lateinit var alamat: TextView
    private lateinit var harga: TextView
    private var layoutInflater: LayoutInflater?=null
    override fun getCount(): Int {
        return gridRumahList.size
    }
    override fun getItem(p0: Int): Any {
        return p0
    }
    override fun getItemId(p0: Int): Long {
        return 0
    }
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var view=p1
        if(layoutInflater==null){
            layoutInflater= context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)
                    as LayoutInflater
        }
        if (view==null){
            view= layoutInflater!!.inflate(R.layout.grid_rumah, null)
        }
        homeImage = view!!.findViewById(R.id.homeImage)
        luasBangunan = view!!.findViewById(R.id.luasBangunan)
        luasTanah = view!!.findViewById(R.id.luasTanah)
        kamarTidur = view!!.findViewById(R.id.kamarTidur)
        kamarMandi = view!!.findViewById(R.id.kamarMandi)
        alamat = view!!.findViewById(R.id.alamat)
        harga = view!!.findViewById(R.id.harga)

        homeImage.setImageResource(gridRumahList.get(p0).homeImage)
        luasBangunan.setText(gridRumahList.get(p0).luasBangunan)
        luasTanah.setText(gridRumahList.get(p0).luasTanah)
        kamarTidur.setText(gridRumahList.get(p0).kamarTidur)
        kamarMandi.setText(gridRumahList.get(p0).kamarMandi)
        alamat.setText(gridRumahList.get(p0).alamat)
        harga.setText(gridRumahList.get(p0).harga)

        return view
    }
}
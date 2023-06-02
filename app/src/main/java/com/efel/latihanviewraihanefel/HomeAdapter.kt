package com.efel.latihanviewraihanefel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class HomeAdapter (
    private val context: Context,
    private val foodArrayList: ArrayList<HomeModel>
): BaseAdapter() {

    override fun getViewTypeCount(): Int {
        return count
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun getCount(): Int {
        return foodArrayList.size
    }

    override fun getItem(p0: Int): Any {
        return p0
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var convertView = p1
        val holder:ViewHolder
        if (convertView==null){
            holder = ViewHolder()
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.home_item,null,true)

            holder.luasBangunan=convertView.findViewById(R.id.luasBangunan)
            holder.luasTanah=convertView.findViewById(R.id.luasTanah)
            holder.homeImage=convertView.findViewById(R.id.homeImage)
            holder.kamarTidur=convertView.findViewById(R.id.kamarTidur)
            holder.kamarMandi=convertView.findViewById(R.id.kamarMandi)
            holder.alamat=convertView.findViewById(R.id.alamat)
            holder.harga=convertView.findViewById(R.id.harga)
            convertView.tag= holder
        }else{
            holder =convertView.tag as ViewHolder
        }
        holder.luasBangunan!!.setText(foodArrayList[p0].getluasBangunan())
        holder.luasTanah!!.setText(foodArrayList[p0].getluasTanah())
        holder.homeImage!!.setImageResource(foodArrayList[p0].gethomeImage())
        holder.kamarTidur!!.setText(foodArrayList[p0].getkamarTidur())
        holder.kamarMandi!!.setText(foodArrayList[p0].getkamarMandi())
        holder.alamat!!.setText(foodArrayList[p0].getalamat())
        holder.harga!!.setText(foodArrayList[p0].getharga())
        return convertView!!
    }

    private inner class ViewHolder{
        var homeImage: ImageView?=null
        var luasBangunan: TextView?=null
        var luasTanah: TextView?=null
        var kamarTidur: TextView?=null
        var kamarMandi: TextView?=null
        var alamat: TextView?=null
        var harga: TextView?=null

    }
}
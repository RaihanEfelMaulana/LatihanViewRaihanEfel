package com.efel.latihanviewraihanefel

class HomeModel {
    private var luasBangunan:String?=null
    private var homeImage:Int=0
    private var luasTanah:String?=null
    private var kamarTidur:String?=null
    private var kamarMandi:String?=null
    private var alamat:String?=null
    private var harga:String?=null

    fun getluasBangunan():String{
        return luasBangunan.toString()
    }

    fun gethomeImage():Int{
        return homeImage
    }

    fun getluasTanah():String{
        return luasTanah.toString()
    }

    fun getkamarTidur():String{
        return kamarTidur.toString()
    }

    fun getkamarMandi():String{
        return kamarMandi.toString()
    }

    fun getalamat():String{
        return alamat.toString()
    }

    fun getharga():String{
        return harga.toString()
    }

    fun setluasBangunan(luasBangunan:String){
        this.luasBangunan=luasBangunan
    }

    fun sethomeImage(homeImage:Int){
        this.homeImage=homeImage
    }

    fun setluasTanah(luasTanah:String){
        this.luasTanah=luasTanah
    }

    fun setkamarTidur(kamarTidur:String){
        this.kamarTidur=kamarTidur
    }

    fun setkamarMandi(kamarMandi:String){
        this.kamarMandi=kamarMandi
    }

    fun setalamat(alamat:String){
        this.alamat=alamat
    }

    fun setharga(harga:String){
        this.harga=harga
    }
}
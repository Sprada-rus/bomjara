package com.example.bomjara.game_object

import androidx.appcompat.app.AppCompatActivity

data class Realty(val name:String, val price: Int, val comfort: Int, val removable: Boolean = false)

fun getString(name: String) : String{
    val app = AppCompatActivity()
    return app.resources.getString(app.resources.getIdentifier(name, "String", app.packageName))
}

fun createRealty(){
    val mRealtySet = mutableSetOf<Realty>(
        Realty(getString("tent"), 150, 1),
        Realty(getString("shelter"), 300,2, true),
        Realty(getString("room"), 10000,3, true),
        Realty(getString("removable_room"), 20000,4, true),
        Realty(getString("flat"), 1500000,5),
        Realty(getString("cottage"), 10000000,6),
    )
}


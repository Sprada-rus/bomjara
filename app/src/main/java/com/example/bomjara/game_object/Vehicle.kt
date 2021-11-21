package com.example.bomjara.game_object

data class Vehicle(val name:String, val price: Int, val comfort: Int)

fun createVehicle(){
    val mRealtySet = mutableSetOf<Realty>(
        Realty(getString("skateboard"), 150, 1),
        Realty(getString("bicycle"), 1000,2, true),
        Realty(getString("moped"), 15000,3, true),
        Realty(getString("cheap_car"), 50000,4, true),
        Realty(getString("car"), 500000,5),
        Realty(getString("exclusive_car"), 12000000,6),
    )
}


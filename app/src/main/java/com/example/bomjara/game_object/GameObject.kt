package com.example.bomjara.game_object

data class GameObject(
    val name: String,
    var years: Int = 18,
    var money: Int,
    var happens: Int,
    var health: Int)
{
    fun addMoney(num: Int){
        money += num
    }

    fun subtractMoney(num: Int){
        money -= num
    }

    fun happyBirthDay(){
        years++
    }

    fun addHealth(num: Int){
        health += num
    }

    fun subtractHealth(num: Int){
        health -= num
    }

    fun addHappens(num: Int){
        happens += num
    }

    fun subtractHappens(num: Int){
        happens -= num
    }
}
package com.example.bomjara.game_object

data class GameObject(
    var years: Int = 18,
    var money: Int,
    var happens: Int,
    var health: Int,
    var realty: MutableSet<Realty>?,
    var vehicle: MutableSet<Vehicle>?,
    var day: Int = 0
) {

    fun addMoney(num: Int){
        money += num

        if (money >= 100){
            money = 100
        }
    }

    fun subtractMoney(num: Int){
        money -= num

        if (money < 0){
            money = 0
        }
    }

    fun happyBirthDay(){
        years++
    }

    fun addHealth(num: Int){
        health += num

        if (health >= 100){
            health = 100
        }
    }

    fun subtractHealth(num: Int){
        health -= num

        if (health <= 0){
            health = 0
        }
    }

    fun addHappens(num: Int){
        happens += num

        if (happens >= 100){
            happens = 100
        }
    }

    fun subtractHappens(num: Int){
        happens -= num

        if (happens <= 0){
            happens = 0
        }
    }

    fun nextDay():Boolean{
        day++

        return day >= 365
    }
}
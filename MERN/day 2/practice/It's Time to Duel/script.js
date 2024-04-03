class Unit{
    constructor(name, cost, power, resilience) {
        this.name = name ;
        this.cost = cost ;
        this.power = power ;
        this.resilience = resilience ;

    }
    attack(enemy){
        enemy.resilience -=this.power
    }
}
class effect{
    constructor(name, cost, stat, magnitude){
        this.name = name ;
        this.cost = cost ;
        this.stat = stat;
        this.magnitude = magnitude ;
    }
    play(enemy){
        if (this.stat == "resilience"){
            enemy.resilience += this.magnitude
        }
        if (this.stat == "power"){
            enemy.power += this.magnitude
        }
    }
}
const red = new Unit("Red belt ninja", 3, 3, 4)
const hard = new effect("Hard Algorithm", 2, "resilience", 3)
hard.play(red)
const black = new Unit("black belt ninja", 4, 5, 4)
const Rejection = new effect("Unhandled Promise Rejection", 1, "resilience", -2)
Rejection.play(red)
const pair = new effect("Pair Programming", 3, "power", 2)
pair.play(red)
red.attack(black)
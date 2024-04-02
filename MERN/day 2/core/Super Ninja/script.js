class Ninja{
    constructor(name){
        this.name = name ;
        this.health = 90 ;
        this.speed = 3 ;
        this.strength = 3 ; 
    }
    sayName(){
        console.log(this.name)
    }
    showStats(){
        this.name = "Hyabusa"
        this.health = 90
        this.speed = 3
        this.strength = 3
    }
    drinkSake(){
        this.health += 10
    }
}
const ninja1 = new Ninja("Hyabusa");
ninja1.sayName();
ninja1.showStats();
ninja1.drinkSake()

class Sensei extends Ninja{
    constructor(name){
        super(name,210,10,10)
        this.wisdom = 10 ; 
    }
    speakWisdom(){
        super(this.drinkSake)
        console.log("What one programmer can do in one month, two programmers can do in two months" + this.wisdom)
    };
    showStats(){
        super(superSensei)
    };
}
// example output
const superSensei = new Sensei("Master Splinter");
superSensei.speakWisdom();

// -> "."
superSensei.showStats();
// -> "Name: Master Splinter, Health: 210, Speed: 10, Strength: 10"

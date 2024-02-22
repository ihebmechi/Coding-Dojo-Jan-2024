function pizzaOven(crustType, sausType, cheeses, toppings) {
    var pizza ={};
    pizza.crustType = crustType;
    pizza.sausType = sausType;
    pizza.cheeses = cheeses;
    pizza.toppings = toppings;
    return pizza;
}
pizza1={
    crustType : "deep dish",
    sausType : "traditionnel",
    cheeses : ["mozzarella"],
    toppings : ["pepperoni","sausage"],
}
console.log (pizza1);
pizza2={
    crustType : "hand tossed",
    sausType : "marinara",
    cheeses :["mozzarella","feta"],
    toppings : ["mushrooms","olives","onions"],
}    
console.log (pizza2);
pizza3={
    crustType : "hand tossed",
    sausType : "marinara",
    cheeses : ["mozzarella"],
    toppings : ["mushrooms","pepperoni","onions","sausage"],
}    
console.log (pizza3);



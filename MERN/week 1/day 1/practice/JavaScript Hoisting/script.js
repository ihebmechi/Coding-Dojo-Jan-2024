//______1_________
console.log(hello);
//hello
var hello = 'world';


//_______2_________
var needle = 'haystack';
test();
function test(){
    var needle = 'magnet';
    console.log(needle);
//magnet
}

//________3_________
var brendan = 'super cool';
function print(){
    brendan = 'only okay';
    console.log(brendan);
//brendan
}
console.log(brendan);
//super cool

//_________4_________
var food = 'chicken';
console.log(food);
//chicken
eat();
function eat(){
    food = 'half-chicken';
    console.log(food);
    var food = 'gone';
//half-chicken
}

//________5__________
mean();
console.log(food);
var mean = function() {
    food = "chicken";
    console.log(food);
    var food = "fish";
    console.log(food);
}
console.log(food);
//ERROR!

//_________6_________
console.log(genre);
var genre = "disco";
rewind();
function rewind() {
    genre = "rock";
    console.log(genre);
    var genre = "r&b";
    console.log(genre);
}
console.log(genre);
//ERROR!

//________7_________
dojo = "san jose";
console.log(dojo);
learn();
function learn() {
    dojo = "seattle";
    console.log(dojo);
    var dojo = "burbank";
    console.log(dojo);
}
console.log(dojo);
//san jose
//seattle
//burbank
//san jose

//________8_________
console.log(makeDojo("Chicago", 65));
console.log(makeDojo("Berkeley", 0));
function makeDojo(name, students){
    const dojo = {};
    dojo.name = name;
    dojo.students = students;
    if(dojo.students > 50){
        dojo.hiring = true;
    }
    else if(dojo.students <= 0){
        dojo = "closed for now";
    }
    return dojo;
}
//ERROR!

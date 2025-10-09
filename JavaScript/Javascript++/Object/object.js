const Student={
    name:"Sonal",
    Age:22,
    Course:"BBA"

};
console.log(Student.Course);
Student.Age=55
console.log(Student.Age);

const Mentor={
    name:"M Ganesh",
     student:{
           name:"Nishant Singh",
           age:45,
           Course:"Btech" 
    }
};

console.log(Mentor.student.name);


const smile={
    name:"Jai Hind",
    laugh(){
        console.log("I am Laughing My Sweetheart");
        
    },

    name2(){
            console.log(`My name is : ${this.name}`);
            
    }
};
smile.laugh();
smile.name2();

for(let key in smile){
    console.log(`${key}:${smile[key]}`);
    
};

Object.keys(smile).forEach((key) => {
     console.log(`${key}:${smile[key]}`);
});

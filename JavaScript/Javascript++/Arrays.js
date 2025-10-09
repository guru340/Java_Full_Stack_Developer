// const color=["1",5,null,undefined];
// console.log(color[0]);

// color[2]=3;
// console.log(color[2]);

// console.log(color.length);



// // methods in array
// for(let i=0;i<color.length;i++){
//     console.log(color[i]);
    
// };

// color.forEach(element => {
//     console.log(element);
// });

// for (const element of color) {
//     console.log(element);
// }


// Some more Concepts

let cart=[];

cart.push("T-shirt");
cart.push("shirt");
cart.push("skirt");
cart.push("Towel")
cart.push("RUlmaal")
cart.push("Handwear")
cart.push("Bra")


console.log("CART Item:" ,cart);

let popitem=cart.pop();
console.log("POPItem:",popitem);

let shift=cart.shift();

console.log(shift);
let sli=cart.splice(0,3);
console.log(sli);



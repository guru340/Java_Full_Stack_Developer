function getuserdat(){
    return new Promise((resolve ,reject)=>{
        setTimeout(() => {
           const data={name:"Raja Beta"};
           resolve(data); 
        }, 3000);
    });
};

console.log("User data");
getuserdat.then((data)=>{
    console.log("data fetched:",data);
    
});

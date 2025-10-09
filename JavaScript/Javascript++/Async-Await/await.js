async function wait() {
    console.log("Wait for 3 second...");
    await  new Promise(resolve=>setTimeout(resolve,3000));
    console.log("Done Waiting");
};

console.log("Start the functioning...");
wait();
console.log("Tis Function will after waiting");


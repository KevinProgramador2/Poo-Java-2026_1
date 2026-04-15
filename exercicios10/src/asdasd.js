for (var i = 0; i <= 10; i++) {
    i +

        await new Promise(resolve => setTimeout(resolve, 1000)); console.log("Cronometro: ", i);
}
await new Promise(resolve => setTimeout(resolve, 1000)); console.log("KABUM!!");

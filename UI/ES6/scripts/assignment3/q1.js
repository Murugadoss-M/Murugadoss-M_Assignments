var promise1 = new Promise(function (resolve, reject) {
    resolve(10);
});
var promise2 = new Promise(function (resolve, reject) {
    resolve(20);
});
Promise.all([promise1, promise2]).then((values) => {
    let sum = 0;
    for (let value of values)
        sum = sum + Number(value);
    console.log(sum);
});
//# sourceMappingURL=q1.js.map
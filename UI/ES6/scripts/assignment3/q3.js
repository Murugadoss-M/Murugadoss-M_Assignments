let circle = {
    print() {
        console.log("Printing circle object");
    }
};
let employee = {
    print() {
        console.log("Printing employee object");
    }
};
function printAll(...args) {
    for (let arg of args)
        arg.print();
}
printAll(circle, employee);
//# sourceMappingURL=q3.js.map
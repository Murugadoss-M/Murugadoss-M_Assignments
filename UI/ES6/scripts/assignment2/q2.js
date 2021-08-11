"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.getNextArmStrong = exports.armstrong = exports.high = void 0;
const high = 1000;
exports.high = high;
function getNextArmStrong(lowNumber, highNumber) {
    for (let i = lowNumber; i <= highNumber; i++) {
        // converting number to string 
        let numberOfDigits = i.toString().length;
        let sum = 0;
        // create a temporary variable
        let temp = i;
        /* loop through a number to find if
        a number is an Armstrong number */
        while (temp > 0) {
            let remainder = temp % 10;
            sum += Math.pow(remainder, numberOfDigits);
            // removing last digit from the number
            temp = Math.trunc(temp / 10); // convert float into integer
        }
        if (sum == i) {
            return i;
        }
    }
}
exports.getNextArmStrong = getNextArmStrong;
let armstrong = 100;
exports.armstrong = armstrong;
exports.armstrong = armstrong = getNextArmStrong(armstrong + 1, high);
console.log(armstrong);
exports.armstrong = armstrong = getNextArmStrong(armstrong + 1, high);
console.log(armstrong);
exports.armstrong = armstrong = getNextArmStrong(armstrong + 1, high);
console.log(armstrong);
//# sourceMappingURL=q2.js.map
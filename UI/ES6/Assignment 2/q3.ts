const high = 1000;
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
            sum += remainder ** numberOfDigits;
            // removing last digit from the number
            temp = Math.trunc(temp / 10); // convert float into integer
        }

        if (sum == i) {
            return i;
        }
    }
}
let armstrong=100;
function *getArmstrong() {
    for (let i = 100; i < high; i++) {
        armstrong=getNextArmStrong(armstrong+1,high);
        if(armstrong===undefined)
            break;
        yield armstrong;
    }
}
let myArmstrongGen = getArmstrong();

console.log(myArmstrongGen.next());
console.log(myArmstrongGen.next());
console.log(myArmstrongGen.next());
console.log(myArmstrongGen.next());
console.log(myArmstrongGen.next());
console.log(myArmstrongGen.next());
console.log(myArmstrongGen.next());
console.log(myArmstrongGen.next());

let numeric_array = [10, 20, 30, 40, 50];
let [, , third] = numeric_array;
console.log(third);
let organization = {
    org_name: "Capgemini",
    address: {
        city: "Banglore",
        pincode: "560066"
    }
};
let { org_name, address: { city, pincode } } = organization;
console.log(org_name);
console.log(city);
console.log(pincode);
//# sourceMappingURL=q7.js.map
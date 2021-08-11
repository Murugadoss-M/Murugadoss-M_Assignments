let add = function (a = 10, b = 20) {
    console.log(a + b);
}
let userFriends = function (username, ...friends) {
    console.log("Friends of : " + username);
    for (let i in friends) {
        console.log(friends[i]);
    }
}
let printCapitalNames = function (...names) {
    for (let i in names) {
        console.log(names[i].toUpperCase());
    }
}
add();
userFriends("mmdoss", "doss", "muruga", "muthu");
let smallNames = ["mmdoss", "doss", "muruga", "muthu"];
printCapitalNames(...smallNames);

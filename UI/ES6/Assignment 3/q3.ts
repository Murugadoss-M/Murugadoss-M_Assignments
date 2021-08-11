interface Printable{
    print();
}
let circle:Printable={
    print(){
        console.log("Printing circle object");
        
    }
}
let employee:Printable={
    print(){
        console.log("Printing employee object");
        
    }
}
function printAll(...args){
    for(let arg of args)
        arg.print();
}
printAll(circle,employee);
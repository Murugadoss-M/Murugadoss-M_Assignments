function Order(id,title,price){
    return {
        id,
        title,
        price,
        printOrder(){
            console.log(" ID :" + id + " Title : " + title + " Price :" + price);
        },
        getPrice(){
            return price;
        }
    }
}
let order1 = Order(101,"Book",100);
order1.printOrder();
let order2=Object.assign({},order1);
order2.printOrder();


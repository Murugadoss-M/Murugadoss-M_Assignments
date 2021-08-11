class Account{
    id;
    name;
    balance;
    constructor(id,name,balance){
        this.id=id;
        this.name=name;
        this.balance=balance;

    }
}
class SavingAccount extends Account{
    interest;
    constructor(id,name,balance,interest){
        super(id,name,balance);
        this.interest=interest;
    }
}
class CurrentAccount extends Account{
    cash_credit;
    constructor(id,name,balance,cash_credit){
        super(id,name,balance);
        this.cash_credit=cash_credit;
    }
}
function getTotalBalance(...acc_no){
    let tot_balance=0;
    for(let acc of acc_no){
        tot_balance+=acc.balance;
    }
    console.log(`Total balance in bank is : ${tot_balance}`);
    
}
let acc1=new SavingAccount(101,"Doss",1000,100);
let acc2=new SavingAccount(102,"Muruga",12000,1200);
let acc3=new CurrentAccount(103,"Kumar",15000,1000);
let acc4=new CurrentAccount(104,"Muthu",13000,1000);

getTotalBalance(acc1,acc2,acc3,acc4);
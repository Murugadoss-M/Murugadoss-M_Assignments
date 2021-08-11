let names = ['Tom','Ivan','Jerry'];
console.log(names);
let arr=[];
names.forEach((x)=>{
    arr.push(Object.create(null,{
        name:{value:x},
        length:{value:x.length}
    }))
});
console.log(arr);

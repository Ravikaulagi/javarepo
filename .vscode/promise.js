isNumberOrString=(a)=>{ return new Promise((resolve,rejected)=>{
    if(typeof a==='String')
    {
        console.log("it is a string");
        resolve();
    }
    else if(a%2==0)
    {
        setTimeout(()=>{""},1000);
        rejected("error with even number");
    }
    else
    {
        setTimeout(()=>{""},2000);
        rejected("error with odd number");
    }
})}
isNumberOrString("ravi").catch((error)=>{console.log("exception :" +error)})

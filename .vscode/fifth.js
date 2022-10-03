function boom(arr1)
{
    let count=0
    for (let i = 0; i < arr1.length; i++)
     {
        if(i+1>arr1.length-1)
        {
            break;
        }
       if(arr1[i]===arr1[i+2])
       {
          if(arr1[i]!=arr1[i+1])
          {
           count++;
          }
       }
        
    }
    return count;
}
//const arr=[9,5,9,5,1,1,1]
const arr2=[5,6,6,7,6,3,9]
//const arr3=[4,4,4,9,9,9,9]
console.log(boom(arr2))
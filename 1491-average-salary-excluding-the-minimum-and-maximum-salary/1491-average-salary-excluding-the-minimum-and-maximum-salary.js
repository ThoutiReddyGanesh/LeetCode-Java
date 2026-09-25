/**
 * @param {number[]} salary
 * @return {number}
 */
var average = function(salary) {
    salary.sort((a,b)=>a-b);
        let sum=0;
        let avg=0;
        let c=0;
        for(let i=1;i<salary.length-1;i++){
        c++;
        sum=sum+salary[i];
    }
        avg=sum/c;
    return avg;
    }
        

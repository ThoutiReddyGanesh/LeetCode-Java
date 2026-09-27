var reverseParentheses = function(s) {
    let sb=s.split("");

    let i=0;
    let j=1;

    while(j<sb.length){
        if(sb[i]=='('){
            if(sb[j]=='('){
                i=j;
                j++;
            }
            else if(sb[j]==')'){
                rev(sb,i+1,j-1);

                sb.splice(j,1);
                sb.splice(i,1);

                i=0;
                j=1;
            }
            else{
                j++;
            }
        }
        else{
            i++;
            j=i+1;
        }
    }

    return sb.join("");
};

function rev(sb,i,j){
    while(i<j){
        let temp=sb[i];
        sb[i]=sb[j];
        sb[j]=temp;

        i++;
        j--;
    }
}
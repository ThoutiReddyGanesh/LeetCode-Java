var findSpecialInteger = function(arr) {
    let hs =new Map();

    let res =arr.length / 4;

    for(let i=0;i<arr.length;i++){
        hs.set(arr[i],(hs.get(arr[i]) || 0)+1);

        if(hs.get(arr[i])>res)
            return arr[i];
    }

    return -1;
};
/**
 * @param {number} n
 * @return {number}
 */
var hammingWeight = function(n) {
    let binary="";
    while(n>0){
        let rem = n%2;
        binary = rem + binary;
        n= Math.floor(n/2);
    }
    let count=0;
    for(let i=0;i<binary.length;i++){
        if(binary[i]==1)
        count++;
    }
    return count;
};
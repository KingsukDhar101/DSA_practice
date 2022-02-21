let arr = [2, 0, -1, -1, 1, 0, 4];
let temp = arr;
temp.sort();
const tar = 0;

for(let i=0; i<=temp.length-3; i++){
  let j = i+1;
  let k = temp.length-1;

  while(j < k){
    let sum = temp[i] + temp[j] + temp[k];
    if(sum === tar){
      let temparr = [];
      temparr.push(arr[i]);
      temparr.push(arr[j]);
      temparr.push(arr[k]);
      console.log(tempArr);
      break;
    }else if(sum < tar){
      j++;
    }else{
      k--;
    }
  }
}
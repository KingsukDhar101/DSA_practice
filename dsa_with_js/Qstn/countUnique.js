const arr = [1,1,2,2,3,4,4,5,6,7,8,8];

function countUnique(arr){
  let count = 1;
  let prev = 0;
  let curr = 1;
  while(curr<arr.length){
    if(arr[prev] != arr[curr]){
      count++;
      prev = curr;
      curr++;
      continue;
    }
    curr++;
  }
  return count;
}

const un = countUnique(arr);
console.log(un)
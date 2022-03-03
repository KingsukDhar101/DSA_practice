let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9];
let num = 4;

function largestSum(arr, num) {
  let max = 0;

  for (let i = 0; i < arr.length - num + 1; i++) {
    let sum = 0;
    for (let j = 0; j < num; j++) {
      sum += arr[j + i];
    }
    max = sum > max ? sum : max;
    // console.log(max);
  }

  return max;
}

let result = largestSum(arr, num);
console.log(result);

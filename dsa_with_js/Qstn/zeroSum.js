let arr = [2, 0, -1, -1, 1, 0, 4];
arr.sort();
let tar = 0;
let lo = 0;
let hi = arr.length - 1;
let newArr = [];

while (lo < hi) {
  let sum = arr[lo] + arr[hi];
  if (sum < tar) {
    lo++;
  } else if (sum > tar) {
    hi--;
  } else {
    // console.log(`${arr[lo]}, ${arr[hi]}`);
    newArr.push([arr[lo], arr[hi]]);
    lo++;
    hi--;
  }
}

console.log(newArr);
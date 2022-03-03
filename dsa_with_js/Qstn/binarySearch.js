let arr = [9, 8, 7, 5, 2, 4, 11, 32, 21, 3, 0, 7];
arr.sort();
console.log(arr);
let num = 9;

function binarySearch(arr, num) {
  let lo = 0;
  let hi = arr.length - 1;

  while (lo < hi) {
    let mid = Math.floor(lo + (hi - lo) / 2);
    if (mid < num) {
      lo = mid + 1;
    } else if (mid > num) {
      hi = mid - 1;
    } else {
      // mid == num
      return mid;
    }
  }
}

let idx = binarySearch(arr);
console.log(`${idx} = ${arr[idx]}`);

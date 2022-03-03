let arr1 = [1, 2, 3, 4];
let arr2 = [1, 4, 9, 25];

function checkSquare(arr1, arr2) {
  let map1 = {};
  let map2 = {};

  for (let i of arr1) {
    map1[i] = (map1[i] || 0) + 1;
  }
  for (let i of arr2) {
    map2[i] = (map2[i] || 0) + 1;
  }

  // console.log(map1);
  // console.log(map2);
  for (let key in map1) {
    if (!map2[key * key]) {
      return false;
    }
    if (map1[key] != map2[key * key]) {
      return false;
    }
  }
  return true;
}
let chk = checkSquare(arr1, arr2);
console.log(chk);

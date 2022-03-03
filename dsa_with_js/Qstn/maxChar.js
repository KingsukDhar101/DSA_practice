let str = "hello world";

function getMaxChar(str) {
  let map = {};
  str.split("").forEach((ele) => {
    map[ele] = map[ele] ? map[ele] + 1 : 1;
  });
  let max = -1;
  let ch = str[0];
  for (let k in map) {
    if (map[k] > max) {
      max = map[k];
      ch = k;
      // console.log(`${k} => ${map[k]}`)
    }
  }
  return ch;
}

let res = getMaxChar(str);
console.log(res);

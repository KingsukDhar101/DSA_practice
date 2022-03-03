// let arr = [9,7,32,5,2,54,2,1,5,4];
// let arr2 = ["kingsuk", "Rohit"];

// let sorted = arr.sort((a,b)=> a>b ? 1 : -1);
// console.log(sorted)

// console.log(arr.reverse());
// arr.push(10);
// arr.pop();
// arr.shift();
// arr.unshift(11);

// let cnct = arr.concat(arr2);

// let jn = arr.join(" ");

// let sl = arr.slice(2, 6);
// let sl = arr.slice(-3);

// arr.splice(2, 0, "kd1", "kd2");
// arr.splice(2, 1, "kd1", "kd2");
// arr.splice(-2, 1, "kd1", "kd2");
// arr.splice(2, 1);

let num = 10;

// let check = Array.isArray(arr);
// let check = Array.isArray(arr);

// let check = arr.lastIndexOf(5);

// let val = 18;
// let check = arr.some((item)=> item >= 18);
// let check = arr.every(item => item >= 18);
// let check = arr.find((item)=> item>=18);
// let check = arr.findIndex((item)=> item>=18);
// let check = arr.map(item => item-5);
// let check = arr.filter(item =>  item%2 == 0);
// let sum = arr.reduce((acc, curr)=> acc+curr);

//************************************************** */
let arr = [9, 7, 32, 5, 2, 54, 2, 1, 5, 4];
let arr2 = ["kingsuk", "Rohit"];

// let str = arr.toString();
// let check = arr.fill("0");
let check = arr.forEach((item, index) => {
  console.log(`${index} => ${item}`);
});

// console.log(check);


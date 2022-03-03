const str1 = "hello";
const str2 = "ellho";

function isAnagram(str1, str2) {
  // freq
  let count = {};
  for (let ch of str1) {
    count[ch] = (count[ch] || 0) + 1;
  }
  console.log(count);
  // check 2nd string
  for (let ch of str2) {
    if (!count[ch]) {
      console.log(`checking -- ${ch}`);
      return false;
    }
    count[ch] -= 1;
  }
  console.log(count);
  return true;
}

const check = isAnagram(str1, str2);
console.log(check);

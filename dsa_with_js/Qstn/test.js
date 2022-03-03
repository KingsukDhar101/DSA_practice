let str = "top";

// function checkPalindrome(str){
//   let rev = str.split("").reverse().join("");
//   return str===rev;
// }

function checkPalindrome(str){
  let rev = str;
  let lo = 0;
  let hi = rev.length-1;

  while(lo < hi){
    if(rev.charAt(lo) == rev.charAt(hi)){
      lo++;
      hi--;
    }else{
      return false;
    }
  }
  return true;
}

let res = checkPalindrome(str);
console.log(res)
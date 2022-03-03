let phone = "7885025909";

function printfunc() {
  for (let i = 0; i <= 9; i++) {
    let count = 0;
    for (let j = 0; j < phone.length; j++) {
      if (phone.charAt(j) == i + "") {
        count++;
      }
    }
    if (count > 0) {
      console.log(`${i}, ${count}`);
    }
  }
}
// printfunc();

function printfunc2(){
  for(let i=0; i<=9; i++){
    let count = 0;
    for(let d of phone){
      if(i == d){
        count++;
      }
    }
    if(count > 0){
      console.log(`${i}, ${count}`);
    }
  }
}
printfunc2();
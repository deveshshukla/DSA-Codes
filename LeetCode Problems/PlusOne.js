'use strict';

// LeetCode-66 : Plus One

let digits = [1,9,9,9];

if (digits[digits.length-1] === 9) {
    let found = false;

    // Trace till non 9 digit in array
    for (let i=digits.length-1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i] += 1;
            found = true;
            break;
        }else
            digits[i] = 0;
    }

    if (!found) digits.unshift(1);

}else {
    digits[digits.length-1] += 1;
}

console.log(digits);
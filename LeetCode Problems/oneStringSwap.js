'use strict';

// LC-1790. Check if One String Swap Can Make Strings Equal

var areAlmostEqual = function(s1, s2) {
    // 1st case: both strings are same
    if (s1 === s2) return true;

    let idx = [];

    // Find all indices where characters differ
    for (let i = 0; i < s1.length; i++) {
        if (s1.charAt(i) !== s2.charAt(i)) {
            idx.push(i);
        }
    }

    // A single swap can only fix EXACTLY 2 differences
    if (idx.length === 2) {
        let i = idx[0];
        let j = idx[1];
        // Check if swapping s1[i] and s1[j] makes it equal to s2
        return s1.charAt(i) === s2.charAt(j) && s1.charAt(j) === s2.charAt(i);
    }

    // If there's more than 2 diff, it's impossible
    return false;
};

let s1 = "bank", s2 = "kanb";
console.log(areAlmostEqual(s1, s2));

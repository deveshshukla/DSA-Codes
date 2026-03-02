'use strict';


//LeetCode: Can Make Arithmetic Progression From Sequence

var canMakeArithmeticProgression = function(arr) {
    let min = Math.min(...arr);
    let max = Math.max(...arr);
    let n = arr.length;

    // Use of AP formula: (d = max-min/n-1)
    if (((max-min)%(n-1)) !== 0) return false;

    // Case where all elements are the same (e.g., [1, 1, 1])
    let diff = ((max-min)/(n-1));
    if (diff === 0) return true;

    // set method for constant lookup O(1)
    let set = new Set(arr);

    for (let i=0; i<arr.length; i++) {
        let expectedVal = min + i * diff;
        if (!set.has(expectedVal)) return false;
    }
    return true;
};

let arr = [3,5,1];
console.log(canMakeArithmeticProgression(arr));
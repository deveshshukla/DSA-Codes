'use strict';

// LC- 1752. Check if Array Is Sorted and Rotated

var check = function(nums) {
    let dropCount = 0;

    for (let i=0; i<nums.length; i++) {
        // % modulo operator used for wrap arround 'n%n = 0'
        // to not get indexOutOfBound Error if length exceeded of arr
        if (nums[i] > nums[(i + 1) % nums.length]) dropCount++;
        
        // If we find more than 1 drop, it's not sorted & rotated
        if (dropCount > 1) return false;
    }

    return true;
};

let nums = [2,1,3,4];
console.log(check(nums));
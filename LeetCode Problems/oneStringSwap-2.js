'use strict';

// LC-859. Buddy Strings

var buddyStrings = function(s, goal) {
    if (s.length !== goal.length) return false;

    // Case 1: Strings are already equal
    if (s === goal) {
        // Must have at least one duplicate to swap (e.g., "aa")
        let uniqueChars = new Set(s);
        return uniqueChars.size < s.length;
    }

    // Case 2: Strings are different
    let diffIndices = [];
    for (let i = 0; i < s.length; i++) {
        if (s[i] !== goal[i]) {
            diffIndices.push(i);
        }
    }

    // Must have exactly two differences to perform one swap
    if (diffIndices.length === 2) {
        let [i, j] = diffIndices;
        return s[i] === goal[j] && s[j] === goal[i];
    }

    return false;
};


let s = "ab", goal = "ba";
console.log(buddyStrings(s, goal));

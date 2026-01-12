'use strict';

// LC-389. Find the Difference

var findTheDifference = function(s, t) {
    // use map to store each char of string s 
    let res = 0;
    
    // XOR all characters in string s
    for (let i = 0; i < s.length; i++) {
        res ^= s.charCodeAt(i);
    }
    
    // XOR all characters in string t
    for (let j = 0; j < t.length; j++) {
        res ^= t.charCodeAt(j);
    }
    
    return String.fromCharCode(res);
};

let s = "abcd", t = "abcde";
console.log(findTheDifference(s, t));
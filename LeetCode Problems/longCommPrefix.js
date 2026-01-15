'use strict';

// LC- 14. Longest Common Prefix

var longestCommonPrefix = function(strs) {
    let longCommPrefix = "", n = strs.length-1;

    // Sort array lexicographically/dictionary : (log n)
    strs.sort((a,b) => a.localeCompare(b));

    // compare first & last elements char
    for (let i=0; i<strs[0].length; i++) {
        if (strs[0][i] != strs[n][i]) {
            break;
        }else 
            longCommPrefix += strs[0][i];
    }

    return longCommPrefix;
};

let strs = ["dog","racecar","car"];
console.log(longestCommonPrefix(strs));
'use strict';

var maxMatrixSum = function(matrix) {
    let count = 0;
    let sum = 0;
    let small = Number.MAX_SAFE_INTEGER;

    for (let i=0; i<matrix.length; i++) {
        for (let j=0; j<matrix[i].length; j++) {
            // Count -Ve 
            if (matrix[i][j] < 0) count++;

            // Check smallest element
            if (Math.abs(matrix[i][j]) < small) small = Math.abs(matrix[i][j]);

            // Sum all elements
            sum += Math.abs(matrix[i][j]);
        }
    }

    // Case-1: Even num of -ve num --> sum all elements
    if (count%2 === 0) return sum;

    if (count%2 !== 0) return (sum-small)-small;
    
    return sum;
};

let matrix = [[1,2,3],[1,2,-3],[1,2,3]];

console.log(maxMatrixSum(matrix));
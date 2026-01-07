'use strict';

// LC-1779. Find Nearest Point That Has the Same X or Y Coordinate

var nearestValidPoint = function(x, y, points) {
    // x == ai, y == bi
    let ai=0, bi=1;

    let smallestDist = Number.MAX_SAFE_INTEGER;
    let bestIdx = -1;

    for (let i=0; i<points.length; i++) {
        if (points[i][ai] === x || points[i][bi] === y) {
            let dist = (Math.abs(x-points[i][ai])+Math.abs(y-points[i][bi]));

            if (dist < smallestDist) {
                smallestDist = dist;
                bestIdx = i;
            }
        }
    }

    return bestIdx;
};

let x = 3, y = 4;
let points = [[1,2],[3,1],[2,4],[2,3],[4,4]];
console.log(nearestValidPoint(x,y,points));

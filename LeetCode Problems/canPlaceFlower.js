'use strict';

var canPlaceFlowers = function(flowerbed, n) {
    if(n===0) return true;

    for (let i=0; i<flowerbed.length; i++) {
        if(flowerbed[i] === 0) {
            
            let left = (flowerbed[i-1] === 0 || flowerbed[i-1] === undefined);
            let right = (flowerbed[i+1] === 0 || flowerbed[i+1] === undefined)

            if (left && right) {
                flowerbed[i] = 1;
                n-=1;
            }
        }

        if(n<=0) return true;
    }

    return false;
};

let flowerbed = [0,0,1,0,0], n = 1;
console.log(canPlaceFlowers(flowerbed, n));
/**
 * Created by kamontat on 11/5/59.
 */
function rand(lo, hi) {
    return Number(lo + (Math.random() * (hi - lo + 1))).toFixed(0);
}

/*  if use "node fileName.js"
 ** console.log();
 else use "jjs fileName.js"
 ** print();
 */

for (var i = 0; i < 10; i++)
    print(rand(i * 10, i * 100));
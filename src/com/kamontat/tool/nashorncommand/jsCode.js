/**
 * Created by kamontat on 11/5/59.
 */
function run(i) {
    switch (i) {
        case 1:
            return "one number";
            break;
        case 2:
            return "Two too";
            break;
        default:
            return "what the ____";
            break;
    }
}

/* command line: use "jjs filename.js" */
print(run(2));
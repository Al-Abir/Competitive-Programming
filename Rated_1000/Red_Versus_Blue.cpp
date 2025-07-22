#include <iostream>
using namespace std;

int main() {
    int t;
    cin >> t;  // number of test cases

    while (t--) {
        int n, r, b;
        cin >> n >> r >> b;  // total matches, red wins, blue wins

        // Divide R's into (b + 1) segments
        int x = r / (b + 1);     // base R in each segment
        int y = r % (b + 1);     // extra R to be distributed

        while (b--) {
            int z = x;           // z = number of R's to print in this segment
            if (y != 0) {
                z++;             // this block gets one extra R
                y--;             // reduce remaining extras
            }

            // Print z number of R
            for (int i = 0; i < z; i++)
                cout << 'R';

            // Then print one B (except last)
            cout << 'B';
        }

        // After loop, print the last R block
        if (y != 0) x++;  // if there's one extra left, add it to final block
        for (int i = 0; i < x; i++)
            cout << 'R';

        cout << endl;  // end this test case
    }

    return 0;
}

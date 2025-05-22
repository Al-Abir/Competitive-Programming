#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
  
     long long n; 
     cin >> n;

        long long cnt_2 = 0, cnt_3 = 0;

        while (!(n % 2)) { 
            n /= 2;
            cnt_2++;
        }

        while (!(n % 3)) {
            n /= 3;
            cnt_3++;
        }

        if (n != 1 || cnt_2 > cnt_3) {
            cout << -1 << endl;
        } else {
            cout << (cnt_3 - cnt_2) + cnt_3 << endl;
        }
    }
    

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t--) {
        solve();
    }

    return 0;
}
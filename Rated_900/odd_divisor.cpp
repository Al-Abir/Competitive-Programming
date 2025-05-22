#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
     ll n ;
    cin >> n;
    if ((n & (n - 1)) == 0) {
        cout << "NO" << endl;  // Fixed typo here
    } else {
        cout << "YES" << endl;
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin>> t; // Uncomment for multiple test cases
    while (t--) {
        solve();
    }

    return 0;
}
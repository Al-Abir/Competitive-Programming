#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    // Your code here
   int n, k;
    cin >> n >> k;
 
    vector<int> a(n);
    for (int i = 0; i < n; i++) cin >> a[i];
 
    auto it = find(a.begin(), a.end(), k);
 
    if (it != a.end()) {
        cout << "YES\n";
    } else {
        cout << "NO\n";
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t; // Uncomment for multiple test cases
    while (t--) {
        solve();
    }

    return 0;
}
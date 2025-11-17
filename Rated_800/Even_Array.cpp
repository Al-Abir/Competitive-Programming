#include <bits/stdc++.h>
using namespace std;

void solve() {
    int n;
    cin >> n;

    vector<int> a(n);
    for (int i = 0; i < n; i++) cin >> a[i];

    int even_mismatch = 0;
    int odd_mismatch = 0;

    for (int i = 0; i < n; i++) {
        if (i % 2 != a[i] % 2) {
            if (i % 2 == 0) even_mismatch++;
            else odd_mismatch++;
        }
    }

    if (even_mismatch != odd_mismatch) {
        cout << -1 << "\n";
    } else {
        cout << even_mismatch << "\n";
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t--) solve();
}
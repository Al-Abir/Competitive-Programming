#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
#define ll long long

void solve() {
    ll n, k, b, s;
    cin >> n >> k >> b >> s;

    if (s < (k * b) || s > (k * b + (k - 1) * n)) {
        cout << "-1\n";
        return;
    }

    vector<ll> a(n, 0);
    a[0] = k * b;
    s -= k * b;

    for (int i = 0; i < n && s > 0; i++) {
        ll x = min(k - 1, s);
        a[i] += x;
        s -= x;
    }

    for (auto i : a) {
        cout << i << " ";
    }
    cout << '\n';
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

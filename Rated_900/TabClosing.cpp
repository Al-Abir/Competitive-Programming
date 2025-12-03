#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    ll a, b, n;
    cin >> a >> b >> n;

    if (b >= a) {
        cout << "1\n";
        return;  
    }

    ll x = a / b;
    if (n <= x) {
        cout << "1\n";
    } else {
        cout << "2\n";
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

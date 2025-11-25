#include <bits/stdc++.h>
using namespace std;
#define ll long long

void solve() {
    ll n;
    cin >> n;

    vector<ll> ans;

    for (int k = 1; ; k++) {
        ll denom = 1 + (ll)pow(10, k);
        if (denom > n) break;

        if (n % denom == 0) {
            ll x = n / denom;
            ans.push_back(x);
        }
    }

    if (ans.empty()) {
        cout << 0 << "\n";
        return;
    }

    sort(ans.begin(), ans.end());
    cout << ans.size() <<endl;
    for (auto x : ans) cout << x << " ";
    cout << "\n";
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t--) solve();
}

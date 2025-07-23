#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    ll w, h;
    cin >> w >> h;
    ll area = 0;

    for (int i = 0; i < 4; i++) {
        int k;
        cin >> k;
        ll first = 0, second = 0;
        for (int j = 0; j < k; j++) {
            ll a;
            cin >> a;

            if (j == 0) first = a;
            second = a;
        }
        if (i <= 1) {
            area = max(area, (second - first) * h);
        } else {
            area = max(area, (second - first) * w);
        }
    }

    cout << area << endl;
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

#include <iostream>
#include <vector>
using namespace std;

typedef long long ll;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t--) {
        int n, k, q;
        cin >> n >> k >> q;
        vector<int> a(n);
        for (int i = 0; i < n; ++i) cin >> a[i];

        ll ans = 0;
        int cnt = 0;

        for (int i = 0; i < n; ++i) {
            if (a[i] <= q) {
                cnt++;
            } else {
                if (cnt >= k) {
                    ll len = cnt - k + 1;
                    ans += (len * (len + 1)) / 2;
                }
                cnt = 0;
            }
        }

        // Check at the end
        if (cnt >= k) {
            ll len = cnt - k + 1;
            ans += (len * (len + 1)) / 2;
        }

        cout << ans << "\n";
    }

    return 0;
}

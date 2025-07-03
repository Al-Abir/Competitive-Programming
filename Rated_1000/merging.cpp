#include <bits/stdc++.h>
using namespace std;

void Solve() {
    int n;
    cin >> n;

    vector<int> a(n), b(n);
    for (auto &i : a) cin >> i;
    for (auto &i : b) cin >> i;

    // Length of longest subarray in array a and b for each value
    vector<int> fa(2 * n + 1, 0), fb(2 * n + 1, 0);

    for (int i = 0; i < n; i++) {
        int val = a[i];
        int cnt = 0;
        while (i < n && val == a[i]) {
            cnt++;
            i++;
        }
        i--;
        fa[val] = max(fa[val], cnt);
    }

    for (int i = 0; i < n; i++) {
        int val = b[i];
        int cnt = 0;
        while (i < n && val == b[i]) {
            cnt++;
            i++;
        }
        i--;
        fb[val] = max(fb[val], cnt);
    }

    int ans = 0;
    for (int i = 1; i <= 2 * n; i++) {
        ans = max(ans, fa[i] + fb[i]);
    }

    cout << ans << endl;
}

int main() {
    int t;
    cin >> t;
    while (t--) {
        Solve();
    }
    return 0;
}

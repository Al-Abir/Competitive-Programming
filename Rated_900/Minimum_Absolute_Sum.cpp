#include <bits/stdc++.h>
using namespace std;
#define ll long long

void solve() {
    int n;
    cin >> n;
    vector<int> vec(n);
    for (int i = 0; i < n; i++) cin >> vec[i];

    // Fix first and last element if they are -1
    if (vec[0] == -1 && vec[n-1] == -1) {
        vec[0] = vec[n-1] = 0;
    } else if (vec[0] == -1) {
        vec[0] = vec[n-1];
    } else if (vec[n-1] == -1) {
        vec[n-1] = vec[0];
    }

    cout << abs(vec[n-1] - vec[0]) << endl;

    // Fill remaining -1 with 0 and print
    for (int i = 0; i < n; i++) {
        if (vec[i] == -1) cout << 0 << " ";
        else cout << vec[i] << " ";
    }
    cout << endl;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    cin >> t; // enable for multiple test cases
    while (t--) {
        solve();
    }

    return 0;
}

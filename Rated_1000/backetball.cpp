#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>
using namespace std;
#define ll long long

void solve() {
    int n, d;
    cin >> n >> d;
    vector<int> p(n);
    for (auto &i : p) cin >> i;
    sort(p.rbegin(), p.rend());
    int palyers = 0, wins = 0, i = 0;
    while (i < n && palyers <= n) {
        int x = ceil(1.0 * (d + 1) / p[i]); 
        palyers += x;
        if (palyers <= n) wins++;
        i++;
    }
    cout << wins << endl;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;

    while (t--) {
        solve();
    }

    return 0;
}

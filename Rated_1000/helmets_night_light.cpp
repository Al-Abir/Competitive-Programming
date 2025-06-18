#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    int n, p;
    cin >> n >> p;
    vector<pair<int, int>> vec(n);

    for (int i = 0; i < n; i++) cin >> vec[i].second;
    for (int i = 0; i < n; i++) cin >> vec[i].first;

    sort(vec.begin(), vec.end());

    ll cost = p;
    ll resident = 1;

    for (auto i : vec) {
        int f = i.first;
        int s = i.second;

        if (f > p) break;

        ll take = min(1LL * s, 1LL * (n - resident)); 
        cost += 1LL * f * take;                        
        resident += take;

        if (resident == n) break;  
    }

    cost += 1LL * (n - resident) * p;

    cout << cost << '\n';
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

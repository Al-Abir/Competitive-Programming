#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
   
    int n;
    cin >> n;

    long long mini = 9e18;
    long long second_mini_sum = 0;
    long long second_mini = 9e18;

    for (int i = 0; i < n; i++) {
        int m;
        cin >> m;

        vector<int> v(m);
        for (auto &j : v) cin >> j;

        sort(v.begin(), v.end());

        mini = min(mini, (long long)v[0]);
        second_mini_sum += v[1];
        second_mini = min(second_mini, (long long)v[1]);
    }

    cout << (mini + second_mini_sum - second_mini) << endl;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t ;
    cin >> t; 
    while (t--) {
        solve();
    }

    return 0;
}
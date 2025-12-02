#include <bits/stdc++.h>
using namespace std;

void solve() {
    string s;
    cin >> s;

    int balance = 0;
    int topLevelSegments = 0;

    for (char c : s) {
        if (c == '(') balance++;
        else balance--;

        if (balance == 0) topLevelSegments++;
    }

    if (topLevelSegments >= 2) cout << "YES\n";
    else cout << "NO\n";
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t--) solve();
}

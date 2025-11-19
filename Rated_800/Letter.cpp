#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    string s;
    cin >> s;

    int lower = 0, upper = 0;

    for (int i = 0; i < s.size(); i++) {
        char ch = s[i];
        if (ch >= 'a' && ch <= 'z') 
            lower++;
        else if (ch >= 'A' && ch <= 'Z') 
            upper++;
    }

    if (upper > lower) {
        transform(s.begin(), s.end(), s.begin(), ::toupper);
    } else {
        transform(s.begin(), s.end(), s.begin(), ::tolower);
    }

    cout << s << endl;
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

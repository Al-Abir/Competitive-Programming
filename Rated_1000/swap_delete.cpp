#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
        string s;
        cin >> s;
        int n = s.size();
        int count_of_0s = 0, count_of_1s = 0;

        for (int i = 0; i < n; i++) {
            if (s[i] == '0')
                count_of_0s++;
            else
                count_of_1s++;
        }

        int length_of_t = 0;

        for (int i = 0; i < n; i++) {
            if (s[i] == '0' && count_of_1s > 0) {
                count_of_1s--;
                length_of_t++;
            }
            else if (s[i] == '1' && count_of_0s > 0) {
                count_of_0s--;
                length_of_t++;
            }
            else {
                break;
            }
        }

        cout << n - length_of_t << endl;

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
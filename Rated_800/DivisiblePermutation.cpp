#include <bits/stdc++.h>
using namespace std;

using ll = long long;

int main() {
    ios_base::sync_with_stdio(false); cin.tie(0);

    int tc; cin >> tc;
    while(tc--) {
        int n; cin >> n;
        vector<int> ans(n);
        
        // Fill positions n-1, n-3, n-5... with 1, 2, 3...
        for(int i = n - 1, j = 1; i >= 0; i -= 2) {
            ans[i] = j++;
        }
        
        // Fill positions n-2, n-4, n-6... with n, n-1, n-2...
        for(int i = n - 2, j = n; i >= 0; i -= 2) {
            ans[i] = j--;
        }
        
        // Output the resulting permutation
        for(auto &x : ans) cout << x << " ";
        cout << "\n";
    }

    return 0;
}
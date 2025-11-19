#include <iostream>
#include <vector>
#include <algorithm>
#include <limits.h>

using namespace std;
#define ll long long

void solve() {
    // Your code here
    int n;
    cin>>n;
    vector<int> arr(n+1);
    for(int i=1; i<=n; i++) cin>>arr[i];
    vector<int> prefix(n+1);


    // prefix sum
   prefix[0] = 0;
  for(int i = 1; i <= n; i++){
    prefix[i] = prefix[i-1] + arr[i];
}
   int avg = INT_MIN;
    for(int l = 1; l <= n; l++){
    for(int r = l; r <= n; r++){
        int sumLR = prefix[r] - prefix[l-1];
          avg = max(avg,sumLR / (r - l + 1));
    }
}

    cout<<avg<<endl;

}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t; // Uncomment for multiple test cases
    while (t--) {
        solve();
    }

    return 0;
}
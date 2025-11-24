#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    // Your code here
    int n,k;
    cin>>n>>k;
    vector<int> a(n),f(n+1,0);
    for(int i=0; i<n; i++){
        cin>>a[i];
        f[a[i]]++;
    }
    int cnt1=0, cnt2=f[k];
    for(int i=0; i<k; i++){
        if(f[i]==0) cnt1++;
    }
    cout<<max(cnt1,cnt2)<<endl;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t ;
    cin >> t; // Uncomment for multiple test cases
    while (t--) {
        solve();
    }

    return 0;
}
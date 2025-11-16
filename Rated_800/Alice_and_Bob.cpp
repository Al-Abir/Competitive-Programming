#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    // Your code here
    int n,a;
    cin>>n>>a;
    int let=0,get=0;
    vector<int> arr(n);
    for(int i=0; i<n; i++){
         cin>>arr[i];
         if(arr[i]>a)get++;
         else if(arr[i]<a) let++;
    }
    if(get>let) cout<<a+1<<"\n";
    else cout<<a-1<<"\n";
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
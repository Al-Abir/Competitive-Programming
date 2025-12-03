#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    // Your code here
    ll n,x,y;
    cin>>n>>x>>y;
    x=abs(x), y=abs(y);
    if(x<y){
        swap(x,y);
    }
    string a;
    cin>>a;
    ll eightCount = count(a.begin(), a.end(),'8');
    ll yCovers = min(n,n-x+eightCount);
    if(x<=n && y<=yCovers){
        cout<<"YES\n";
    }else{
        cout<<"NO\n";
    }
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
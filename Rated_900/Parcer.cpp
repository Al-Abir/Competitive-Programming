#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    // Your code here
    int n,m,a,b;
    cin>>n>>m;
    int l=0,prev=0;
    for(int i=1; i<=n; i++){
        cin>>a>>b;
        int d = a-prev;
        if((b-l)==0 && d&1) m--;
        else if((b-l)!=0 && !(d&1)) m--;
        prev=a;
        l=b;
    }
    cout<<m<<endl;
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
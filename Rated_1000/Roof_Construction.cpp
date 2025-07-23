#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    // Your code here
    int n;
    cin>>n;
    int k=-1;
    int a = n-1;
    while(a>0){
         a>>=1;
         k++;
    }
    for(int i=n-1; i>=(1<<k); i--){
        cout<<i<<" ";
    }
    for(int i=0; i<(1<<k); i++){
        cout<<i<<" ";
    }
    cout<<endl;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    // cin >> t; // Uncomment for multiple test cases
    while (t--) {
        solve();
    }

    return 0;
}
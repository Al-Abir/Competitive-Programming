#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    // Your code here
    int n,x;
    cin>>n>>x;
    for(int i=0; i<x;i++)cout<<i<<" ";
    for(int i=n-1; i>=x; i--)cout<<i<<" ";
    cout<<endl;
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
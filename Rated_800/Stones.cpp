#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    // Your code here
    int n;
    cin>>n;
    cin.ignore();
    string s;
    getline(cin,s);
    int cnt=0;
    for(int i=0; i<n-1; i++){
        if(char(s[i])==char(s[i+1]))cnt++;
    }
    cout<<cnt<<endl;
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
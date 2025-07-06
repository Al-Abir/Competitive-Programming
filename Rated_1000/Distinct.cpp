#include <iostream>
#include <vector>
#include <algorithm>
#include<set>
using namespace std;
#define ll long long

void solve() {
    // Your code here
    int n;
    cin>>n;
    string a;
    cin>>a;

    vector<int> prefix(n,0),suffix(n,0);

    set<char> s;

    for(int i=0; i<n; i++){
         s.insert(a[i]);
         prefix[i]= s.size();
    }
    s.clear();
    for(int i= n-1; i>=0; i--){
       s.insert(a[i]);
       suffix[i]=s.size();
    }
    int ans=0;
    for(int i=0; i<n-1;i++){
         ans= max(ans, prefix[i]+ suffix[i+1]);
    }
    cout<<ans<<endl;
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
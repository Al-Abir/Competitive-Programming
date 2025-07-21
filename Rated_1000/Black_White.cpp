#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    // Your code here
    int n, k;
    cin>>n>>k;
    string s;
    cin>>s;
    int w=0,b=0;
    for(int i=0; i<k; i++){
          if(s[i]=='W') w++;
          else{
             b++;
          }
    }
    int ans = w;

    for(int i=0; i+k<n; i++){
          if(s[i]=='W')w--;
          else{
            b--;
          }
          if(s[i+k]=='W')w++;
          else{
            b++;
          }
          ans= min(ans,w);
    }
    cout<<ans<<endl;
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
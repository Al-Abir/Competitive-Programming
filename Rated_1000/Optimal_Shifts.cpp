#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    // Your code here
    ll n;
    cin>>n;
    string s;
    cin>>s;

    ll ans =0;
    
    for(int i=0; i<n; i++){

          if(s[i]=='0'){
             ll cnt =0;

             while (i<n &&  s[i]=='0')
             {
                cnt++;
                i++;
             }

             ans = max(ans,cnt);
             i--;
             
          }

    }

    ll cnt =0;

    for(int i=0; i<n; i++){
          
        if(s[i]=='1'){
            break;
        }else{
            cnt++;
        }
    }

    for(int i=n-1; i>0; i--){
        if(s[i]=='1') break;
        else{
            cnt++;
        }
    }
   ans= max(ans,cnt);
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
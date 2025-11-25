#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    // Your code here
    ll n, k, i,j,c;
    string a;
    cin>>n>>k;
    cin.ignore();
    cin>>a;  

    ll ans[n];
    c=0;
    j=1;
    for(i=0; i<n; i++){
         if(a[i]=='1'){
            c++;
            ans[i]=j;
            j++;

            if(c==k) break;
         }else{
            c=0;
         }
     
    }
    if(i<n){
        cout<<"NO\n";
        return;
      }

    for(i=0; i<n; i++){
         if(a[i]=='0'){
             ans[i]=j;
             j++;
         }
    }
    cout<<"YES\n";
    for(i=0; i<n; i++){
        cout<<ans[i]<<" ";
    }
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
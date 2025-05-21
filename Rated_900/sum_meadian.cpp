#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
     ll n,k;
     cin>>n>>k;
     ll a[n*k];
     for(int i=0; i<n*k; i++){
        cin>>a[i];
     }
     sort(a,a+n);

     ll x = n*k;
     ll y = (n/2);
     ll ans =0;
     for(int ll i = x-y-1, j=0; i>=0 && j<k; j++, i-=y+1){
          ans+=a[i];
     }
     cout<<ans<<endl;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t ;
    cin >> t; 
    while (t--) {
        solve();
    }

    return 0;
}
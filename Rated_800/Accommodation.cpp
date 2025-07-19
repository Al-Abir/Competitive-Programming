#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {

    int n ;
    cin>>n;
     int cnt=0;
    for(int i =0;i<n; i++){
         int p,q;
         cin>>p>>q;
       
         if(q-p>=2 ) cnt++;
  
    }
     cout<<cnt<<endl;
    
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    while (t--) {
        solve();
    }

    return 0;
}
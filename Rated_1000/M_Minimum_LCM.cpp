#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    
       int n;
       cin>>n;
       
       int a=1;
       for(int i =2; i*i<=n; i++){
               if(n%i==0) {
                a=n/i;
                break;
               }
       }
       cout<<a<<" "<<n-a<<endl;
    
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
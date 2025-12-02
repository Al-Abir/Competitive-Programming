#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long
int gcd(int a, int b){
     if(b==0){
        return a;
     }else{
         return gcd(b,a%b);
     }
}
void solve() {
    // Your code here
    int a,b,k;
    cin>>a>>b>>k;

    int g = gcd(a,b);

    int g1=a/g;
    int g2= b/g;
    if(g1<=k && g2<=k){
        cout<<1<<endl;
    }else{
        cout<<2<<endl;
    }
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
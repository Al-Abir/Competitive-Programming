#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    // Your code here
    int n,x;
    cin>>n>>x;
    vector<int> arr(n);
    for(auto &i:arr)cin>>i;
    int l = arr[0]-x;
    int r = arr[0]+x;
    int change = 0;

    for(int i=1; i<arr.size(); i++){
         int l1 = arr[i]-x;
         int r1= arr[i]+x;
        if((l1>=l && l1<=r) || (r1>=l && r1<=r) || (l>=l1 && l<=r1) || (r>=l1 && r<=r1) ){
              l = max(l,l1) ;
              r= min(r,r1);
        }else{
            change++;
            l=l1,
            r=r1;
            
        }
    }
    cout<<change<<endl;

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
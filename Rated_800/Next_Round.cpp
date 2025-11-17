#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    int n,k;
    cin>>n>>k;
    vector<int> arr(n);
    for(auto &x:arr) cin>>x;

    int cnt =0;

    int num = arr[k-1];
    if(num==0){
       for(int i=0; i<n; i++) {
         if(arr[i]>num) cnt++;
       }
     cout<<cnt<<endl;
    }else{
        for(int i=0; i<n; i++) {
         if(arr[i]>=num) cnt++;
       }
       cout<<cnt<<endl;
    }
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
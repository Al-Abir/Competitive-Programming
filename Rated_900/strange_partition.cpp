#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    
    ll n , x;
    cin>>n>>x;
    vector<int> arr(n);
    for(auto &i:arr) cin>>i;

    ll sum =0;
    ll max_sum=0;
    ll min_sum=0;

    for(int i =0; i<n; i++){
        if(arr[i]%x==0){
            max_sum += (arr[i])/x;
        }else{
              max_sum += (arr[i])/x+1;
        }
        sum+=arr[i];
    }

    if(sum%x==0){
        min_sum += (sum/x);
    }else{
        min_sum += (sum/x)+1; 
    }
    cout<<min_sum<<" "<<max_sum<<endl;

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
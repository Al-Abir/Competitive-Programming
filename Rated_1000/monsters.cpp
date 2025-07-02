#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    // Your code here
    int n, k;
    cin>>n>>k;
    vector<pair<int, int>> arr(n);

    for(int i =0; i<n; i++){
        int p;
        cin>>p;
        
        arr[i]= {-1*(p%k==0 ? k: p%k) , i+1};
    }
    sort(arr.begin(),arr.end());
    for(int i =0; i<arr.size(); i++){
        cout<<arr[i].second<<" ";
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
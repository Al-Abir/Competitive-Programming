#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    // Your code here
    int n;
    cin>>n;
    vector<int> arr(n);
    for(int i=0; i<n; i++){

        cin>>arr[i];
    
    } 
    int result = *max_element(arr.begin(),arr.end());
    cout<<result<<endl;
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
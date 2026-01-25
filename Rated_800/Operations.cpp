#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    int n;
    cin >> n;
    vector<int> arr(n);

    for(int i = 0; i < n; i++){
        cin >> arr[i];
    }

    int cnt = 0;

    if(!is_sorted(arr.begin(), arr.end())){
        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i + 1]){
                cnt++;
            }
        }
    }

    cout << cnt << endl;
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
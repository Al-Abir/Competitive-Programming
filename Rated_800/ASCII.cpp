#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    // Your code here
    vector<int> arr;
    for(int i=0; i<3; i++){
           int num;
           cin>>num;
           arr.push_back(num);
    }

    int maxElement = *max_element(arr.begin(),arr.end());
    int minElement = *min_element(arr.begin(), arr.end());

    int dif = maxElement - minElement;

    if(dif>=10){
        cout<<"check again"<<endl;
    }else{
         sort(arr.begin(),arr.end());
         cout<<"final "<<arr[1]<<endl;
    }

    
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    // cin >> t; // Uncomment for multiple test cases
    while (t--) {
        solve();
    }

    return 0;
}
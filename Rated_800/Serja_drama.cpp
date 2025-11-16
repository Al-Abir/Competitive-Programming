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

    int i=0,j=arr.size()-1;
    int ser=0,drama=0;
    bool trun = true;
    while(i<=j){
       if(trun){

           if(arr[i]<arr[j]){
              ser+=arr[j];
              j--;
           }else{
            ser+=arr[i];
            i++;
           }
           trun= false;
       }else{
          if(arr[i]<arr[j]){
              drama+=arr[j];
              j--;
           }else{
            drama+=arr[i];
            i++;
           }
           trun=true;
       }
    }
    cout<<ser<<" "<<drama<<endl;
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
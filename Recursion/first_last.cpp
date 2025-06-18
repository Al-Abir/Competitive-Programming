#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long
int firstOccur(vector<int> &arr, int i, int tar){
    if(i==arr.size()){
        return -1;
    }
    if(arr[i]==tar){
        return i;
    }
   return firstOccur(arr, i+1, tar);
}
int lastOccur(vector<int> & arr, int i, int tar){
     if(i==arr.size()){
        return -1;
     }

     int isFound = lastOccur(arr,i+1,tar);

     if(isFound==-1 && arr[i]==tar){
        return i;
     }
     
     return isFound;
}
void solve() {
    // Your code here

    vector<int> arr = {2,4,5,6,7,5};
    int res=firstOccur(arr, 0, 5);
    cout<<res<<" "<<endl;
    int res2=lastOccur(arr, 0, 5);
    cout<<res2<<" "<<endl;
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
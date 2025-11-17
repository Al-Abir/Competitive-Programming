#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    // Your code here
    string first,second;
    cin>>first>>second;
     transform(first.begin(),first.end(),first.begin(), ::tolower);
     transform(second.begin(),second.end(),second.begin(), ::tolower);

    if(first==second) {
        cout<<0<<endl;
    }else if(first<second){
         cout<<-1<<endl;
    }else{
        cout<<1<<endl;
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
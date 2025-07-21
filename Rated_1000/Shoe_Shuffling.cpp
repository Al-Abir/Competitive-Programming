#include <iostream>
#include <vector>
#include <algorithm>
#include<map>
using namespace std;
#define ll long long

void solve() {
    // Your code here
    int n;
    cin>>n;
    vector<int> s(n);
    map<int,int> mp;
    for(auto &i: s){
        cin>>i;
        mp[i]++;
    }
    for(auto i :mp){
        if(i.second==1){
            cout<<"-1\n";
            return;
        }
    }
    vector<int> p(n);
    for(int i=0; i<n ;i++){
         int a = i+1;
         while (i+1<n && s[i]==s[i+1])
         {
            p[i]= i+2;
            i++;
         }
         p[i]=a;
         
    }

    for(auto i : p){
        cout<<i<<" ";
    }
    cout<<endl;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t--) {
        solve();
    }

    return 0;
}
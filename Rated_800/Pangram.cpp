#include <iostream>
#include <vector>
#include <algorithm>
#include<map>
using namespace std;
#define ll long long

void solve() {
       int n;
       cin>>n;
      
       cin.ignore(); // buffer clear
       string s;
       getline(cin,s);

      if(n<26) {
        cout<<"NO\n";
        return ;
      }  
       transform(s.begin(), s.end(), s.begin(), ::tolower);
       map<char,int> mp;

       for(int i=0; i<n;i++){
         char ch = s[i]; 
         if(ch>='a' && ch<='z'){
           mp[ch]++;
         }
       }
       if(mp.size()==26)cout<<"YES\n";
       else{
            cout<<"NO\n";
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
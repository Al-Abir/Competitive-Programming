#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    // Your code here
      string s ;
      cin>>s;
      int cnt =0; 
      int cnt2=0;
      
      for(int i =0; i<s.size(); i++) 
       {
         if(s[i]=='0') cnt++;
         else cnt2++;
       }
       int ope = min(cnt, cnt2);

       if(ope%2==1){
        cout<<"DA"<<endl;
       }else{
        cout<<"NET"<<endl;
       }
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
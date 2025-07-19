#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {

    string s ;
    cin>>s;
    int cnt=1;
    bool ans =false;
    for(int i=0; i<s.size()-1; i++){
         if(s[i]==s[i+1]) cnt++;
         else{
            cnt=1;
         }
         if(cnt==7){
             ans = true;
             break;
         }
    }
    if(ans){
        cout<<"YES"<<endl;
    }else{
        cout<<"NO"<<endl;
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    
    while (t--) {
        solve();
    }

    return 0;
}
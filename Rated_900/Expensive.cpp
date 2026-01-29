#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
      
    string s ;
    cin>>s;
     if(s.size()==1){
         cout<<0<<endl;
     }else{
        int last_digit;
        for(int i =0; i<s.size(); i++){
           
              if(s[i]!='0') last_digit=i;
        
        }
        int cnt =0;

        for(int i=0; i<last_digit; i++){
             if(s[i]!='0') cnt++;
        }
       int result = s.size()-(last_digit+1)+ cnt;
        cout<<result<<endl;
     }

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
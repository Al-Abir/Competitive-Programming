#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    
    int n;
    cin>>n; 
    char c;
    cin>>c;
    string s;
    cin>>s;
    s=s+s;
    int green_Signal = s.size();

    int ans=0;
    for(int i=(s.size()-1);i>=0; i--){
         if(s[i]=='g') green_Signal=i;
         if(s[i]==c) ans=max(ans,green_Signal-i);
    }
    cout<<ans<<endl;
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
#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int costToMake2026(string sub) {
    string target = "2026";
    int changes = 0;
    for (int i = 0; i < 4; i++) {
        if (sub[i] != target[i]) {
            changes++;
        }
    }
    return changes;
}

void solve() {
    int n;
    cin >> n;
    string s;
    cin >> s;

   
    int costA = 0;
    string tempS = s;
    for (int i = 0; i <= n - 4; i++) {
        if (tempS.substr(i, 4) == "2025") {
            costA++;
    
            i += 3; 
        }
    }

 
    int costB = 5;
    for (int i = 0; i <= n - 4; i++) {
        costB = min(costB, costToMake2026(s.substr(i, 4)));
    }

  
    cout << min(costA, costB) << endl;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int t;
    cin >> t;
    while (t--) {
        solve();
    }
    return 0;
}
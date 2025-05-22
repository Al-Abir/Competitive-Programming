#include <iostream>
#include <vector>
using namespace std;

void solve() {
    int n;
    cin >> n; // 🔄 প্রথমে ইনপুট নিতে হবে
    vector<int> arr(n); // ✅ এরপর ভেক্টর declare

    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    for (int i = 0; i < n - 2; i++) {
        if (arr[i] < arr[i + 1] && arr[i + 1] > arr[i + 2]) {
            cout << "YES" << endl;
            cout << i + 1 << " " << i + 2 << " " << i + 3 << endl; // ✅ 1-based indexing
            return;
        }
    }

    cout << "NO" << endl;
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

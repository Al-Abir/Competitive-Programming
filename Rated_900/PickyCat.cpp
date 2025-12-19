#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void solve() {
    // Your code here
    long long n;
cin >> n;
long long arr[n + 10], value;
for (int i = 1; i <= n; i++) 
{
    cin >> arr[i];
    arr[i] = abs(arr[i]);
    if (i == 1) 
    {
        value = arr[i];
    }
}
sort(arr + 1, arr + n + 1);

int f = 0;
for (int i = 1; i <= (n + 1) / 2; i++) 
{
    if (arr[i] == value) 
    {
        f = 1;
        break;
    }
}

if (f == 1 || (n % 2 == 0 && arr[n / 2 + 1] == value)) 
{
    cout << "YES" << endl;
} 
else 
    {
    cout << "NO" << endl;
}
}


int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t; // Uncomment for multiple test cases
    while (t--) {
        solve();
    }

    return 0;
}
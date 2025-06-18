#include <iostream>
#include <vector>
#include <numeric>
#include <algorithm>

using namespace std;

int solve() {
    int n, k;
    cin >> n >> k;
    vector<int> a(n);
    bool product_already_divisible = false;
    for (int i = 0; i < n; ++i) {
        cin >> a[i];
        if (a[i] % k == 0) {
            product_already_divisible = true;
        }
    }

    if (product_already_divisible) {
        return 0;
    }

    int min_ops = k; 
    for (int x : a) {
        min_ops = min(min_ops, (k - (x % k)) % k);
    }
    if (k == 4) {
        int count_even = 0;
        for (int x : a) {
            if (x % 2 == 0) {
                count_even++;
            }
        }
        if (count_even >= 2) {
            min_ops = 0;
        } else if (count_even == 1) {
            min_ops = min(min_ops, 1); 
        } else { 
            min_ops = std::min(min_ops, 2); 
        }
    }

    return min_ops;
}

int main() {
    std::ios_base::sync_with_stdio(false);
    std::cin.tie(NULL);
    int t;
    cin >> t;
    while (t--) {
        cout << solve() << "\n";
    }
    return 0;
}
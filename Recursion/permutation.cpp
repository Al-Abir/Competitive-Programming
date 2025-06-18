#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    void backtrack(vector<int>& n, int start, vector<vector<int>>& res) {
        if (start == n.size()) {
            res.push_back(n);
            return;
        }
        for (int i = start; i < n.size(); i++) {
            swap(n[start], n[i]);
            backtrack(n, start + 1, res);
            swap(n[start], n[i]); // Backtrack
        }
    }

    vector<vector<int>> permute(vector<int>& n) {
        vector<vector<int>> res;
        backtrack(n, 0, res);
        return res;
    }
};

int main() {
    Solution sol;
    vector<int> nums = {1, 2, 3};  // Example input

    vector<vector<int>> result = sol.permute(nums);

    cout << "All permutations:\n";
    for (const auto& perm : result) {
        cout << "[";
        for (int num : perm) {
            cout << num << " ";
        }
        cout << "]\n";
    }

    return 0;
}

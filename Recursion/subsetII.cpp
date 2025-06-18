#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    void getAllSubSet(vector<int>& nums, vector<int>& ans, int i, vector<vector<int>>& allsubset) {
        if (i == nums.size()) {
            allsubset.push_back(ans);
            return;
        }

        // Include current element
        ans.push_back(nums[i]);
        getAllSubSet(nums, ans, i + 1, allsubset);
        ans.pop_back(); // Backtrack after include

        // Skip duplicates in exclude path
        int idx = i + 1;
        while (idx < nums.size() && nums[idx] == nums[i]) {
            idx++;
        }

        // Exclude current element
        getAllSubSet(nums, ans, idx, allsubset);
    }

    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        vector<vector<int>> allsubset;
        vector<int> ans;
        sort(nums.begin(), nums.end()); // Sort to handle duplicates
        getAllSubSet(nums, ans, 0, allsubset);
        return allsubset;
    }
};

int main() {
    Solution sol;
    vector<int> nums = {1, 2, 2};

    vector<vector<int>> result = sol.subsetsWithDup(nums);

    cout << "All unique subsets:\n";
    for (const auto& subset : result) {
        cout << "[";
        for (int num : subset) {
            cout << num << " ";
        }
        cout << "]\n";
    }

    return 0;
}

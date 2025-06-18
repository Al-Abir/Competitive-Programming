#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    void getAllSubset(vector<int>& nums, vector<int>& ans, int i, vector<vector<int>>& allsubset) {
        if (i == nums.size()) {
            allsubset.push_back(ans);
            return;
        }

        // include current element
        ans.push_back(nums[i]);
        getAllSubset(nums, ans, i + 1, allsubset);

        // exclude current element
        ans.pop_back();
        getAllSubset(nums, ans, i + 1, allsubset);
    }

    vector<vector<int>> subsets(vector<int>& nums) {
        vector<vector<int>> allsubset;
        vector<int> ans;
        getAllSubset(nums, ans, 0, allsubset);
        return allsubset;
    }
};

int main() {
    Solution sol;

    vector<int> nums = {1, 2, 3}; // You can change this input
    vector<vector<int>> result = sol.subsets(nums);

    cout << "All subsets:\n";
    for (const auto& subset : result) {
        cout << "[";
        for (int num : subset) {
            cout << num << " ";
        }
        cout <<"]\n";
    }

    return 0;
}

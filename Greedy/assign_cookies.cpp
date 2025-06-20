#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        // Sort the greed and cookie size arrays
        sort(g.begin(), g.end());
        sort(s.begin(), s.end());

        int i = 0; // index for children
        int j = 0; // index for cookies
        int count = 0;

        while (i < g.size() && j < s.size()) {
            if (s[j] >= g[i]) {
                count++;
                i++; // child satisfied
            }
            j++; // try next cookie
        }

        return count;
    }
};

int main() {
    Solution obj;
    vector<int> g = {1, 2, 3}; // greed factors
    vector<int> s = {1, 1};    // cookie sizes

    cout << "Max satisfied children: " << obj.findContentChildren(g, s) << endl;
    return 0;
}

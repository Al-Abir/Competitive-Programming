#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    bool lemonadeChange(vector<int>& bills) {
        int five = 0, ten = 0; // count of $5 and $10 bills

        for (int bill : bills) {
            if (bill == 5) {
                five++; // no change needed
            } 
            else if (bill == 10) {
                if (five == 0) return false; // need $5 as change
                five--;
                ten++;
            } 
            else if (bill == 20) {
                if (ten > 0 && five > 0) {
                    ten--; five--; // best: give $10 + $5
                } else if (five >= 3) {
                    five -= 3; // give three $5 bills
                } else {
                    return false; // can't give change
                }
            }
        }

        return true;
    }
};

int main() {
    Solution obj;
    vector<int> bills = {5, 5, 5, 10, 20};
    cout << (obj.lemonadeChange(bills) ? "true" : "false") << endl;
    return 0;
}

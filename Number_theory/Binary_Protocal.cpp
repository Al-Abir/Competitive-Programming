#include <iostream>
#include <string>
using namespace std;

int main() {
    int n;
    string s;
    cin >> n >> s;
    
    string decoded = "";
    int ones_count = 0;
    
    for (char c : s) {
        if (c == '1') {
            ones_count++;
        } else {
            decoded += to_string(ones_count);
            ones_count = 0;
        }
    }
    
    // Add the last digit (after the last '0' or if no '0' at all)
    decoded += to_string(ones_count);
    
    cout << decoded << endl;
    
    return 0;
}
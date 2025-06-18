#include <iostream>
using namespace std;

void generate(int n, string s, char last) {
    if (s.length() == n) {
        cout << s << endl;
        return;
    }

    // Always allowed to add '0'
    generate(n, s + '0', '0');

    // Only add '1' if last was '0'
    if (last == '0') {
        generate(n, s + '1', '1');
    }
}

int main() {
    int n;
    cin >> n;
    generate(n, "", '0');  // Start with empty string and last='0'
    return 0;
}

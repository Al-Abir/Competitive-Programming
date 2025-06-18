#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;
#define ll long long

void printAs(int n){
    if(n == 1){
        cout << 1 << " ";
        return;
    }
    printAs(n - 1);
    cout << n << " ";
}

void printDs(int n){
    if(n == 1){
        cout << 1 << " ";
        return;
    }
    cout << n << " ";
    printDs(n - 1);
}

int NaturalNum(int n){
    if(n == 1){
        return 1;
    }
    return n + NaturalNum(n - 1);
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;

    printAs(n);
    cout << endl;

    printDs(n);
    cout << endl;

    int sum = NaturalNum(n);
    cout << sum << endl;

    return 0;
}

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

// Function to calculate average waiting time
double func(vector<int>& arr) {
    sort(arr.begin(), arr.end()); // Sort burst times for SJF
    int t = 0;
    long long wtTime = 0;
    int n = arr.size();

    for (int i = 0; i < n; i++) {
        wtTime += t;
        t += arr[i];
    }

    return (double)wtTime / n;
}

int main() {
    vector<int> arr = {6, 8, 7, 3}; // Example burst times
    double avgWait = func(arr);
    cout << "Average Waiting Time: " << avgWait << endl;
    return 0;
}

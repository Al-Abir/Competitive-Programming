#include <iostream>
using namespace std;

bool isSorted(int arr[], int n, int index = 0) {
    // Base case: if we reach the last or only element, it's sorted
    if (index == n - 1) {
        return true;
    }

    // If current element is greater than next one → not sorted
    if (arr[index] > arr[index + 1]) {
        return false;
    }

    // Recursive call for the next index
    return isSorted(arr, n, index + 1);
}

int main() {
    int arr[] = {1, 2, 3, 4, 5};  // change to {1, 3, 2, 4, 5} to test false
    int n = sizeof(arr) / sizeof(arr[0]);

    if (isSorted(arr, n)) {
        cout << "Array is sorted\n";
    } else {
        cout << "Array is not sorted\n";
    }

    return 0;
}

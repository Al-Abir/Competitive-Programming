#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    bool isSafe(vector<string> &board, int row, int col, int n) {
        // Check upper column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // Check upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check upper right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    void nQueens(vector<string> &board, int row, int n, vector<vector<string>> &ans) {
        if (row == n) {
            ans.push_back(board);
            return;
        }

        for (int j = 0; j < n; j++) {
            if (isSafe(board, row, j, n)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1, n, ans);
                board[row][j] = '.'; // backtrack
            }
        }
    }

    vector<vector<string>> solveNQueens(int n) {
        vector<vector<string>> ans;
        vector<string> board(n, string(n, '.'));

        nQueens(board, 0, n, ans);

        return ans;
    }
};

int main() {
    int n;
    cout << "Enter the value of N for N-Queens: ";
    cin >> n;

    Solution sol;
    vector<vector<string>> results = sol.solveNQueens(n);

    cout << "Total Solutions: " << results.size() << "\n";
    for (int i = 0; i < results.size(); i++) {
        cout << "Solution " << i + 1 << ":\n";
        for (const string &row : results[i]) {
            cout << row << "\n";
        }
        cout << "\n";
    }

    return 0;
}

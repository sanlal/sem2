#include <iostream>
#include <cstring>
using namespace std;

const int M = 10; // number of rows
const int N = 10; // number of columns

// Recursive function to traverse the island
void traverse(int mat[][N], int i, int j) {
    // Mark the current cell as visited
    mat[i][j] = 1;

    // Check all 8 adjacent cells
    for (int row = i - 1; row <= i + 1; row++) {
        for (int col = j - 1; col <= j + 1; col++) {
            // If the adjacent cell is within the grid and is part of the island
            if (row >= 0 && row < M && col >= 0 && col < N && mat[row][col] == 0) {
                traverse(mat, row, col);
            }
        }
    }
}

// Function to count the number of islands in the given 2D array
int countIslands(int mat[][N]) {
    int count = 0;

    // Initialize all cells as unvisited
    memset(mat, 0, sizeof(mat));

    // Traverse the grid
    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            // If the cell is part of an unvisited island
            if (mat[i][j] == 0) {
                // Traverse the island
                traverse(mat, i, j);
                // Increment the island count
                count++;
            }
        }
    }

    return count;
}

int main() {
    int mat[M][N] = {
        {1, 0, 1, 0, 0, 0, 1, 1, 1, 1},
        {0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
        {1, 1, 1, 1, 0, 0, 1, 0, 0, 0},
        {1, 0, 0, 1, 0, 1, 0, 0, 0, 0},
        {1, 1, 1, 1, 0, 0, 0, 1, 1, 1},
        {0, 1, 0, 1, 0, 0, 1, 1, 1, 1},
        {0, 0, 0, 0, 0, 1, 1, 1, 0, 0},
        {0, 0, 0, 1, 0, 0, 1, 1, 1, 0},
        {1, 0, 1, 0, 1, 0, 0, 1, 0, 0},
        {1, 1, 1, 1, 0, 0, 0, 1, 1, 1}
    };

    int islandCount = countIslands(mat);

    cout << "Number of islands: " << islandCount << endl;

    return 0;
}

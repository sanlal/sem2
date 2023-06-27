/*
a STACK implementation in C++ to store scores and find the average score:
*/

#include <iostream>
#include <stack>
using namespace std;

stack<int> scores;

int sum() {
    int total = 0;
    while (!scores.empty()) {
        total += scores.top();
        scores.pop();
    }
    return total;
}

float average() {
    int size = scores.size();
    return (float) sum() / size;
}

int main() {
    scores.push(90);
    scores.push(85);
    scores.push(80);
    scores.push(75);
    scores.push(70);
    cout << "Average Score: " << average() << endl;
    return 0;
}

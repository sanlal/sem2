/* a QUEUE implementation in C++ to store scores
 and find the average score:
*/
#include <iostream>
#include <queue>
using namespace std;

queue<int> scores;

int sum() {
    int total = 0;
    int size = scores.size();
    for (int i = 0; i < size; i++) {
        total += scores.front();
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

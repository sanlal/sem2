/* a linked list implementation in C++ 
to store scores and find the average score:
*/

#include <iostream>
using namespace std;

struct Node {
    int data;
    Node* next;
};

class LinkedList {
private:
    Node* head;
    int size;

public:
    LinkedList() {
        head = NULL;
        size = 0;
    }

    void insert(int data) {
        Node* new_node = new Node;
        new_node->data = data;
        new_node->next = head;
        head = new_node;
        size++;
    }

    int sum() {
        int total = 0;
        Node* current = head;
        while (current != NULL) {
            total += current->data;
            current = current->next;
        }
        return total;
    }

    float average() {
        return (float) sum() / size;
    }
};

int main() {
    LinkedList scores;
    scores.insert(90);
    scores.insert(85);
    scores.insert(80);
    scores.insert(75);
    scores.insert(70);
    cout << "Average Score: " << scores.average() << endl;
    return 0;
}

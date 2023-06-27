#include <iostream>

using namespace std;

// Structure to represent a node in the queue
struct Node {
    string data;
    Node* next;
};

// Function to enqueue an element in the queue
void enqueue(Node** rear, string value) {
    Node* temp = new Node;
    temp->data = value;
    temp->next = nullptr;

    if (*rear == nullptr) {
        *rear = temp;
        (*rear)->next = *rear;
    }
    else {
        temp->next = (*rear)->next;
        (*rear)->next = temp;
        (*rear) = temp;
    }
}

// Function to dequeue an element from the queue
string dequeue(Node** rear) {
    if (*rear == nullptr) {
        return "";
    }

    string value;

    if ((*rear)->next == *rear) {
        value = (*rear)->data;
        delete *rear;
        *rear = nullptr;
    }
    else {
        Node* temp = (*rear)->next;
        value = temp->data;
        (*rear)->next = temp->next;
        delete temp;
    }

    return value;
}

// Function to generate binary numbers between 1 to N using a queue
void generateBinary(int n) {
    Node* rear = nullptr;
    enqueue(&rear, "1");

    while (n--) {
        string s1 = dequeue(&rear);

        cout << s1 << " ";

        string s2 = s1;
        s1.append("0");
        s2.append("1");

        enqueue(&rear, s1);
        enqueue(&rear, s2);
    }
}

// Driver code
int main() {
    int n = 16;
    generateBinary(n);

    return 0;
}

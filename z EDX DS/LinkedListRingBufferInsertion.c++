//RING BUFFER INSERTION using LINKED LIST


#include <iostream>

struct Node {
    int data;
    Node *next;
};

class RingBuffer {
private:
    Node *head, *tail;

public:
    RingBuffer() {
        head = tail = nullptr;
    }

    void insert(int element) {
        Node *temp = new Node;
        temp->data = element;
        temp->next = nullptr;
        if (head == nullptr) {
            head = tail = temp;
            temp->next = head;
        } else {
            tail->next = temp;
            tail = temp;
            tail->next = head;
        }
    }

    void print() {
        Node *temp = head;
        do {
            std::cout << temp->data << " ";
            temp = temp->next;
        } while (temp != head);
        std::cout << std::endl;
    }
};

int main() {
    RingBuffer buffer;
    buffer.insert(1);
    buffer.insert(2);
    buffer.insert(3);
    buffer.insert(4);
    buffer.insert(5);
    buffer.insert(6);
    buffer.print();
    return 0;
}

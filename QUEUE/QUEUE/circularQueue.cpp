#include <iostream>

using namespace std;

const int MAX_SIZE = 100;

class CircularQueue {
private:
    int front;
    int rear;
    int arr[MAX_SIZE];
public:
    CircularQueue() {
        front = -1;
        rear = -1;
    }
    bool isFull() {
        if ((front == 0 && rear == MAX_SIZE - 1) || (rear == (front - 1) % (MAX_SIZE - 1))) {
            return true;
        }
        return false;
    }
    bool isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }
    void enqueue(int item) {
        if (isFull()) {
            cout << "Queue is full." << endl;
            return;
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (rear == MAX_SIZE - 1 && front != 0) {
            rear = 0;
        } else {
            rear++;
        }
        arr[rear] = item;
    }
    void dequeue() {
        if (isEmpty()) {
            cout << "Queue is empty." << endl;
            return;
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == MAX_SIZE - 1) {
            front = 0;
        } else {
            front++;
        }
    }
    int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }
    int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[rear];
    }
};

int main() {
    CircularQueue q;
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);
    q.dequeue();
    q.dequeue();
    cout << "Front element is: " << q.getFront() << endl;
    cout << "Rear element is: " << q.getRear() << endl;
    q.enqueue(410);
        cout << "Front element is: " << q.getFront() << endl;
    cout << "Rear element is: " << q.getRear() << endl;
    return 0;
}

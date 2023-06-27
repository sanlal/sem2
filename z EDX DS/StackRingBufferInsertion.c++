//RING BUFFER INSERTION using STACK
#include <iostream>
#include <stack>

const int MAX_SIZE = 5;

class RingBuffer {
private:
    std::stack<int> buffer;

public:
    void insert(int element) {
        if (buffer.size() == MAX_SIZE) {
            buffer.pop();
        }
        buffer.push(element);
    }

    void print() {
        std::stack<int> tempStack;
        while (!buffer.empty()) {
            tempStack.push(buffer.top());
            buffer.pop();
        }
        while (!tempStack.empty()) {
            std::cout << tempStack.top() << " ";
            buffer.push(tempStack.top());
            tempStack.pop();
        }
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

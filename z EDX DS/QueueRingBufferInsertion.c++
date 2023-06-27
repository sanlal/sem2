#include <iostream>
#include <queue>
using namespace std;
class RingBuffer {
private:
    std::queue<int> buffer;
    int size;

public:
    RingBuffer(int size) : size(size) {}

    void insert(int element) {
        if (buffer.size() < size) {
            buffer.push(element);
        } else {
            buffer.pop();
            buffer.push(element);
        }
    }

    void print() {
        while (!buffer.empty()) {
            std::cout << buffer.front() << " ";
            buffer.pop();
        }
        std::cout << std::endl;
    }
};

int main() {
    int size;
    cout<<"Enter the size of the ring buffer: ";
    cin >>size;
    RingBuffer buffer(size);
    buffer.insert(1);
    buffer.insert(2);
    buffer.insert(3);
    buffer.insert(4);
    buffer.insert(5);
    buffer.insert(6);
    buffer.print();
    return 0;
}

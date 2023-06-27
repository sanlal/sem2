//RING BUFFER INSERTION using array
#include <iostream>

const int MAX_SIZE = 6;

class RingBuffer {
private:
    int buffer[MAX_SIZE];
    int nextIndex = 0;
    int count = 0;

public:
    void insert(int element) {
        if (count < MAX_SIZE) {
            buffer[nextIndex] = element;
            nextIndex = (nextIndex + 1) % MAX_SIZE;
            count++;
        }
    }

    void print() {
        for (int i = 0; i < count; i++) {
            int index = (nextIndex + i) % MAX_SIZE;
            std::cout << buffer[index] << " ";
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

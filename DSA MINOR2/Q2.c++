
#include <iostream>
#include <vector>
#include <string>
using namespace std;

class MinHeap {
    private:
        vector<string> heap;
        void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int smallest = i;
            if (left < heap.size() && heap[left] < heap[smallest]) {
                smallest = left;
            }
            if (right < heap.size() && heap[right] < heap[smallest]) {
                smallest = right;
            }
            if (smallest != i) {
                swap(heap[i], heap[smallest]);
                heapify(smallest);
            }
        }
    public:
        bool Insert(string name) {
            heap.push_back(name);
            int i = heap.size() - 1;
            while (i > 0 && heap[(i - 1) / 2] > heap[i]) {
                swap(heap[i], heap[(i - 1) / 2]);
                i = (i - 1) / 2;
            }
            return true;
        }
        bool Delete(string name) {
            for (int i = 0; i < heap.size(); ++i) {
                if (heap[i] == name) {
                    swap(heap[i], heap[heap.size() - 1]);
                    heap.pop_back();
                    if (i > 0 && heap[(i - 1) / 2] > heap[i]) {
                        while (i > 0 && heap[(i - 1) / 2] > heap[i]) {
                            swap(heap[i], heap[(i - 1) / 2]);
                            i = (i - 1) / 2;
                        }
                    } else {
                        heapify(i);
                    }
                    return true;
                }
            }
            return false;
        }
        string extractMin() {
            string minVal = "";
            if (!heap.empty()) {
                minVal = heap[0];
                swap(heap[0], heap[heap.size() - 1]);
                heap.pop_back();
                if (!heap.empty()) {
                    heapify(0);
                }
            }
            return minVal;
        }
};

int main() {
    MinHeap minHeap;
    minHeap.Insert("John");
    minHeap.Insert("Alice");
    minHeap.Insert("Bob");
    cout << "Extracted minimum element: " << minHeap.extractMin() << endl; // Alice
    cout << "Extracted minimum element: " << minHeap.extractMin() << endl; // Bob
    cout << "Extracted minimum element: " << minHeap.extractMin() << endl; // John
    cout << "Extracted minimum element: " << minHeap.extractMin() << endl; // ""
    return 0;
}


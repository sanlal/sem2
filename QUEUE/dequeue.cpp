#include <iostream>

using namespace std;

#define CAPACITY 10

template <typename T>
class Queue{
	T arr[CAPACITY];
	int frontIdx;
	int rearIdx;
	int count;
	int capacity;
	
public:
	Queue(){
		frontIdx = rearIdx = -1;
		count = 0;
		capacity = CAPACITY;
	}
	
	int size(){
		return count;
	}
	
	bool isEmpty(){
		return count == 0;
	}
	
	bool isFull(){
		return count == capacity;
	}
	
	bool enqueueRear(T u){
		if(isFull())
			return false;
		if(isEmpty()) frontIdx = 0;
		rearIdx = (rearIdx + 1) % capacity;
		arr[rearIdx] = u;
		count ++;
		return true;
	}
	
	// called on non-empty queue
	T dequeueFront(){
		T ru = arr[frontIdx];
		if(size() == 1) frontIdx = rearIdx = -1;
		else frontIdx = (frontIdx + 1) % capacity;
		
		count --;
		return ru;
	}
	
	bool enqueueFront(T u){
		if(isFull())
			return false;
		if(isEmpty()) frontIdx = rearIdx = 0;
		else frontIdx = frontIdx - 1 < 0 ? capacity - 1 : frontIdx - 1;
		count ++;
		arr[frontIdx] = u;
		return true;
	}
	
	// called on non-empty queue
	T dequeueRear(){
		T ru = arr[rearIdx];
		if(size() == 1) frontIdx = rearIdx = -1;
		else rearIdx = rearIdx - 1 < 0 ? capacity - 1 : rearIdx - 1;
		count --;
		return ru;
	}
	
	void print(){
		/*if(!isEmpty()){
			for(int i = frontIdx; i != rearIdx;){
				cout << arr[i];
				if(i == frontIdx) cout << " <- front";
				cout << endl;
				i = (i + 1) % capacity;
			}
			cout << arr[rearIdx] << " <- rear " << endl;
		}*/
		if(frontIdx<rearIdx){
			for(int i=frontIdx;i<=rearIdx;i++){
				cout<<arr[i]<<endl;
			}
		}
		else{
			  for(int i= frontIdx;i>0;i--){
					cout<<arr[i]<<endl;
				}
				for(int i =0;i<rearIdx;i++){
					cout<<arr[i]<<endl;
				}
			}
		}
	
	
	
};

void menu()
{
	cout << "MENU OF OPERATIONS ON QUEUE" << endl;
	cout << "1. Enqueue from rear" << endl;
	cout << "2. Enqueue from front" << endl;
	cout << "3. Dequeue from rear" << endl;
	cout << "4. Dequeue from front" << endl;
	cout << "5. Check if queue is empty" << endl;
	cout << "6. Check if queue is full" << endl;
	cout << "7. Show size of queue" << endl;
	cout << "8. Display the contents of queue" << endl;
	cout << "9. Exit" << endl;
}

int main()
{
	Queue<int> q;
	int op;
	int ele;
	do{
		menu();
		cout << "Enter your choice: "; cin >> op;
		
		switch(op){
			case 1:
				cout << "Enter an element to enter in the queue: ";
				cin >> ele;
				if(!q.enqueueRear(ele)) cout << "Queue is full" << endl;
				break;
			case 2:
				cout << "Enter an element to enter in the queue: ";
				cin >> ele;
				if(!q.enqueueFront(ele)) cout << "Queue is full" << endl;
				break;
			case 3:
				if(!q.isEmpty()) cout << q.dequeueRear() << " has been removed from the queue" << endl;
				break;
			case 4:
				if(!q.isEmpty()) cout << q.dequeueFront() << " has been removed from the queue" << endl;
				break;
			case 5:
				if(q.isEmpty()) cout << "Queue is empty" << endl;
				else cout << "Queue is not empty" << endl;
				break;
			case 6:
				if(q.isFull()) cout << "Queue is full" << endl;
				else cout << "Queue is not full" << endl;
				break;
			case 7:
				cout << "Size of queue is " << q.size() << endl;
				break;
			case 8:
				q.print();
				break;
		}
	}while(op < 9);
	return 0;	
}

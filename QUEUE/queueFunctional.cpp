#include <iostream>
using namespace std;

#define CAPACITY 5

char arr[CAPACITY];
int frontIdx = -1;
int rearIdx = -1;
int count = 0;
int capacity = CAPACITY;

int size(){
	return count;
}

bool isEmpty(){
	return count == 0;
}

bool isFull(){
	return count == capacity;
}

bool enqueue(char u){
	if(isFull())
		return false;
	if(isEmpty()) frontIdx = 0;
	rearIdx = (rearIdx + 1) % capacity;
	arr[rearIdx] = u;
	count ++;
	return true;
}

// called on non-empty queue
char dequeue(){
	char ru = arr[frontIdx];
	if(size() == 1) frontIdx = rearIdx = -1;
	else frontIdx = (frontIdx + 1) % capacity;
	
	count --;
	return ru;
}

void print(){
	if(!isEmpty()){
		for(int i = frontIdx; i != rearIdx;){
			cout << arr[i];
			if(i == frontIdx) cout << " <- front"<<endl<<endl;
			cout << endl;
			i = (i + 1) % capacity;
		}
		cout << arr[rearIdx] << " <- rear " << endl<<endl;
	}
}

void menu()
{
	int ascii=222;
	char ch=ascii;
	for(int i=1;i<50;i++){
		cout<<ch;
	}
	cout<<endl;
	cout << "MENU OF OPERATIONS ON QUEUE" << endl;
	for(int i=1;i<50;i++){
		cout<<ch;
	}
	cout<<endl<<endl;
	cout << "1. Enqueue" << endl;
	cout << "2. Dequeue" << endl;
	cout << "3. Check if queue is empty" << endl;
	cout << "4. Check if queue is full" << endl;
	cout << "5. Show size of queue" << endl;
	cout << "6. Display the contents of queue" << endl;
	cout << "7. Exit" << endl;
	
		for(int i=1;i<50;i++){
		cout<<ch;
	}
	cout<<endl;
}

int main()
{
	int op;
	char ele;
	do{
		menu();
		cout << "Enter your choice: "; cin >> op;
		
		switch(op){
			case 1:
				cout << "Insert an element to enter in the QUEUE: ";
				cin >> ele;
				if(!enqueue(ele)) cout << "QUEUE OVERFLOWED" << endl;
				break;
			case 2:
				if(!isEmpty()) cout << dequeue() << " has been removed from the queue" << endl;
				break;
			case 3:
				if(isEmpty()) cout << "QUEUE UNDERFLOWED" << endl;
				else cout << "Queue is not empty" << endl;
				break;
			case 4:
				if(isFull()) cout << "Queue is full" << endl;
				else cout << "Queue is not full" << endl;
				break;
			case 5:
				cout << "Size of queue is " << size() << endl;
				break;
			case 6:
				print();
				break;
		}
	}while(op < 7);
	return 0;	
}

#include<iostream>
#include<stack>
#define SIZE 10
using namespace std;
class queue{
	    int frontIndex;
	    int rearIndex;
	    int arr[SIZE];
	public:
		queue();
		int enque(int item);
		void deque(int *item);
		
	    int isFull(){
		    int full = 0 ;
		    if( rearIndex == SIZE-1 )
            full = 1;
		    return full;
	}
 
//To check queue is empty or not
    int isEmpty(){
	    int empty = 0 ;
		if( frontIndex == rearIndex + 1 )
        empty = 1;
 
    return empty;
	}
		
};

 
//Insert Item into queue
void queue:: enQueue(int item)
{
    if( isFull() )
    {
        cout<<"\nQueue OverFlow" << endl;
        return;
    }   
 
    ele[++rearIndex]=item;
    cout<<"\ninserted Value :" << item;
}
 
//delete item from queue
int queue:: deQueue(int *item)
{
    if( isEmpty() )
    {
        cout<<"\nQueue Underflow" << endl;
        return -1;
    }
 
    *item = ele[front++];
    return 0;
}
 
int main()
{
    int item=0;
 
    Queue q = Queue();
 
    q.enqueue(10);
     q.enqueue(120);
      q.enqueue(150);
     q.enqueue(100);
      q.enqueue(101);
      
      cout<<"popped: "<< q.deQueue(&item);
      
}


#include<iostream>
#include<stack>
#define SIZE 10
using namespace std ;

class Dstack{
	private:
		int top1;
		int top2;
		int arr[SIZE];
	public:
		Dstack();
		void pushA(int item);
		void pushB(int item);
		int popA(int *item);
		int popB(int *item);
		
		bool isEmptyA(){
			if(top1==-1)
			return false;
		}
		
		bool isFullA(){
			if(top1==top2-1)
			return false;
		}
		
		bool isEmptyB(){
			if(top2==SIZE+1)
			return false;
		}
		
		bool isFullB(){
			if(top2==SIZE+1)
			return false;
		}
		
		int peekA(){
			if(top1==-1){
				cout<<"No element in the stack1"<<endl;
				return -1;
			}
			return arr[top1];
		}
			
			
		int peekB(){
			if(top2==SIZE+1){
				cout<<"No element in the stack2"<<endl;
				return SIZE+1;
			}
			return arr[top2];
		}
		
};


Dstack::Dstack(){
		top1 = -1;
		top2 = SIZE;
}

void Dstack::pushA(int item){
	if(top2==top1+1){
		cout<<"Stack1 is overflowed"<<endl;
	}
	else
	{
		++top1;
		arr[top1]=item;
		cout<<"Inserted value in Stack1 is "<<item<<endl;

	}
}


void Dstack::pushB(int item){
	if(top2==top1+1){
		cout<<"Stack2 is overflowed"<<endl;
	}
	else{
		top2--;
		arr[top2]=item;
		cout<<"Inserted value in Stack2 is "<<item<<endl;
    }
}
int Dstack::popA(int *item){
	if(top1==-1){
		cout<<"Stack1 is underflowed"<<endl;
	}
	else{
		arr[top1];
		top1--;
		return 0;
		
	}
}

int Dstack::popB(int *item){
	if(top2==SIZE){
		cout<<"Stack2 is underflowed";
	}
	else{
		arr[top2];
		top2++;
		return 0;
	}
}


int main()
{
	Dstack s;
	int item;
	
	int ascii=178;
	char c=ascii;
	
	for(int i=0;i<70;i++){
		cout<<c;
	}
	cout<<endl<<"\t\t\t\tDOUBLE STACK IMPLEMENTATION"<<endl;
	
	for(int i=0;i<70;i++){
	cout<<c;
	}
	cout<<endl<<endl;
	
	s.pushA(50);
	s.pushB(9);
	s.pushA(0);
	s.pushB(99);
	s.pushA(5);
	s.pushB(19);
	s.pushA(-3);
	s.pushB(1);
	
	
	
	for(int i=0;i<50;i++){
		cout<<c;
	}
	cout<<endl;
	
	cout<<endl<<"Popping value from stack1 : "<<s.peekA()<<endl;
	cout<<endl<<"Popping value from stack2 : "<<s.peekB()<<endl;
	
	s.popA(&item);
    s.popB(&item);

    cout<<"Peek value after popping in Stack1 : "<<s.peekA()<<endl;
    cout<<"Peek value after popping in Stack2 : "<<s.peekB()<<endl;
    
    for(int i=0;i<50;i++){
	    cout<<c;
	}
	cout<<endl;
}

#include<iostream>
#define INVALID_DATA ' '
using namespace std;

template <typename T>
class stack{
	private:
		int capacity;
		int topIndex;
		T arr[100];
	public:
		stack(){
			capacity = 5;
			topIndex = -1;
		}
		stack(int c){
			capacity = c;
			topIndex = -1;
		}


//const int capacity = 5;
//int topIndex = -1;
//char arr[capacity];

//empty or not
bool isEmpty(){
	return (topIndex < 0);
}

//full or not
bool isFull(){
	return (topIndex == capacity-1);
}

//size
int size(){
	return (topIndex + 1);
}

//push operation
bool push(T v){
	if(isFull()){
		return false;
	}
	else
	{
		arr[++topIndex]=v;
		return true;
	}
}

//pop operation
char pop(){
	if(isEmpty()){
		return INVALID_DATA;
	}
	else
	{
		T r = arr[topIndex--];
		return r;
	}
}

//top
char top(){
	if(isEmpty()){
		return INVALID_DATA;
	}
	else
	{
		return arr[topIndex];
	}
}

//print
void print(){
	if(!isEmpty()){
		cout<<"Stack";
		for(int i=topIndex; i>=0; i--){
			cout<<"\n"<<arr[i];
			if(i==topIndex){
				cout<<"<-top";
			}
		}
		cout<<"\n";
	}
}
};

//main function
int main(){
	stack<char> s;
	int o;
	char par;
	char ch=003;
	int ascii=ch;
	while(o<8){
		for(int i=0; i<100; i++){
			cout<<ch;
		}
		cout<<"\n";
		cout<<"\t\t\t\tARRAY BASED IMPLEMENTATION OF STACK using TEMPLATE \n";
		
		for(int i=0; i<100; i++){
			cout<<ch;
		}
		cout<<"\n";
		cout<<ch<<"Enter"<<": \n";
		cout<<ch<<ch<<ch<<" 1. IsEmpty \n";
    	cout<<ch<<ch<<ch<<" 2. IsFull \n";
		cout<<ch<<ch<<ch<<" 3. Size \n";
		cout<<ch<<ch<<ch<<" 4. Print \n";
		cout<<ch<<ch<<ch<<" 5. Enter data \n";// push
		cout<<ch<<ch<<ch<<" 6. Pop the data \n"; //pop
		cout<<ch<<ch<<ch<<" 7. Top of data \n"; //top
		cout<<ch<<ch<<ch<<"Enter ";
		cin>>o;
		switch(o){
			case 1:
				cout<<(s.isEmpty()?"Empty" : "Not Empty")<<"\n";
				break;
			case 2:
			    cout<<(s.isFull()?"Full" : "Not Full")<<"\n";	
			    break;
			case 3:
				cout<<"size = "<< s.size();
				break;
			case 4: s.print();
			      break;
			case 5: cout<<"Enter Data : ";
			        cin>>par;
			        if(!s.push(par)){
			        	cout<<"Failed \n";
					}
					break;
			case 6: 
				s.isEmpty()? cout<<"Failed" :cout<< s.pop();
				cout<<"\n";
			    break;
			case 7: 
			    s.isEmpty()? cout<<"Failed" :cout<< s.top();
				cout<<"\n";
				break;
				
		}
		
	}
	return 0;
}


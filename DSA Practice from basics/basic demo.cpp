#include<iostream>
#define n 100
using namespace std;
//class
class stack{
	int *arr;
	int top;
	public:
		//constructor
		stack(){
			arr = new int[n];
			top = -1;
			
		}
		//push operation
		void push(int x){
			if(top == n-1){
				cout<<"Stack overflow"<<endl;
				return;
			}
			top++;
			arr[top]=x;
		}
		//pop operation
		void pop(){
			if(top == -1){
				cout<<"No element to pop"<<endl;
				return;
			}		
			top--;
	    }
	    //top
	    int Top(){
			if(top == -1){
				cout<<"No element to pop"<<endl;
				return -1;
			}
			return arr[top];
		}
		//empty or not
		bool isEmpty(){
			return top == -1;
		}
};
//main function
int main(){
	stack st;
	st.push(1);
	st.push(2);
	st.push(3);
	cout<<st.Top()<<endl;
	st.pop();
	cout<<st.Top()<<endl;
	st.pop();
	st.pop();
	st.pop();
	cout<<st.isEmpty()<<endl;

}


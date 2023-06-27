#include<iostream>
#define MAX 5;
int arr[size];
int top=-1;
void push(int val){
  if(top == size-1){
    cout<<"No space in stack\n";
  }
  else{
    top++;
    arr[size]=val;
  }
}


void pop(){
  if(top==-1){
    cout<<"Stack is Empty\n";
  }
  else{
    cout<<"Popped element is: "<<arr[top];
    top--;
  }
}


int main(){
stack<int> s;

}
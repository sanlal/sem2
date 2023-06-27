#include <iostream>
using namespace std;
#define MAX 5

int array[MAX];
int first = -1;




void push(int data)
{
     first++;
        for (int i = first; i > 0; i--)
        {
            array[i] = array[i - 1];
        }
        array[0] = data;
       
    
}



void print(){
     if(first== -1){
        cout<<"Stack underflow \n";
    }
    else{
    for (int i = 0; i <=first; i++)
        {
            cout<<array[i] <<"  ";
        }
    }
    cout<<endl;
}

int main(){
    push(30);
    push(90);
    push(40);
     cout << "Succesfully Inserted!!\n";
    print();
}
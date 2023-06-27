#include<iostream>
using namespace std;

//Considering Array is not full 
int addAtBeg(int arr[], int n, int data){
    int i;
    for(i=n-1;i>=0;i--){
        arr[i+1]=arr[i];
    }
    arr[0]=data;
    return n+1;
}


int main(){
    int arr[10], data=12,i,n;
    cout<<"Enter a number for no. of elements:  ";
    cin>>n;
    cout<<"Enter elements: ";
    for(i=0;i<n;i++){
        cin>> arr[i];
    }

   n= addAtBeg(arr,n,data);
   
   for(i=0;i<n;i++){
    cout<< arr[i]<<" ";
   }
}
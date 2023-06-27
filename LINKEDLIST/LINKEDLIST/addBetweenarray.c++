#include<iostream>
using namespace std;


void add_at_pos(int arr[],int arr2[],int n, int data,int pos){
    int i;
    int index=pos-1;
    for(i=0;i<=index-1;i++)
        arr2[i]=arr[i];
    
    arr2[index]=data;
    int j;
    for(i=index+1,j=index ; i<n+1, j<n ; i++,j++)
        arr2[i]=arr[j];
    
}

int main(){
    int arr[10], pos=5, data=100,i, size;
     size= sizeof(arr)/sizeof(arr[0]);
    cout<<"enter elements: ";
    for(i=0;i<size;i++){
        cin>>arr[i];
    }

    int arr2[size+1];
    add_at_pos(arr,arr2,size,data,pos);
    for(i=0;i<size+1;i++){
        cout<<arr2[i]<<"  ";
    }



}
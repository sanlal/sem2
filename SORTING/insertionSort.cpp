//INSERTION SORT

#include<iostream>
using namespace std;

void insertionSort(int array[], int n){ //passing array values and it size
	int i,j,current; 
	for(j=1;j<n;j++){
		current = array[j]; // current element starts from index 1 
		i=j-1; //
		while((array[i]>current) && i>=0){
			array[i+1]=array[i];
			i=i-1;
		/*	if(i<0){
				break;
			}
			*/
		}
		array[i+1]= current; 
	}
}

int main(){
	int n,i, arr[n];
	cout<<"Enter a number"<<endl;
	cin>>n;
	cout<<"Enter elements: "<<endl;
	for(i=0;i<n;i++){
		cin>>arr[i];
	}
	
	insertionSort(arr,n);
		for(i=0;i<n;i++){
		cout<<arr[i]<<" ";
	}
	
}

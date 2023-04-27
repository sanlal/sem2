#include <iostream>
using namespace std;


int partition(int arr[], int l, int r){
	int piv = arr[l];
	int i=l, j=r;
	while(i<j){
		while(arr[i]<=piv)
		{
			i++;
		}
		while(arr[j]>piv)
		{
			j--;
		}
		if(i<j){
			
				int temp=arr[i];
				arr[i]= arr[j];
				arr[j]= temp;
			
		}
		
	}
	
				int temp=arr[l];
				arr[l]= arr[j];
				arr[j]= temp;
			
	return j;
}


void QuickSort(int arr[], int const l, int const r)
{
	if (l >= r)
		return; 

	int pivLoc = partition(arr,l,r);
	QuickSort(arr, l, pivLoc-1);
	QuickSort(arr, pivLoc + 1, r);
}


void printArray(int A[], int size)
{
	for (int i = 0; i < size; i++)
		cout << A[i] << " ";
}

int main()
{
//	int arr[] = { 12, 11, 13, 5, 6, 7 };
	int n,i;
	cout<<"Enter a number for number ";
	cin>>n;
	int  arr[n];
	cout<<"Enter elements: ";
	for(i=0;i<n;i++){
		cin>>arr[i];
	}
	
	int arr_size = sizeof(arr) / sizeof(arr[0]);

	cout << "Given array is \n";
	printArray(arr, arr_size);

	QuickSort(arr, 0, arr_size - 1);

	cout << "\nSorted array is \n";
	printArray(arr, arr_size);
	return 0;
}

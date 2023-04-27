#include <iostream>
using namespace std;


void merge(int array[], int const left, int const mid, int const right)
{
	int n1 = mid - left + 1;
	int n2 = right - mid;
 
	int *L = new int[n1],
		*R = new int[n2];

	for (int i = 0; i < n1; i++)
		L[i] = array[left + i];
	for (int j = 0; j < n2; j++)
		R[j] = array[mid + 1 + j];

	int i = 0, j = 0;
	int k = left;

	while (i < n1 && j < n2) {
		if (L[i] <= R[j]) {
			array[k] = L[i];
			i++;
		}
		else {
			array[k] = R[j];
			j++;
		}
		k++;
	}

	while (i < n1) {
		array[k] = L[i];
		i++;
		k++;
	}
	
	while (j < n2) {
		array[k] = R[j];
		j++;
		k++;
	}
	delete[] L;
	delete[] R;
}


void mergeSort(int array[], int const begin, int const end)
{
	if (begin >= end)
		return; 

	int mid = begin + (end - begin) / 2;
	mergeSort(array, begin, mid);
	mergeSort(array, mid + 1, end);
	merge(array, begin, mid, end);
}


void printArray(int A[], int size)
{
	for (int i = 0; i < size; i++)
		cout << A[i] << " ";
}

int main()
{
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

	mergeSort(arr, 0, arr_size - 1);

	cout << "\nSorted array is \n";
	printArray(arr, arr_size);
	return 0;
}

#include <iostream>
using namespace std;

int binary_Search(int arr[], int key, int low, int high)
{
    int mid, pos = -1;
    while (low <= high)
    {
        mid = (low + high) / 2;
        if (key == arr[mid])
        {
            pos = mid;
            break;
        }
        else
        {
            if (key < arr[mid])
            {
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
    }
    return pos;
}

void sort(int arr[], int n)
{
    int i, j;
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            if (arr[i] < arr[j])
            {
                int temp;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    cout << "Sorted succesfully \n";
}

int main()
{
    int n, i, key, list[25], pos;
    cout << "enter no of elements\n";
    cin >> n;
    cout << "enter " << n << " elements";
    for (i = 0; i < n; i++)
        cin >> list[i];

    sort(list, n);
    for (i = 0; i < n; i++)
    {
        cout << list[i] << "   ";
    }

    cout << " \n enter key to search :  ";
    cin >> key;
    pos = binary_Search(list, key, 0, n - 1);
    if (pos == -1)
        cout << "element not found \n";
    else
        cout << "element found at index " << pos;
}
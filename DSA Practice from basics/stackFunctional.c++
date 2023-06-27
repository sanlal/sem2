#include <iostream>
#define INVALID_DATA ' '
using namespace std;

const int capacity = 5;
int topIndex = -1;
char arr[capacity];

// empty or not
bool isEmpty()
{
	return (topIndex < 0);
}

// full or not
bool isFull()
{
	return (topIndex == capacity - 1);
}

// size
int size()
{
	return (topIndex + 1);
}

// push operation
bool push(char v)
{
	if (isFull())
	{
		return false;
	}
	else
	{
		arr[++topIndex] = v;
		return true;
	}
}

// pop operation
char pop()
{
	if (isEmpty())
	{
		return INVALID_DATA;
	}
	else
	{
		char r = arr[topIndex--];
		return r;
	}
}

// top
char top()
{
	if (isEmpty())
	{
		return INVALID_DATA;
	}
	else
	{
		return arr[topIndex];
	}
}

// print
void print()
{
	if (!isEmpty())
	{
		cout << "Stack";
		for (int i = topIndex; i >= 0; i--)
		{
			cout << "\n"
					 << arr[i];
			if (i == topIndex)
			{
				cout << "<-top";
			}
		}
		cout << "\n";
	}
}

// main function
int main()
{
	int o;
	char par;
	char ch = 222;
	int ascii = ch;
	while (o < 8)
	{
		for (int i = 0; i < 100; i++)
		{
			cout << ch;
		}
		cout << "\n";
		cout << "\t\t\t\t ARRAY BASED IMPLEMENTATION OF STACK using FUNCTION \n";

		for (int i = 0; i < 100; i++)
		{
			cout << ch;
		}
		cout << "\n";
		cout << "1. isEmpty \n";
		cout << "2. isFull \n";
		cout << "3. size \n";
		cout << "4. print \n";
		cout << "5. Enter data \n";		 // push
		cout << "6. Pop the data \n "; // pop
		cout << "7. top of data \n";	 // top
		cout << "Enter ";
		cin >> o;
		switch (o)
		{
		case 1:
			cout << (isEmpty() ? "Empty" : "Not Empty") << "\n";
			break;
		case 2:
			cout << (isFull() ? "Full" : "Not Full") << "\n";
			break;
		case 3:
			cout << "size = " << size();
			break;
		case 4:
			print();
			break;
		case 5:
			cout << "Enter Data : ";
			cin >> par;
			if (!push(par))
			{
				cout << "Failed \n";
			}
			break;
		case 6:
			isEmpty() ? cout << "Failed" : cout << pop();
			cout << "\n";
			break;
		case 7:
			isEmpty() ? cout << "Failed" : cout << top();
			cout << "\n";
			break;
		}
	}
	return 0;
}

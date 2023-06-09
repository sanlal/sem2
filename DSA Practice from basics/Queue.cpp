#include <stdlib.h>
#include <iostream>
using namespace std;
#define max 5

class queue
{
private:
    int q[max], item;
    int front, rear;

public:
    queue()
    {
        front = rear = -1;
    }

    void insert_q()
    {
        if (rear >= max - 1)
            cout << "queue Overflow...\n";
        else
        {
            if (front > rear)
                front = rear = -1;
            else
            {
                if (front == -1)
                    front = 0;
                rear++;
                cout << "Enter an item to be inserted:";
                cin >> item;
                q[rear] = item;
                cout << "inserted Sucesfully..into queue..\n";
            }
        }
    }

    void delete_q()
    {
        if (front == -1 || front > rear)
        {
            front = rear = -1;
            cout << "queue is Empty....\n";
        }
        else
        {
            item = q[front];
            front++;
            cout << item << " is deleted Sucesfully....\n";
        }
    }

    void display_q()
    {
        if (front == -1 || front > rear)
        {
            front = rear = -1;
            cout << "queue is Empty....\n";
        }
        else
        {
            for (int i = front; i <= rear; i++)
                cout << "|" << q[i] << "|<--";
        }
    }
};

int main()
{
    int choice;
    queue q;
    while (1)
    {
        cout << "\n\n*****Menu for QUEUE operations*****\n\n";
        cout << "1.INSERT\n2.DELETE\n3.DISPLAY\n4.EXIT\n";
        cout << "Enter Choice:";
        cin >> choice;
        switch (choice)
        {
        case 1:
            q.insert_q();
            break;
        case 2:
            q.delete_q();
            break;
        case 3:
            cout << "Elements in the queue are....\n";
            q.display_q();
            break;
        case 4:
            exit(0);
        default:
            cout << "Invalid choice...Try again...\n";
        }
    }
    return 0;
}

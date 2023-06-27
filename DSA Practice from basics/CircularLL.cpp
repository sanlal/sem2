#include <iostream>

using namespace std;

// Node structure for CLL
struct Node
{
    int data;
    Node *next;
};

// Class for Circular Linked List
class CLL
{
private:
    Node *head;

public:
    // Constructor to initialize an empty CLL
    CLL()
    {
        head = NULL;
    }

    // Function to insert a new element at the beginning of the CLL
    void insertBegin(int v)
    {
        Node *newNode = new Node;
        newNode->data = v;

        if (head == NULL)
        {
            head = newNode;
            head->next = head;
        }
        else
        {
            Node *temp = head;

            while (temp->next != head)
            {
                temp = temp->next;
            }

            temp->next = newNode;
            newNode->next = head;
            head = newNode;
        }
    }

    // Function to insert a new element after a node with value iv
    void insertAfterVal(int v, int iv)
    {
        Node *newNode = new Node;
        newNode->data = v;

        if (head == NULL)
        {
            cout << "List is empty\n";
        }
        else
        {
            Node *temp = head;

            do
            {
                if (temp->data == iv)
                {
                    newNode->next = temp->next;
                    temp->next = newNode;

                    if (temp == head && temp->next == head)
                    {
                        head = newNode;
                    }

                    return;
                }

                temp = temp->next;
            } while (temp != head);

            cout << "Node with value " << iv << " not found\n";
        }
    }

    // Function to delete a node with value dv
    void deleteVal(int dv)
    {
        if (head == NULL)
        {
            cout << "List is empty\n";
        }
        else
        {
            Node *temp = head;
            Node *prev = NULL;

            while (temp->data != dv)
            {
                if (temp->next == head)
                {
                    cout << "Node with value " << dv << " not found\n";
                    return;
                }

                prev = temp;
                temp = temp->next;
            }

            if (temp == head && temp->next == head)
            {
                head = NULL;
            }
            else if (temp == head)
            {
                prev = head;

                while (prev->next != head)
                {
                    prev = prev->next;
                }

                head = temp->next;
                prev->next = head;
            }
            else
            {
                prev->next = temp->next;
            }

            delete temp;
        }
    }

    // Function to display the elements of the CLL
    void display()
    {
        if (head == NULL)
        {
            cout << "List is empty\n";
        }
        else
        {
            Node *temp = head;

            do
            {
                cout << temp->data << " ";
                temp = temp->next;
            } while (temp != head);

            cout << endl;
        }
    }
};

// Driver code
int main()
{
    CLL cll;

    cll.insertBegin(5);
    cll.insertBegin(10);
    cll.insertBegin(15);
    cll.insertAfterVal(20, 10);
    cll.insertAfterVal(25, 30);
    cll.deleteVal(10);
    cll.deleteVal(30);
    cll.deleteVal(15);
    cll.display();

    return 0;
}

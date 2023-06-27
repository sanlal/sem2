#include <stdlib.h>
#include <iostream>
#include <conio.h>
using namespace std;
class node
{
public:
    int data;
    node *next;
};
class List
{
    int item;
    node *head;

public:
    List();
    void insert_front();
    void insert_end();
    void delete_front();
    void delete_end();
    void display();
    int node_count();
    void delete_before_pos();
    void delete_after_pos();
};
List::List()
{
    head = NULL;
}
// code to insert an item at front List;
void List::insert_front()
{
    node *p;
    cout << "Enter an element to be inserted:";
    cin >> item;
    p = new node;
    p->data = item;
    p->next = NULL;
    if (head == NULL)
    {
        head = p;
    }
    else
    {
        p->next = head;
        head = p;
    }
    cout << "\nInserted at front of Linked List Sucesfully....\n";
}
// code to insert an item at end List
void List::insert_end()
{
    node *p;
    cout << "Enter an element to be inserted:";
    cin >> item;
    p = new node;
    p->data = item;
    p->next = NULL;
    if (head == NULL)
    {
        head = p;
    }
    else
    {
        node *t;
        t = head;
        while (t->next != NULL)
            t = t->next;
        t->next = p;
    }
    cout << "\nInserted an element at end of Linked List Sucesfully....\n";
}
void List::delete_front()
{
    node *t;
    if (head == NULL)
        cout << "\nList is Underflow";
    else
    {
        item = head->data;
        t = head;
        head = head->next;
        cout << "\n"
             << item << " is deleted Sucesfully from List....\n";
        delete (t);
    }
}
void List::delete_end()
{
    node *t, *prev;
    if (head == NULL)
        cout << "\nList is Underflow";
    else
    {
        t = head;
        if (head->next == NULL)
        {
            cout << "\n"
                 << t->data << " is deleted Sucesfully from List....\n";
            delete (t);
            head = NULL;
        }
        else
        {
            while (t->next != NULL)
            {
                prev = t;
                t = t->next;
            }
            prev->next = NULL;
            cout << "\n"
                 << t->data << " is deleted Sucesfully from List....\n";
            delete (t);
        }
    }
}
// Delete a node before a position
void List::delete_before_pos()
{
    int i = 1;
    int pos;
    node *t, *prev;
    if (head == NULL)
        cout << "\nList is Underflow";
    else
    {
        cout << "Enter position at which node has to be deleted:";
        cin >> pos;
        t = head;
        int nc = node_count();
        if (pos > nc || pos <= 0)
            cout << "invalid position ...try again\n";
        else
        {
            cout << "Before Deletion elements in the List are..\n";
            display();
            while (i < pos)
            {
                prev = t;
                t = t->next;
                i++;
            }
            if (i == 1)
            {
                cout << "\n"
                     << t->data << " is deleted Sucesfully from List....\n";
                if (head->next == NULL)
                    head = NULL;
                else
                {
                    t = head;
                    head = head->next;
                    cout << "\n"
                         << t->data << "is deleted Sucesfully from List....\n";
                    delete (t);
                }
            }
            else
            {
                prev->next = t->next;
                cout << "\n"
                     << t->data << " is deleted Sucesfully from List....\n";
                delete (t);
            }
            cout << "After Deletion elements in the List are..\n";
            display();
        }
    }
}
// Delete a node after a position
void List::delete_after_pos()
{
    int i = 1;
    int pos;
    node *t, *prev;
    if (head == NULL)
        cout << "\nList is Underflow";
    else
    {
        cout << "Enter position at which node has to be deleted:";
        cin >> pos;
        t = head;
        int nc = node_count();
        if (pos > nc || pos <= 0)
            cout << "invalid position ...try again\n";
        else
        {
            cout << "Before Deletion elements in the List are..\n";
            display();
            while (i < pos)
            {
                prev = t;
                t = t->next;
                i++;
            }
            if (i == 1)
            {
                cout << "\n"
                     << t->data << " is deleted Sucesfully from List....\n";
                if (head->next == NULL)
                    head = NULL;
                else
                {
                    t = head;
                    head = head->next;
                    cout << "\n"
                         << t->data << " is deleted Sucesfully from List....\n";
                    delete (t);
                }
            }
            else
            {
                prev->next = t->next;
                cout << "\n"
                     << t->data << " is deleted Sucesfully from List....\n";
                delete (t);
            }
            cout << "After Deletion elements in the List are..\n";
            display();
        }
    }
}
void List::display()
{
    node *t;
    if (head == NULL)
        cout << "\nList Under Flow";
    else
    {
        cout << "\nElements in the List are....\n";
        t = head;
        while (t != NULL)
        {
            cout << "|" << t->data << "|->";
            t = t->next;
        }
    }
}
// code to count no of nodes
int List::node_count()
{
    int nc = 0;
    node *t;
    if (head == NULL)
    {
        cout << "\nList Under Flow" << endl;
        // cout<<"No Nodes in the Linked List are: "<<nc<<endl;
    }
    else
    {
        t = head;
        while (t != NULL)
        {
            nc++;
            t = t->next;
        }
        // cout<<"No Nodes in the Linked List are: "<<nc<<endl;
    }
    return nc;
}
int main()
{
    int choice;
    List LL;
    while (1)
    {
        cout << "\n\n***Menu for Linked List operations***\n\n";
        cout << "1.Insert Front\n2.Insert end\n3.Delete front\n4.Delete End\n5.DISPLAY\n";
        cout << "6.Node Count\n7.Del before a position\n8.Del after position\n";
        cout << "9.Clear Scrn\n10.Exit\nEnter Choice:";
        cin >> choice;
        switch (choice)
        {
        case 1:
            LL.insert_front();
            break;
        case 2:
            LL.insert_end();
            break;
        case 3:
            LL.delete_front();
            break;
        case 4:
            LL.delete_end();
            break;
        case 5:
            LL.display();
            break;
        case 6:
            cout << "No of nodes in List:" << LL.node_count();
            break;
        case 7:
            LL.delete_before_pos();
            break;
        case 8:
            LL.delete_after_pos();
            break;
        case 9:
            exit(0);
        default:
            cout << "Invalid choice...Try again...\n";
        }
    }
}
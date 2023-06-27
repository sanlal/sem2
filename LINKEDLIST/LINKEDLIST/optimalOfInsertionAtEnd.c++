#include <iostream>
using namespace std;

struct node
{
    int data;
    struct node *link;
};

struct node *insertAtEnd(struct node *ptr, int data)
{
    struct node *temp;
    temp = (struct node *)malloc(sizeof(struct node));
    temp->data = data;
    temp->link = NULL;

    ptr->link = temp;
    return temp;
    // while(ptr->link!=NULL){
    //     ptr=ptr->link; //traversing list O(n)
    // }
    // ptr->link=temp;
}

void displayData(struct node *head)
{
    struct node *ptr = NULL;
    ptr = head;
    if (head == NULL)
    {
        cout << "Empty \n";
    }
    while (ptr != NULL)
    {
        cout << ptr->data << "  ";
        ptr = ptr->link;
    }
}

void countNodes(struct node *head)
{
    struct node *ptr = NULL;
    ptr = head;
    if (head == NULL)
    {
        cout << "Empty \n";
    }
    int count = 0;
    while (ptr != NULL)
    {
        count++;
        ptr = ptr->link;
    }
    cout << count;
}

int main()
{
    struct node *head;
    head = (struct node *)malloc(sizeof(struct node));
    head->data = 100;
    head->link = NULL;

    struct node *ptr = head;
    ptr = insertAtEnd(ptr, 200);
    ptr = insertAtEnd(ptr, 300);
    ptr = insertAtEnd(ptr, 400);
    ptr = insertAtEnd(ptr, 500);

    //ptr = head;

    // struct node *current;
    // current=(struct node *)malloc(sizeof(struct node));
    // current->data=200;
    // current->link=NULL;
    // head->link=current;

    displayData(head);
    cout << endl;
    countNodes(head);
}
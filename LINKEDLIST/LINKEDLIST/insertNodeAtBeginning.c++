#include <iostream>
using namespace std;

struct node
{
    int data;
    struct node *link;
};

struct node *insertAtBegin(struct node *head, int data)
{
    struct node *ptr;
    ptr = (struct node *)malloc(sizeof(struct node));
    ptr->data = data;
    ptr->link = NULL;

    ptr->link = head;
    head = ptr;
    return head;
}

int main()
{
    struct node *head;
    head = (struct node *)malloc(sizeof(struct node));
    head->data = 100;
    head->link = NULL;

    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    ptr->data = 200;
    ptr->link = NULL;

    head->link = ptr;

    head = insertAtBegin(head, 300);
    head = insertAtBegin(head, 400);
    head = insertAtBegin(head, 500);
    head = insertAtBegin(head, 600);
    head = insertAtBegin(head, 700);
    ptr=head;

    while(ptr!=NULL){
        cout<< ptr->data <<"  ";
        ptr= ptr->link;
    }
}
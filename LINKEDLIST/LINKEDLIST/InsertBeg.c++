#include<iostream>
using namespace std;

struct node{
    int data;
    struct node *link;
};

void addAtBeg(struct node **head,int data){ //O(1)
    struct node *ptr=(struct node *)malloc(sizeof(struct node));
    ptr->data=data;
    ptr->link=NULL;

    ptr->link= *head;
    *head=ptr;
} 

int main(){
    struct node *head;
    head = (struct node *)malloc(sizeof(struct node));
    head->data = 100;
    head->link=NULL;

    struct node *ptr=(struct node *)malloc(sizeof(struct node));
    ptr->data=200;
    ptr->link=NULL;

    head->link=ptr;
    addAtBeg(&head,500);
    ptr=head;
    while(ptr!=NULL){
        cout<< ptr->data<< " ";
        ptr=ptr->link;
    }

    return 0;

}
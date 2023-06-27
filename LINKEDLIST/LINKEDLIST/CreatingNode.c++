#include<iostream>
using namespace std;

struct node{
    int data;
    struct node *link;
};

void insertAtEnd(struct node *head,int data){
    struct node *ptr, *temp;
    ptr=head;
    temp=(struct node *)malloc(sizeof(struct node));
    temp->data=data;
    temp->link=NULL;
    while(ptr->link!=NULL){
        ptr=ptr->link; //traversing list O(n)
    }
    ptr->link=temp;


}


void displayData(struct node *head){
    struct node *ptr=NULL;
    ptr=head;
    if(head==NULL){
        cout<<"Empty \n";
    }
    while(ptr!=NULL){
        cout<< ptr->data <<"  ";
        ptr= ptr->link;
    }
}

void countNodes(struct node *head){
    struct node *ptr=NULL;
    ptr=head;
    if(head==NULL){
        cout<<"Empty \n";
    }
    int count=0;
    while(ptr!=NULL){
        count++;
        ptr= ptr->link;
    }
    cout<<count;
}


int main(){
    struct node *head;
    head=(struct node *)malloc(sizeof(struct node));
    head->data=100;
    head->link=NULL;


    struct node *current;
    current=(struct node *)malloc(sizeof(struct node));
    current->data=200;
    current->link=NULL;
    head->link=current;

    insertAtEnd(head,300);


    displayData(head);
    cout<<endl;
    countNodes(head);
}
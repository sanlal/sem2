#include<iostream>
using namespace std;

struct node{
    int data;
    struct node *link;
};


void countNodes(struct node *head){
     if(head==NULL){ cout<<"Empty"<<endl;}
     struct node *ptr=NULL; 
     ptr=head;
     int count=0;
     while(ptr!=NULL){
        count++;
       ptr= ptr->link;
     }
     cout<<count<<endl;
}

void printValues(struct node *head){
    if(head==NULL){
        cout<<"Empty"<<endl;
    }
    struct node *ptr=NULL;
    ptr=head;
    while(ptr!=NULL){
        cout<< ptr->data <<"  ";
        ptr=ptr->link; 
    }
}


void insertFromEnd(struct node *head,int data){
    struct node *ptr,*temp;
    ptr=head;
    temp=(struct node *)malloc(sizeof(struct node));
    temp->data=data;
    temp->link=NULL;

    if(head==NULL){
        cout<<"Empyt"<<endl;
    }

    while(ptr->link!=NULL){
        ptr=ptr->link;
    }
    ptr->link=temp;
}

int main(){
    struct node *head;
    head=(struct node *)malloc(sizeof(struct node));
    head->data=111;
    head->link=NULL;

    struct node *current;
    current=(struct node *)malloc(sizeof(struct node));
    current->data=222;
    current->link=NULL;
    head->link=current;

    current=(struct node *)malloc(sizeof(struct node));
    current->data=333;
    current->link=NULL;
    head->link->link=current;

   
    insertFromEnd(head,456);
     countNodes(head);
    printValues(head);
}

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

node* insertFromEnd(struct node *ptr,int data){
    struct node *temp;
    temp=(struct node *)malloc(sizeof(struct node));
    temp->data=data;
    temp->link=NULL;
    ptr->link=temp;
    return temp;
}



int main(){
    struct node *head;
    head=(struct node *)malloc(sizeof(struct node));
    head->data=111;
    head->link=NULL;

    struct node *ptr=head;

   ptr= insertFromEnd(ptr,11);
   ptr= insertFromEnd(ptr,22);
   ptr= insertFromEnd(ptr,33);
   ptr= insertFromEnd(ptr,44);
   countNodes(head);
   printValues(head);
}




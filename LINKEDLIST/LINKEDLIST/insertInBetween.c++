#include<iostream>
using namespace std;

struct node{
    int data;
    struct node *link;
};

void add_At_end(struct node *head,int data){
    struct node *ptr,*temp=(struct node *)malloc(sizeof(struct node));
    ptr=head;
    temp->data=data;
    temp->link=NULL;
     while(ptr->link!=NULL){
        ptr=ptr->link;
    }
    ptr->link=temp;
}

void add_at_pos(struct node*head, int data, int pos){
    struct node* ptr =head;
    struct node* ptr2 =(struct node *)malloc(sizeof(struct node));
    ptr2->data=data;
    ptr2->link=NULL;

    pos--;
    while(pos!=1){
        ptr=ptr->link;
        pos--;
    }
    ptr2->link = ptr->link;
    ptr->link = ptr2;
}


struct node* delete_first(struct node *head){
    if(head==NULL){
        cout<<"Empty \n";
    }
    else{
    struct node *temp=head;
    head = head->link;
    free(temp);
    }
    return head;
}


void delete_last(struct node *head){
    if(head==NULL){cout<<"List is empty!";}
    else if(head->link==NULL){ free(head); head=NULL;}

    else{
    struct node *temp, *temp2;
    temp=temp2=head;
    while(temp->link != NULL){
        temp2=temp;
        temp= temp->link;
    }
    temp2->link=NULL;
    free(temp);
    temp=NULL;
    }
    // return head;
}

void lastDeletion(struct node *head){
    if(head==NULL){cout<<"List is empty!";}
    else if(head->link==NULL){ free(head); head=NULL;}

    else{
    struct node *temp;
    temp=head;
    while(temp->link->link != NULL){
        temp= temp->link; //then move rightwards
    }
    free(temp->link);
    temp->link=NULL;
    }
    // return head;
}

int main(){
    struct node* head=(struct node *)malloc(sizeof(struct node));
    head->data=100;
    head->link=NULL;

    add_At_end(head,98);
    add_At_end(head,50);
    add_At_end(head,18);
    add_At_end(head,400);

    int data = 67, position=4;

    add_at_pos(head,data,position);

    struct node *ptr=head;

    cout<<"Before Deletion: ";
    while(ptr!=NULL){
        cout<< ptr->data <<"  ";
        ptr=ptr->link;
    }
    cout<<"\n";
    head= delete_first(head);
     ptr=head;
      cout<<"After front Deletion : ";
    while(ptr!=NULL){
        cout<< ptr->data <<"  ";
        ptr=ptr->link;
    }
    cout<<endl;

     lastDeletion(head); // or delete_last(head)
     ptr=head;
      cout<<"After Back Deletion : ";
    while(ptr!=NULL){
        cout<< ptr->data <<"  ";
        ptr=ptr->link;
    } cout<<endl;
    return 0;
    
}
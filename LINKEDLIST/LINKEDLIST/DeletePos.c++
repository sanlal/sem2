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
void deleteAtPosition(struct node **head,int position){
    struct node *previous = *head,*current = *head;
    if(*head==NULL){
        cout<<"Empty list!";
    }
    else if(position==1){
        *head = current->link;
        free(current);
        current = NULL;
    }
    else{
        while(position!=1){
            previous = current;
            current = current->link;
            position--;
        }
        previous->link= current->link;
        free(current);
        current=NULL;
    }
    

}

int main(){
    struct node* head= (struct node *)malloc(sizeof(struct node));
    head->data=100;
    head->link=NULL;

    struct node* ptr= (struct node *)malloc(sizeof(struct node));
    ptr->data=130;
    ptr->link=NULL;
    head->link=ptr;

    add_At_end(head,200);
    add_At_end(head,300);
    add_At_end(head,400);
    add_At_end(head,500);
    add_At_end(head,600);

    int position = 3;
    deleteAtPosition(&head,position);
    ptr = head;
    while(ptr!=NULL){
        cout<< ptr->data <<"  ";
        ptr=ptr->link;
    }
    return 0;
    
}
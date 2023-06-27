#include<iostream>
using namespace std;

class Node{
  public:
    int data;
    Node* next;
};

class LinkedList{
  public:
   Node *head, *tail;
   LinkedList(){
   head=NULL;
   tail=NULL;
   }

   void insertNodeAtFront(int value){
    Node *newNode=new Node;
    newNode->data= value;
    newNode->next= NULL;
    if(head==NULL){
      head=newNode;
      tail=newNode;
    }
    else{
      newNode->next=head;
      head= newNode;
    }


   }

   void displayList(){
    Node* current= head;
    while(current!=NULL){
      cout<<current->data<<" ";
      current= current->next;
    }
   }
};

int main(){
  LinkedList list;
  list.insertNodeAtFront(40);
  list.insertNodeAtFront(30);
  list.insertNodeAtFront(20);
  list.insertNodeAtFront(10);
  list.displayList();
  return 0;

}
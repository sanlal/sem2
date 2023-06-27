#include<iostream>
using namespace std;

struct Node{
    int data;
    struct Node *left;
    struct Node *right;

    Node(int val){
        data=val;
        left=right=NULL;
    }
};



int main(){
    struct Node *root=new Node(1);
    root->left= new Node(2);
    root->right=new Node(3);
    root->left->right=new Node(5);


    /* PREORDER
     void preOrder(Node){
        if(Node==NULL){
            return ;
        }

        cout<<Node->data;
        preOrder<< Node->left;
        preOrder<<Node->right;
    }
    */


/* INORDER
     void inOrder(Node){
        if(Node==NULL){
            return ;
        }
        inOrder<< Node->left;
        cout<<Node->data;
        inOrder<<Node->right;
    }
*/


/*  POSTORDER
     void postOrder(Node){
        if(Node==NULL){
            return ;
        }
        postOrder<< Node->left;
        postOrder<<Node->right;
        cout<<Node->data;
        
    }
*/


}
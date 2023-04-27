//BST_Tree
#include<iostream>
#include <limits.h>
using namespace std;


struct node{
	int data;
	struct node* left;
	struct node* right;
};
node *root=NULL;

//Search
node* search(node* curNode,int sv){
	if(curNode==NULL)return NULL;
	
	if(curNode->data==sv ){
	    return curNode;
	}
	else if(curNode->data<sv )
	    return search(curNode->right,sv);
	else
	    return search(curNode->left,sv);
}

bool search(int sv){
	node* serNode=search(root,sv);//search function used 
	if(serNode==NULL)return false;
	if(serNode->data==sv) return true;
	return false;
}



//insert
node* insert(node* curNode ,int v){
	if(curNode==NULL){
		node* nn=new node();
		nn->data=v;
		nn->left=NULL;
		nn->right=NULL;
		return nn;
	}
	if(v<curNode->data)
		curNode->left=insert(curNode->left,v); //insert function used
	else if(v>curNode->data)
		curNode->right=insert(curNode->right,v);
	return curNode;
}

bool insert(int v){
	root=insert(root,v);   //insert function used
	//cout<<"se";
	return search(v);
}




//DELETE
node* deleteNode(node* curNode,int v){
	if(curNode==NULL)
	     return NULL;
	if(v<curNode->data) 
	     curNode->left=deleteNode(curNode->left,v); //recursion
	else if(v>curNode->data) 
	      curNode->right=deleteNode(curNode->right,v);//recursion
	else if(curNode->data==v){
		      if(curNode->left==NULL){
			       node* temp=curNode->right;
			       delete curNode;
			       return temp;
		}
		else if(curNode->right==NULL){
			node* temp=curNode->left;
			delete curNode;
			return temp;
		}
//		int succesorVal=minVal(curNode->right);
//		curNode->data=succesorVal;
//		curNode->right=deleteNode(curNode->right,succesorVal);
		//or
//		int predecesorVal=maxVal(curNode->left);
//		curNode->data=predecesorVal;
//		curNode->left=deleteNode(curNode->left,predecesorVal);
	} 
	return curNode;
}



//MAX and MIN

int maxVal(node* curNode){
	if(curNode==NULL) 
	     return -1;
	if(curNode->right==NULL)
	     return curNode->data;
	return maxVal(curNode->right);
}
int minVal(node* curNode){
	if(curNode==NULL) return -1;
	if(curNode->left==NULL) return curNode->data;
	return minVal(curNode->left);
}




//Traversals

//inOrder

void inorder(node* curNode){
	if(curNode!=NULL){
		inorder(curNode->left);
		cout<<curNode->data<<",";
		inorder(curNode->right);
	}
}

//preOrder
void preorder(node* curNode){
	if(curNode!=NULL){
		cout<<curNode->data<<",";
		preorder(curNode->left);
		preorder(curNode->right);
	}
}

//postOrder
void postOrder(node* curNode){
	if(curNode!=NULL){
		postOrder(curNode->left);
		postOrder(curNode->right);
		cout<<curNode->data<<",";
	}
}

int main(){
int op;
	int d;
	while(op<11){
		
	                int ascii=178;
	                char c =ascii;
	                for(int i=0;i<80;i++){
	            	cout<<c;
	                 }
	                 cout<<"\n";
	
	cout<<"choose a option:"<<endl;
	                for(int i=0;i<80;i++){
		            cout<<c;
	                }
	                cout<<"\n";
	                
    cout<<" 1.  insert\n 2.  search\n 3.  delete\n 4.  Know the inorder\n";
	cout<<" 5.  Know the preorder\n 6.  Know the post order\n 7.  Maximum value in the tree\n";
	cout<<" 8.  Minimum value in the tree\n 9.  sucessor of :\n 10. predesecor of :\n 11. EXIT\n";
	
                    for(int i=0;i<80;i++){
	            	cout<<c;
	                }
	                cout<<"\n";
   
            cin>>op;
	switch(op){
    	case 1:
    		cout<<"Enter a integer 1:"<<endl;
    		cin>>d;cout<<(insert(d)?"inserted":"cant insert")<<"\n";
			break;
    	case 2:
    		cout<<"Enter the key you want to search : "<<endl;
    		cin>>d;cout<<(search(d)?"found":"not  found")<<"\n";
			break;
    	case 3:cout<<"inorder traversal before deletion :"<<endl;
		       inorder(root);
    		cout<<"\n Enter the key you want to delete : ";
    		cin>>d;
			root=deleteNode(root,d);
			cout<<endl<<"inorder traversal after deletion: "<<endl;
			inorder(root);   
			cout<<"\n";                                                                                                                             
			break;
    	case 4:	inorder(root); cout<<endl;
		break;
    	
    	case 5:preorder(root); cout<<endl;
		break;
    	
    	case 6:postOrder(root); cout<<endl;
		break;
    	
    	case 7:cout<<maxVal(root)<<endl; cout<<endl;
		break;
    	
    	case 8:cout<<minVal(root)<<endl; cout<<endl;
		break;
	}
}
return 0;
}


































//Predecessor and Sucessor

int predecessor(int v){
	node* serNode=search(root,v);
	return maxVal(serNode->left);
}
int successor(int v){
	node* serNode=search(root,v);
	return minVal(serNode->right);
}

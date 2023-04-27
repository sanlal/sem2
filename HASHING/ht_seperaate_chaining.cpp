#include <iostream>
#define SIZE 5

using namespace std;

template <typename T>
class List{
	
	struct node {
		T data;
		node *next;
	};
	
	node *head;
	int c;

   public:
   	
	List(){
		head = NULL;
		c = 0;
	}
	
	bool isEmpty(){
		return head == NULL;
	}

	int size(){ return c; }

//Insert from Begin	
	bool insertBegin(T v){
		node *nn = new node();
		if(!nn) return false;
		c++;
		nn->data = v;
		nn->next = head;
		head = nn;
		
		return true;
	}

//Insert from End	
	bool insertEnd(T v){
		node *nn = new node();
		
		if(!nn) return false;
		
		c++;
		if(isEmpty()) return insertBegin(v);
		
		node *temp = head;
		nn->data = v;
		nn->next = NULL;
		while(temp->next) temp = temp->next;
		
		temp->next = nn;
		
		return true;
	}

//Delete from Begin	
	T deleteBegin(){
		c--;
		node *rn = head;
		head = head->next;
		
		T rv = rn->data;
		
		delete rn;
		
		return rv;
	}
	
//Delete from End 	
	T deleteEnd(){
		node *rn, *temp;
		T rv;
		
		c--;
		temp = head;
		
		while(temp->next->next) temp = temp->next;
		
		rn = temp->next;
		rv = rn->data;
		temp->next = NULL;
		delete rn;
		
		return rv;
	}
	
//print or display
	void display(){
		if(isEmpty()) {
			cout << " X\n";
			return;
		}
		
		node *temp = head;
		
		if(size() == 1){
			cout << temp->data << endl;
			return;
		}
		
		while(temp->next){
			cout << temp->data << "->";
			temp = temp->next;
		} 
		cout << temp->data << endl;
	}

//Searching	
	bool search(T ele){
		node *temp = head;
		while(temp){
			if(temp->data == ele) return true;
			temp = temp->next;
		}
		
		return false;
	}

//Delete by Value	
	bool deleteByValue(T ele){
		if(search(ele)){
			node *temp = head;
			node *prev = NULL;
			while(temp){
				if(temp->data == ele){
					if(temp == head) head = head->next;
					else{
						prev->next = temp->next;
						delete temp;
					}
					
					return true;
				}
				prev = temp;
				temp = temp->next;
			}
		}
		
		return false;
	}
};

int hash(int ele){
	return ele % SIZE;
}

//Hash Table
void showHashTable(List<int> HashTable[]){
	for(int i = 0; i < SIZE; i++){
		cout << "[" << i + 1 << "] -> ";
		HashTable[i].display();
	}
}

//Menu
void menu(){
		
	int ascii=177;
	char c =ascii;
	for(int i=0;i<80;i++){
		cout<<c;
	}
	cout<<"\n";
	
	cout << "               \t\t\t  MENU                 \n";
	
	for(int i=0;i<80;i++){
		cout<<c;
	}
	cout<<"\n";
	
	cout << "1. Insert a value\n";
	cout << "2. Search a value\n";
	cout << "3. Delete a value\n";
	cout << "4. Display HashTable\n";
	cout << "5. Exit\n";
	
	
	for(int i=0;i<80;i++){
	 cout<<c;
	}
	cout<<"\n";
}

//Insertion
void insert(List<int> HashTable[], int ele){
	int idx = hash(ele);
	HashTable[idx].insertEnd(ele);   //insert from End function used
}

//Searching
bool search(List<int> HashTable[], int ele){
	int idx = hash(ele);
	return HashTable[idx].search(ele);   //search function used
}

//Deletion
bool deleteVal(List<int> HashTable[], int ele){
	int idx = hash(ele);
	return HashTable[idx].deleteByValue(ele);	//Delete by value function used
}


//Main function
int main(){
	List<int> HashTable[SIZE];
	int ch;
	do{
		menu();
		cout << "Enter your choice: "; cin >> ch;
		
		switch(ch){
			case 1:
			{
				int ele;
				cout << "Enter element to be inserted: "; cin >> ele;
				insert(HashTable, ele);
				break;
			}
			case 2:
			{
				int ele;
				cout << "Enter an element to search for: "; cin >> ele;
				if(search(HashTable, ele)) cout << ele << " has been found" << endl;
				else cout << ele << " has not been found" << endl;
				break;
			}
			case 3:
			{
				int ele;
				cout << "Enter an element to search for: "; cin >> ele;
				if(deleteVal(HashTable, ele)) cout << ele << " has been deleted" << endl;
				else cout << ele << " non existent element" << endl;
				break;
			}
			case 4:
				showHashTable(HashTable);
				break;
			default:
				break;
		}
	}while(ch < 5);
	return 0;
}

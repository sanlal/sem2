struct node{
	int data;
	node *next;
};

node *headptr=NULL;

bool isEmpty()
{
	return (headptr==NULL);
}

int size(){
	int c=0;
	node *temp = headptr;
	
	do{
		c++;
		temp=temp->next;
	}	while(temp->next != NULL);
	return c;
}

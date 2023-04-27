#include<iostream>
#define CAPACITY 5
using namespace std;

int size(bool vis[],int cap)
{
	int c=0;
	for(int i=0;i<cap;i++)
	{
		if(vis[i]) c++;
	}
	return c;
}

bool insert(int a[],int val,bool vis[],int capacity)
{
	if(size(vis,capacity)==capacity) return 0;
	
	int i=val%capacity;
	if(!vis[i])
	{
			a[i]=val;
			vis[i]=1;
	}

	else
	{
		int temp=0;
			while(vis[i]!=0 && temp<=capacity)
		{
				i=(i+1)%capacity; temp++;
		}
		a[i]=val;
		vis[i]=1;
	}
return 1;
	
}

bool serach(int arr[],bool vis[],int cap,int val)
{
  int i=val%cap; int temp=0;
  if(arr[i]==val)
  return 1;
  else
  {
  	while(temp<=cap && (val!=arr[i]))
  	{
  		i=(i+1)%cap;temp++;
	  }
	  if(arr[i]==val) return 1;
	  else
	  return 0;
  }
	
}


bool deleted(int arr[],bool vis[],int cap,int val)
{
  int i=val%cap; int temp=0;
  if(arr[i]==val)
  {
  	 arr[i]=INT_MIN;
  	 vis[i]=0;
  	 return 1;
  }
 
  else
  {
  	while(temp<=cap && (val!=arr[i]))
  	{
  		i=(i+1)%cap;temp++;
	  }
	  if(arr[i]==val) 
	  {
	  	arr[i]=INT_MIN;
  	 	vis[i]=0;
	  	return 1;
	  }
	  else
	  return 0;
  }
	
}



void print(int arr[],int capacity,bool vis[])
{
		for(int i=0;i<capacity;i++)
					{
						if(vis[i])
						cout<<arr[i]<<" ";
						else
						cout<<INT_MIN<<" ";
					}
					cout<<endl;
}
int main()
{
	int a[CAPACITY];
	bool vis[CAPACITY];
	for(int i=0;i<CAPACITY;i++)
	{
		vis[i]=0;
	}
	
	int ch=0; int val;
	while(ch<5)
	{
		cout<<"Enter choice:"<<endl;
		cout<<"1.Insert 2.Search 3.Delete 4.print"<<endl;
		cin>>ch;
		switch(ch)
		{
			case 1:	cout<<"Enter value:"<<endl;
				   	cin>>val;
				   	if(insert(a,val,vis,CAPACITY)) cout<<"Inserted"<<endl;
				   	else cout<<"full"<<endl; break;
			
			case 2:	cout<<"Enter value to be searched:"<<endl;
					cin>>val; 
					if(serach(a,vis,CAPACITY,val))
					cout<<"Found"<<endl;
					else
					cout<<"Not Found"<<endl;	
					break;
			
			case 3: cout<<"Enter value to be deleted:"<<endl;
					cin>>val;
					if(size(vis,CAPACITY)==0)
					cout<<"List is Empty."<<endl;
					else
					{
					if(deleted(a,vis,CAPACITY,val))
					cout<<"deleted: "<<val<<endl;
					else
					cout<<"Not Found"<<endl;
					cout<<"array: "<<endl;
					print(a,CAPACITY,vis);
					}
					break;
			
			case 4: cout<<"array: "<<endl;
					print(a,CAPACITY,vis);
					break;
					
		}
	
	}

	
}

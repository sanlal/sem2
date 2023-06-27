//Sierpinski Triangle
#include<iostream>
#include<math.h>
using namespace std;

int main(){
	int n = 16;

	for (int Y=n-1; Y>=0; Y--) {
		for (int i=0; i<Y; i++) {
			cout<<" ";
		}
	  for (int X = 0; X + Y < n; X++) {
			if(X & Y)
			cout<<" "<<" ";
			else
			cout<<"^ ";
		}

		cout<<endl;
	}

	return 0;
}

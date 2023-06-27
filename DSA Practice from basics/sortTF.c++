#include<iostream>
using namespace std;

int main(){
  int array[]={1,2,10};
  int n=sizeof(array)/sizeof(array[0]);
  bool flag=0;
  for(int i=0;i<n;i++){
    if(array[i-1]>=array[i]){
      flag=1;
      break;
    }
  }

  if(flag==0)
  {
    cout<<"True";
  }
  else {
    cout<<"False";
  }

  return 0;
  
}
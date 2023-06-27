#include<iostream>
using namespace std;

int main(){
  int array[]={1,3,1,3,5,5,5};
  bool flag=0;
  int n=sizeof(array)/sizeof(array[0]);
  int count =0;
  for(int i=1;i<=n;i++){
    flag=0;
    for(int j=i-1;j>=0;j--){
      if(array[i]==array[j]){
      flag=1;
      break;
    }
    }
  
  if(flag==0){
    count++;
  }
  }
   cout<<count;
  return 0;

}
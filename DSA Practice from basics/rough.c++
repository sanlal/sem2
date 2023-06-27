#include<iostream>
using namespace std;
void fu(int &x){
  x=x+5;
}
int main(){
  int x=9;
  fu(x);
  //cout<<fu(x)<<endl;
  cout<<x;
}
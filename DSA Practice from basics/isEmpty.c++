#include <iostream>
#include <stack>
using namespace std;

int main()
{
  stack<string> st;

   if(st.empty())
  {
    cout <<"Yes \n";
  }
  else{
    cout<<"No";
  }

  st.push("C");
  st.push("C++");
  st.push("Java");
  st.push("Python");
  

if(st.empty())
  {
    cout <<"Yes \n";
  }
  else{
    cout<<"No";
  }

  return 0;
}


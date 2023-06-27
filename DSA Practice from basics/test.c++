#include <iostream>
#include <stack>
using namespace std;
void displayStack(stack<string> s);

int main()
{
  stack<string> st;

  st.push("C");
  st.push("C++");
  st.push("Java");
  st.push("Python");

 //displayStack(st);
 cout<<"Size of Stack : "<<st.size()<<"\n";
 string top = st.top();

 cout<<"top element: "<<top;

  return 0;
}

void displayStack(stack<string> s){
   while (!s.empty())
  {
    cout << s.top() << "\n";
    s.pop();
  }
}
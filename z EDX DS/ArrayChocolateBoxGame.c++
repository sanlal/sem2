#include <iostream>
using namespace std;
int main()
{
  int n, flag = 0;
  cout << "Enter the no. of boxes: ";
  cin >> n;

  if (n > 0 && n <= 10)
  {
    int a[n];
    for (int i = 0; i < n; i++)
    {
      cout << "\n Enter the no. of chocolates in box " << i++ << ": ";
      cin >> a[i];
      if (i == 0 && a[i] % 2 != 0)
      {
        cout << "\n Sorry!!! The first box always should contain positive even no. of chocolates.";
        return 0;
      }
      else
      {
        if (a[i] % 2 == 0)
        {
          flag++;
        }
      }
    }

    cout << "\n No. of chocolates in each box: ";
    for (int i = flag - 1; i < n; i++)
    {
      cout << a[i] << " ";
    }
  }
  else
  {
    cout << "\n Invalid input";
  }
  return 0;
}
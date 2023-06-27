/* a simple ARRAY implementation in C++ to store taxpayer
 information and calculate their income tax liability:

*/

#include <iostream>
using namespace std;

const int MAX_TAXPAYERS = 100;

struct Taxpayer {
    string name;
    int taxable_income;
    float tax_liability;
};

class TaxCalculator {
private:
    Taxpayer taxpayers[MAX_TAXPAYERS];
    int size;
    float tax_rate;

public:
    TaxCalculator() {
        size = 0;
        tax_rate = 0.15; // default tax rate
    }

    void insert(string name, int taxable_income) {
        taxpayers[size].name = name;
        taxpayers[size].taxable_income = taxable_income;
        taxpayers[size].tax_liability = taxable_income * tax_rate;
        size++;
    }

    void display() {
        for (int i = 0; i < size; i++) {
            cout << "Name: " << taxpayers[i].name << endl;
            cout << "Taxable Income: " << taxpayers[i].taxable_income << endl;
            cout << "Tax Liability: " << taxpayers[i].tax_liability << endl;
        }
    }
};

int main() {
    TaxCalculator tax_calculator;
    tax_calculator.insert("John Doe", 50000);
    tax_calculator.insert("Jane Doe", 60000);
    tax_calculator.display();
    return 0;
}

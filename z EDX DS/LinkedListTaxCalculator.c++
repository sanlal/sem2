/*  a simple linked list implementation in C++ to store
 taxpayer information and calculate their income tax liability:
*/

#include <iostream>
using namespace std;

struct Node {
    string name;
    int taxable_income;
    float tax_liability;
    Node *next;
};

class LinkedList {
private:
    Node *head;
    float tax_rate;

public:
    LinkedList() {
        head = NULL;
        tax_rate = 0.15; // default tax rate
    }

    void insert(string name, int taxable_income) {
        Node *newNode = new Node();
        newNode->name = name;
        newNode->taxable_income = taxable_income;
        newNode->tax_liability = taxable_income * tax_rate;
        newNode->next = head;
        head = newNode;
    }

    void display() {
        Node *temp = head;
        while (temp != NULL) {
            cout << "Name: " << temp->name << endl;
            cout << "Taxable Income: " << temp->taxable_income << endl;
            cout << "Tax Liability: " << temp->tax_liability << endl;
            temp = temp->next;
        }
    }
};

int main() {
    LinkedList taxpayers;
    taxpayers.insert("John Doe", 50000);
    taxpayers.insert("Jane Doe", 60000);
    taxpayers.display();
    return 0;
}

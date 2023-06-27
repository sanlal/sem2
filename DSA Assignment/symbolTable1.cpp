#include <iostream>
#include <cstring>

using namespace std;

// Define the size of the hash table
const int TABLE_SIZE = 100;

// Define the class to hold symbol information
class SymbolInfo
{
public:
    char *name;
    char *type;
    int scope;
    int line_number;

    SymbolInfo *next; // pointer to next symbol in case of collision

    // constructor to initialize symbol information
    SymbolInfo(char *n, char *t, int s, int l)
    {
        name = new char[strlen(n) + 1];
        strcpy(name, n);
        type = new char[strlen(t) + 1];
        strcpy(type, t);
        scope = s;
        line_number = l;
        next = nullptr;
    }

    // destructor to deallocate dynamically allocated memory
    ~SymbolInfo()
    {
        delete[] name;
        delete[] type;
    }
};

// Define the symbol table class
class SymbolTable
{
public:
    SymbolInfo **table; // hash table to store symbols

    // constructor to initialize the hash table
    SymbolTable()
    {
        table = new SymbolInfo *[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++)
        {
            table[i] = nullptr;
        }
    }

    // destructor to deallocate dynamically allocated memory
    ~SymbolTable()
    {
        for (int i = 0; i < TABLE_SIZE; i++)
        {
            SymbolInfo *curr = table[i];
            while (curr != nullptr)
            {
                SymbolInfo *temp = curr;
                curr = curr->next;
                delete temp;
            }
        }
        delete[] table;
    }

    // hash function to calculate index for given symbol name
    int hash(char *str)
    {
        int hash_val = 0;
        for (int i = 0; str[i]; i++)
        {
            hash_val = (hash_val * 31 + str[i]) % TABLE_SIZE;
        }
        return hash_val;
    }

    // function to insert a new symbol into the table
    void insert(char *name, char *type, int scope, int line_number)
    {
        int index = hash(name);

        // if no symbol with this name exists in the table, add a new symbol
        if (table[index] == nullptr)
        {
            table[index] = new SymbolInfo(name, type, scope, line_number);
        }
        else
        {
            // if a symbol with this name already exists, update its information
            SymbolInfo *curr = table[index];
            while (curr != nullptr && strcmp(curr->name, name) != 0)
            {
                curr = curr->next;
            }
            if (curr != nullptr)
            {
                curr->type = type;
                curr->scope = scope;
                curr->line_number = line_number;
            }
            // if no symbol with this name exists in the bucket, add a new symbol
            else
            {
                SymbolInfo *temp = new SymbolInfo(name, type, scope, line_number);
                temp->next = table[index];
                table[index] = temp;
            }
        }
    }

    // function to lookup a symbol in the table
    SymbolInfo *lookup(char *name)
    {
        int index = hash(name);
        SymbolInfo *curr = table[index];
        while (curr != nullptr && strcmp(curr->name, name) != 0)
        {
            curr = curr->next;
        }
        return curr;
    }
};

// main function to test the symbol table
int main()
{
    SymbolTable st;  // create an instance of SymbolTable
    char name[20];   // buffer to store user input for name
    char type[10];   // buffer to store user input for type
    int scope;       // variable to store user input for scope
    int line_number; // variable to store user input for line number
    // get input from user and insert into symbol table
    cout << "Enter name, type, scope, and line number (separated by space):" << endl;
    while (cin >> name >> type >> scope >> line_number)
    {
        st.insert(name, type, scope, line_number);
    }

    // get name input from user and lookup in symbol table
    cout << "Enter name to lookup (type \"exit\" to quit):" << endl;
    while (cin >> name)
    {
        if (strcmp(name, "exit") == 0)
        { // exit loop if user enters "exit"
            break;
        }
        SymbolInfo *si = st.lookup(name);
        if (si != nullptr)
        {
            // output information of the symbol
            cout << "Name: " << si->name << endl;
            cout << "Type: " << si->type << endl;
            cout << "Scope: " << si->scope << endl;
            cout << "Line Number: " << si->line_number << endl;
        }
        else
        {
            cout << "Symbol not found." << endl;
        }
        cout << "Enter name to lookup (type \"exit\" to quit):" << endl;
    }

    return 0;
}
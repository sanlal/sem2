#include <iostream>
#include <cstring>

using namespace std;

// Define the size of the hash table
const int TABLE_SIZE = 100;

// Define the class to hold symbol information
class SymbolInfo {
public:
    char* name;
    char* type;
    int scope;
    int line_number;
    SymbolInfo* next; // add next pointer for handling collisions

     // constructor to initialize symbol information
    SymbolInfo(char* n, char* t, int s, int l) {
        name = new char[strlen(n) + 1];
        strcpy(name, n);
        type = new char[strlen(t) + 1];
        strcpy(type, t);
        scope = s;
        line_number = l;
        next = nullptr; // initialize next pointer to nullptr
    }

   // destructor to deallocate dynamically allocated memory
    ~SymbolInfo() {
        delete[] name;
        delete[] type;
    }
};



// Define the symbol table class
class SymbolTable {
public:
    SymbolInfo** table; // hash table to store symbols

    // constructor to initialize the hash table
    SymbolTable() {
        table = new SymbolInfo*[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = nullptr;
        }
    }

    // destructor to deallocate dynamically allocated memory
    ~SymbolTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            if (table[i] != nullptr) {
                delete table[i];
            }
        }
        delete[] table;
    }

    // hash function to calculate index for given symbol name
    int hash(char* str) {
        int hash_val = 0;
        for (int i = 0; str[i]; i++) {
            hash_val = (hash_val * 31 + str[i]) % TABLE_SIZE;
        }
        return hash_val;
    }


     // function to insert a new symbol into the table
    void insert(char* name, char* type, int scope, int line_number) {
        int index = hash(name);

        // if no symbol with this name exists in the table, add a new symbol
        if (table[index] == nullptr) {
            table[index] = new SymbolInfo(name, type, scope, line_number);
        }
        else {

            SymbolInfo* curr = table[index];
            while (curr != nullptr && strcmp(curr->name, name) != 0) {
                curr = curr->next;
            }
            if (curr != nullptr) {
                delete curr;
            }
            table[index] = new SymbolInfo(name, type, scope, line_number);
            table[index]->next = curr->next;
        }
    }

    // function to lookup a symbol in the table
    SymbolInfo* lookup(char* name) {
        int index = hash(name);
        SymbolInfo* curr = table[index];
        while (curr != nullptr && strcmp(curr->name, name) != 0) {
            curr = curr->next;
        }
        return curr;
    }
};

int main() {
    SymbolTable st;
    st.insert("x", "int", 0, 1);
    st.insert("y", "float", 0, 2);
    SymbolInfo* si = st.lookup("x");
    if (si != nullptr) {
        cout << si->name << " " << si->type << " " << si->scope << " " << si->line_number << endl;
    }
    return 0;
}

#include <iostream>
#include <vector>
#include <string>
using namespace std;

class Student {
public:
    string name;
    string roll_number;
    Student(string n, string r) {
        name = n;
        roll_number = r;
    }
};

class HashTable {
private:
    vector<vector<Student>> data;
public:
    HashTable() {
        data.resize(11);
    }
    bool Insert(string name, string roll_number) {
        int index = stoi(roll_number.substr(roll_number.size() - 2)) % 11;
        for (auto &student : data[index]) {
            if (student.roll_number == roll_number) {
                return false;
            }
        }
        data[index].push_back(Student(name, roll_number));
        return true;
    }
    bool Delete(string roll_number) {
        int index = stoi(roll_number.substr(roll_number.size() - 2)) % 11;
        for (int i = 0; i < data[index].size(); i++) {
            if (data[index][i].roll_number == roll_number) {
                data[index].erase(data[index].begin() + i);
                return true;
            }
        }
        return false;
    }
    string Search(string roll_number) {
        int index = stoi(roll_number.substr(roll_number.size() - 2)) % 11;
        for (auto &student : data[index]) {
            if (student.roll_number == roll_number) {
                return student.name;
            }
        }
        return "Student not found";
    }
};

int main() {
    HashTable ht;
    ht.Insert("John Doe", "22MCF1R40");
    ht.Insert("Jane Smith", "22MCF1R01");
    ht.Insert("Mary Johnson", "22MCF1R65");
    ht.Insert("Bob Brown", "22MCF1R35");
    ht.Insert("Alice Lee", "22MCF1R19");
    cout << ht.Search("22MCF1R40") << endl;
    cout << ht.Search("22MCF1R42") << endl;
    cout << ht.Search("22MCF1R35") << endl;
    ht.Delete("22MCF1R40");
    cout << ht.Search("22MCF1R40") << endl;
    return 0;
}

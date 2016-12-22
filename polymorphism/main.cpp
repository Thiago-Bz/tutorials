#include <cstdio>
#include <iostream>
#include <string>

using namespace std;

class Person {
private:
  string name;
  int age;

public:
  Person() {
    this->name = "";
    this->age = 0;
  }

  Person(string name, int age) {
    this->name = name;
    this->age = age;
  }

  string getName() {
    return this->name;
  }

  int getAge() {
    return this->age;
  }

  virtual void walk() {
    cout << "Person is walking..." << endl;
  }
};

class Latin : public Person {
public:
  Latin() : Person() {}
  Latin(string name, int age) : Person(name, age) {

  }

  void walk() {
    cout << "Latin is walking..." << endl;
  }
};

int main () {
  Person *p = new Latin();

  cout << p->getName() << " " << p->getAge() << endl;

  p->walk();

  return 0;
}

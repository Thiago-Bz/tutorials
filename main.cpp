#include <iostream>
#include "pessoa.hpp"

using namespace std;


int main () {
	Pessoa p;
	
	
	cout << "Nome: " << p.getNome() << "idade: " << p.getIdade() << endl;
	
	return 0;
}

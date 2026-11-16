#include <iostream>
using namespace std;

int main() {
    int x = 10;
    int y = 20;

    // O operador & devolve o endereco de memoria da variavel (slide 4)
    cout << "Valor de x: " << x << " | endereco de x: " << &x << endl;
    cout << "Valor de y: " << y << " | endereco de y: " << &y << endl;

    return 0;
}

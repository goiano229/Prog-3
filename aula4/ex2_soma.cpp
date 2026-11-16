#include <iostream>
using namespace std;

// Funcao que recebe dois inteiros por valor e devolve a soma (slides 13-16)
int soma(int a, int b) {
    return a + b;
}

int main() {
    int x, y;

    cout << "Digite o primeiro valor inteiro: ";
    cin >> x;
    cout << "Digite o segundo valor inteiro: ";
    cin >> y;

    // O programa principal chama a funcao passando os valores digitados
    int resultado = soma(x, y);

    cout << "Soma = " << resultado << endl;

    return 0;
}

#include <iostream>
using namespace std;

const double COTACAO = 5.00; // 1 dolar = R$ 5,00 (ajuste conforme a cotacao)

// Funcao inline: em vez de um salto para a funcao, o corpo e inserido no
// local da chamada. Boa candidata por ser pequena (slides 20-21).
inline double dolarParaReal(double dolares) {
    return dolares * COTACAO;
}

int main() {
    double dolares;

    cout << "Digite a quantia em dolares: ";
    cin >> dolares;

    double reais = dolarParaReal(dolares);

    cout << "Equivale a R$ " << reais << endl;

    return 0;
}

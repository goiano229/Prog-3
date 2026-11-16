#include <iostream>
using namespace std;

// Estrutura que agrupa dia, mes e ano num unico tipo definido pelo usuario
// (ideia dos slides 4 e 7: agrupar campos logicamente relacionados)
struct Data {
    int dia;
    int mes;
    int ano;
};

int main() {
    Data hoje;  // variavel do novo tipo

    cout << "Digite o dia: ";
    cin >> hoje.dia;
    cout << "Digite o mes: ";
    cin >> hoje.mes;
    cout << "Digite o ano: ";
    cin >> hoje.ano;

    // Acesso aos membros com o operador ponto (slide 8)
    cout << "\nData informada: "
         << hoje.dia << "/" << hoje.mes << "/" << hoje.ano << endl;

    return 0;
}

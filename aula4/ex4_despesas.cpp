#include <iostream>
using namespace std;

// Dimensoes do array bidimensional definidas em tempo de compilacao (slide 28)
const int ANO = 2;
const int TRIMESTRE = 4;

int main() {
    double despesas[ANO][TRIMESTRE];

    // Laco aninhado para preencher as despesas de cada trimestre nos dois anos
    for (int a = 0; a < ANO; a++) {
        for (int t = 0; t < TRIMESTRE; t++) {
            cout << "Despesa do ano " << (a + 1)
                 << ", trimestre " << (t + 1) << ": ";
            cin >> despesas[a][t];
        }
    }

    double total = 0.0;

    cout << "\n--- Tabela de despesas (por trimestre) ---\n";
    for (int a = 0; a < ANO; a++) {
        cout << "Ano " << (a + 1) << ":\t";
        for (int t = 0; t < TRIMESTRE; t++) {
            cout << despesas[a][t] << "\t";
            total += despesas[a][t];
        }
        cout << endl;
    }

    cout << "\nTotal de despesas nos dois anos: " << total << endl;

    return 0;
}

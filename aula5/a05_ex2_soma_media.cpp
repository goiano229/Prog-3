#include <iostream>
using namespace std;

int main() {
    double a[100];      // array com capacidade para ate 100 valores
    double *aPtr = a;   // nome do array = ponteiro para o 1o elemento (slide 8/11)
    int n;

    cout << "Quantos valores deseja digitar (ate 100)? ";
    cin >> n;
    if (n < 0)   n = 0;
    if (n > 100) n = 100;

    // Leitura usando *(a + j) para armazenar em a[j]
    for (int j = 0; j < n; j++) {
        cout << "Valor " << (j + 1) << ": ";
        cin >> *(a + j);
    }

    // Acumulacao usando *(aPtr + j) para acessar a[j]
    double soma = 0.0;
    for (int j = 0; j < n; j++) {
        soma += *(aPtr + j);
    }

    double media = (n > 0) ? soma / n : 0.0;

    cout << "\nSoma:  " << soma << endl;
    cout << "Media: " << media << endl;

    return 0;
}

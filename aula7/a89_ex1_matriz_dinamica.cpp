#include <iostream>
using namespace std;

class MatrizDinamica {
private:
    int linhas;
    int colunas;
    int** dados;

    void alocar() {
        dados = new int*[linhas];
        for (int i = 0; i < linhas; i++)
            dados[i] = new int[colunas];
    }

public:
    // Construtor parametrizado: aloca a matriz no heap e zera
    MatrizDinamica(int l, int c) : linhas(l), colunas(c) {
        alocar();
        for (int i = 0; i < linhas; i++)
            for (int j = 0; j < colunas; j++)
                dados[i][j] = 0;
    }

    // Construtor de copia com COPIA PROFUNDA:
    // aloca area propria e copia os dados, garantindo independencia
    MatrizDinamica(const MatrizDinamica& outra)
        : linhas(outra.linhas), colunas(outra.colunas) {
        alocar();
        for (int i = 0; i < linhas; i++)
            for (int j = 0; j < colunas; j++)
                dados[i][j] = outra.dados[i][j];
    }

    // Destrutor: libera toda a memoria alocada, evitando vazamentos
    ~MatrizDinamica() {
        for (int i = 0; i < linhas; i++)
            delete[] dados[i];
        delete[] dados;
    }

    void set(int i, int j, int v) { dados[i][j] = v; }
    int  get(int i, int j) const  { return dados[i][j]; }

    void exibir() const {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++)
                cout << dados[i][j] << " ";
            cout << endl;
        }
    }
};

int main() {
    MatrizDinamica a(2, 3);
    a.set(0, 0, 5);
    a.set(1, 2, 9);

    MatrizDinamica b = a;   // copia profunda
    a.set(0, 0, 100);       // altera 'a'; 'b' permanece independente

    cout << "Matriz a:\n";                       a.exibir();
    cout << "Matriz b (copia independente):\n";  b.exibir();

    return 0;
}

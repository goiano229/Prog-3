#include <iostream>
using namespace std;

class Contador {
private:
    int valor;

public:
    Contador(int inicial = 0) : valor(inicial < 0 ? 0 : inicial) {}

    // Pre-fixado (++c): incrementa e retorna REFERENCIA ao proprio objeto.
    // Nao precisa criar copia, por isso e mais eficiente.
    Contador& operator++() {
        valor++;
        return *this;
    }

    // Pos-fixado (c++): o parametro int "dummy" distingue a assinatura.
    // Precisa guardar o estado antigo, incrementar, e retornar a
    // copia antiga POR VALOR (o resultado da expressao e o valor de antes).
    Contador operator++(int) {
        Contador antigo = *this;
        valor++;
        return antigo;
    }

    int getValor() const { return valor; }
};

int main() {
    Contador c(5);

    Contador pre = ++c;  // c vira 6; pre = 6
    cout << "Apos ++c:  c=" << c.getValor()
         << ", retornado=" << pre.getValor() << endl;

    Contador pos = c++;  // pos recebe 6 (valor antigo); c vira 7
    cout << "Apos c++:  c=" << c.getValor()
         << ", retornado=" << pos.getValor() << endl;

    return 0;
}

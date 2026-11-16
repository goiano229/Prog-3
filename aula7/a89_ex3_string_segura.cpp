#include <iostream>
#include <string>
#include <utility>
using namespace std;

class StringSegura {
private:
    string dados;

public:
    StringSegura(const string& texto = "") : dados(texto) {}

    // COPIA proibida com = delete
    StringSegura(const StringSegura&) = delete;
    StringSegura& operator=(const StringSegura&) = delete;

    // MOVIMENTO permitido com = default; e seguro porque std::string
    // ja implementa corretamente sua propria semantica de movimento
    StringSegura(StringSegura&&) = default;
    StringSegura& operator=(StringSegura&&) = default;

    void exibir() const { cout << "\"" << dados << "\"" << endl; }
};

int main() {
    StringSegura a("Ola mundo");
    a.exibir();

    StringSegura b = std::move(a); // construtor de movimento - OK
    b.exibir();

    StringSegura c;
    c = std::move(b);              // atribuicao por movimento - OK
    c.exibir();

    // StringSegura d = c; // ERRO de compilacao: construtor de copia deletado
    // c = a;              // ERRO de compilacao: atribuicao por copia deletada

    return 0;
}

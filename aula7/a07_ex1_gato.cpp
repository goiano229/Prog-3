#include <iostream>
#include <string>
using namespace std;

class Gato {
private:
    string nome;
    int idade;
    double peso;

public:
    // Lista de inicializacao; peso comeca em 0.0 e e validado pelo setter
    Gato(string n, int i, double p) : nome(n), idade(i), peso(0.0) {
        setPeso(p);
    }

    // Setter que impede peso menor ou igual a zero
    void setPeso(double p) {
        if (p <= 0) {
            cout << "Peso invalido (deve ser > 0). Valor ignorado.\n";
            return;
        }
        peso = p;
    }

    string getNome()  const { return nome; }
    int    getIdade() const { return idade; }
    double getPeso()  const { return peso; }
};

int main() {
    Gato g("Mimi", 3, 4.2);
    cout << g.getNome() << ", " << g.getIdade() << " anos, "
         << g.getPeso() << " kg\n";

    g.setPeso(-1);   // recusado
    g.setPeso(5.0);  // aceito
    cout << "Peso atual: " << g.getPeso() << " kg\n";

    return 0;
}

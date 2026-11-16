#include <iostream>
#include <list>
using namespace std;

void exibir(const list<int>& l) {
    cout << "Lista: ";
    for (int v : l) cout << v << " ";
    cout << "(tamanho: " << l.size() << ")" << endl;
}

int main() {
    list<int> lista;
    int opcao;

    do {
        cout << "\n1-Inserir no inicio  2-Inserir no final  "
                "3-Remover por valor  4-Tamanho  0-Sair\n";
        cout << "Opcao: ";
        cin >> opcao;

        int valor;
        switch (opcao) {
            case 1:
                cout << "Valor: "; cin >> valor;
                lista.push_front(valor);   // insere no inicio
                exibir(lista);
                break;
            case 2:
                cout << "Valor: "; cin >> valor;
                lista.push_back(valor);    // insere no final
                exibir(lista);
                break;
            case 3:
                cout << "Valor a remover: "; cin >> valor;
                lista.remove(valor);       // remove todos com esse valor
                exibir(lista);
                break;
            case 4:
                cout << "Tamanho: " << lista.size() << endl;
                break;
            case 0:
                cout << "Saindo...\n";
                break;
            default:
                cout << "Opcao invalida.\n";
        }
    } while (opcao != 0);

    return 0;
}

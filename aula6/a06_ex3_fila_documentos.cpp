#include <iostream>
#include <queue>
#include <string>
using namespace std;

int main() {
    queue<string> fila; // FIFO: primeiro a entrar e o primeiro a sair
    int opcao;

    do {
        cout << "\n1-Adicionar documento  2-Processar proximo  "
                "3-Ver proximo  4-Quantidade  0-Sair\n";
        cout << "Opcao: ";
        cin >> opcao;

        string doc;
        switch (opcao) {
            case 1:
                cout << "Nome do documento: ";
                cin >> doc;
                fila.push(doc);            // entra no fim da fila
                cout << "\"" << doc << "\" adicionado.\n";
                break;
            case 2:
                if (fila.empty()) cout << "Fila vazia.\n";
                else {
                    cout << "Processando: " << fila.front() << endl;
                    fila.pop();            // sai o primeiro que entrou
                }
                break;
            case 3:
                if (fila.empty()) cout << "Fila vazia.\n";
                else cout << "Proximo: " << fila.front() << endl;
                break;
            case 4:
                cout << "Documentos na fila: " << fila.size() << endl;
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

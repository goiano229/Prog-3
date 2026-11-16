#include <iostream>
#include <stack>
#include <string>
using namespace std;

int main() {
    stack<string> editor; // LIFO: a ultima palavra digitada e a primeira a sair
    string palavra;

    cout << "Digite palavras (uma por vez). Digite 'fim' para parar:\n";
    while (cin >> palavra && palavra != "fim") {
        editor.push(palavra);                 // empilha cada palavra
        cout << "  [empilhada] " << palavra << endl;
    }

    // Desfazer (undo) remove sempre a palavra mais recente primeiro
    cout << "\nDesfazendo (ordem inversa da digitacao):\n";
    while (!editor.empty()) {
        cout << "  desfazer -> " << editor.top() << endl;
        editor.pop();
    }

    return 0;
}

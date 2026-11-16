#include <iostream>
#include <memory>
using namespace std;

int main() {
    // Antes:  int *ptr = new int(42);  ...  delete ptr;
    // Com unique_ptr a liberacao da memoria e automatica ao sair de escopo (slide 4).
    unique_ptr<int> ptr = make_unique<int>(42);

    cout << *ptr << endl; // 42

    return 0; // ptr e destruido automaticamente aqui, sem delete
}

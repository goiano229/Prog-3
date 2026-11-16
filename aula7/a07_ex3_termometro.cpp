#include <iostream>
using namespace std;

class Termometro {
private:
    double temperaturaCelsius;

public:
    Termometro() : temperaturaCelsius(25.0) {}

    // Bloqueia valores abaixo do zero absoluto (-273.15 C)
    void setTemperaturaCelsius(double t) {
        if (t < -273.15) {
            cout << "Temperatura abaixo do zero absoluto. Ignorada.\n";
            return;
        }
        temperaturaCelsius = t;
    }

    double getTemperaturaCelsius() const {
        return temperaturaCelsius;
    }

    // Converte na hora, sem armazenar um novo atributo
    double getTemperaturaFahrenheit() const {
        return temperaturaCelsius * 9.0 / 5.0 + 32.0;
    }
};

int main() {
    Termometro t;
    cout << t.getTemperaturaCelsius() << " C = "
         << t.getTemperaturaFahrenheit() << " F\n";

    t.setTemperaturaCelsius(-300); // recusado
    t.setTemperaturaCelsius(100);  // aceito
    cout << t.getTemperaturaCelsius() << " C = "
         << t.getTemperaturaFahrenheit() << " F\n";
    return 0;
}

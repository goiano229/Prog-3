public class TestaAnimais {
    public static void main(String[] args) {
        Animal[] animais = new Animal[2];
        animais[0] = new Cachorro();
        animais[1] = new Gato();

        for (int i = 0; i < animais.length; i++) {
            animais[i].emitirSom();
        }
    }
}

class Animal {
    void emitirSom() {
        System.out.println("Som genérico de animal.");
    }
}

class Cachorro extends Animal {
    @Override
    void emitirSom() {
        System.out.println("O cachorro late: Au au!");
    }
}

class Gato extends Animal {
    @Override
    void emitirSom() {
        System.out.println("O gato mia: Miau!");
    }
}

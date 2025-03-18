package org.pilares.polimorfismo.dinamico;

public class Main {

    public static void main(String[] args) {
      Animal miAnimal1 = new Perro();
      Animal miAnimal2 = new Gato();

      miAnimal1.hacerSonido();  // Llamará al método en la clase Perro
      miAnimal2.hacerSonido();  // Llamará al método en la clase Gato

      /*
      Conclusión: Aunque estamos usando la misma referencia (Animal),
      cada objeto ejecuta su propia versión del método hacerSonido()
       */
    }
}

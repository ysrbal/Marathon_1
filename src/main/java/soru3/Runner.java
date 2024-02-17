package soru3;

import soru3.entity.Animal;
import soru3.entity.Felis;
import soru3.entity.TerrestrialAnimals;

public class Runner {
    public static void main(String[] args) {
        //Polimorphism ile ata s�n�ftan bir child s�n�f nesnesi olu�turduk. Olu�turulan nesne ata s�n�f�n �zelliklerini inheritance ile almaktad�r.
        Animal lion = new Felis("Aslan","Wild");
        lion.move();
        lion.makeNoise();

    }
}

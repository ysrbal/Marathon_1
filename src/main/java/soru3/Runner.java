package soru3;

import soru3.entity.Animal;
import soru3.entity.Felis;
import soru3.entity.TerrestrialAnimals;

public class Runner {
    public static void main(String[] args) {
        //Polimorphism ile ata sýnýftan bir child sýnýf nesnesi oluþturduk. Oluþturulan nesne ata sýnýfýn özelliklerini inheritance ile almaktadýr.
        Animal lion = new Felis("Aslan","Wild");
        lion.move();
        lion.makeNoise();

    }
}

package soru3.entity;

import java.util.UUID;

// Animal s�n�f�na IAnimal interface'i implement ettik.
public class Animal implements IAnimal {
    //Access Modifier olarak private se�tik ve encapsulation haricinde d��ar�dan bilgilere eri�imi engelledik.
    private String id;
    private String name;
    private String type;

    //Parametreli ve parametresiz constructorlar olu�turduk.
    private Animal() {
        this.id = UUID.randomUUID().toString();
    }

    public Animal(String name, String type) {
        this(); // this keyword� ile default constructor parametreli constructor i�inde �a�r�ld�. Bu sayede her yeni nesne �retiminde id olu�turulacak.
        this.name = name;
        this.type = type;
    }

    //S�n�f�n �zelliklerini encapsulation ile evrilere gerekli eri�imi sa�lad�k.
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Interface i�inde bulunan metotlar override edilerek s�n�f i�inde olu�turuldu.
    @Override
    public void move() {
        System.out.println(getName() + " hareket ediyor.");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " ses ��kar�yor.");
    }

    //Static bir metot olu�turuldu.
    public static void born() {
        System.out.println("Hayvan do�du.");
    }
}

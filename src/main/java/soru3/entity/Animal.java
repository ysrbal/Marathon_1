package soru3.entity;

import java.util.UUID;

// Animal sýnýfýna IAnimal interface'i implement ettik.
public class Animal implements IAnimal {
    //Access Modifier olarak private seçtik ve encapsulation haricinde dýþarýdan bilgilere eriþimi engelledik.
    private String id;
    private String name;
    private String type;

    //Parametreli ve parametresiz constructorlar oluþturduk.
    private Animal() {
        this.id = UUID.randomUUID().toString();
    }

    public Animal(String name, String type) {
        this(); // this keywordü ile default constructor parametreli constructor içinde çaðrýldý. Bu sayede her yeni nesne üretiminde id oluþturulacak.
        this.name = name;
        this.type = type;
    }

    //Sýnýfýn özelliklerini encapsulation ile evrilere gerekli eriþimi saðladýk.
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

    //Interface içinde bulunan metotlar override edilerek sýnýf içinde oluþturuldu.
    @Override
    public void move() {
        System.out.println(getName() + " hareket ediyor.");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " ses çýkarýyor.");
    }

    //Static bir metot oluþturuldu.
    public static void born() {
        System.out.println("Hayvan doðdu.");
    }
}

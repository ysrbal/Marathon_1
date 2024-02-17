package soru3.entity;

//Kedigiller sýnýfý final olarak oluþturldu ve baþka alt sýnýflara miras vermeyecek.
public final class Felis extends TerrestrialAnimals {
    private static int footNumber = 4; //
    public Felis(String name, String type) {
        super(name, type);
    }
}

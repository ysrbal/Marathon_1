package soru3.entity;

//Kedigiller s�n�f� final olarak olu�turldu ve ba�ka alt s�n�flara miras vermeyecek.
public final class Felis extends TerrestrialAnimals {
    private static int footNumber = 4; //
    public Felis(String name, String type) {
        super(name, type);
    }
}

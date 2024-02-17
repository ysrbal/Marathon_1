package soru2;

public class CustomStringTr {
    private String ifade;

    public CustomStringTr(String expression) {
        this.ifade = expression;
    }

    /**
     * Metot, String ifadenin uzunlu�unu bulmay� sa�lar.
     * @return int
     */
    public int uzunluk() {
        return ifade.length();
    }

    /**
     * Metot, String ifade i�erisinde istenilen indexteki karakteri bulmau� sa�lar.
     * @param index --> �ndex say�s�n� ifade eder.
     * @return char
     */
    public char karakterBul(int index) {
        return ifade.charAt(index);
    }

    /**
     * Metot, String ifadenin b�t�n karakterlerinin k���k harf olmas� sa�lan�r.
     * @return String
     */
    public String hepsiKucukHarf() {
        return ifade.toLowerCase();
    }

    /**
     * Metot, String ifadenin b�t�n karakterlerinin b�y�k harf olmas� sa�lan�r.
     * @return String
     */
    public String hepsiBuyukHarf() {
        return ifade.toUpperCase();
    }

    /**
     * Metot, ifade i�erisinde istenilen i�eri�in olup olmad���n� bulmay� sa�lar.
     * @param icerik --> �fadenin i�erisinde aranacak ifade
     * @return boolean
     */
    public boolean iceriyorMu(String icerik) {
        return ifade.contains(icerik);
    }

    /**
     * Metot, ifade i�erisinde ba�lang�� ve biti� indeksi aras�ndaki i�eri�i d�ner.
     *
     * @param index  -> ba�lang�� indeksini ifade eder.
     * @param index2 -> biti� indeksini ifade eder.
     * @return String
     */
    public String altMetin(int index, int index2) {
        return ifade.substring(index, index2);
    }

    /**
     * Metot, bir de�eri ba�ka bir de�erle de�i�tirmeyi sa�lar.
     * @param s1 --> De�i�ecek de�eri ifade eder.
     * @param s2 --> Yeni gelecek de�eri ifade eder.
     * @return String
     */
    public String degistir(String s1, String s2) {
        return ifade.replace(s1, s2);
    }

    /**
     * Metot, verilen de�erin ka��nc� indekste oldu�unu bulmay� sa�lar.
     * @param s1 --> Indexi bulunacak de�eri ifade eder.
     * @return int
     */
    public int kacinciIndex(String s1) {
        return ifade.indexOf(s1);
    }

    /**
     * Metot, ifade i�eri�inin bo� olup olmad���n� bulmay� sa�lar.
     * @return boolean
     */
    public boolean bosMu() {
        return ifade.isEmpty();
    }

    /**
     * Metot, ifadenin i�erisinde bo�luk olup olmad���n� bulmay� sa�lar.
     * @return boolean
     */
    public boolean boslukVarMi() {
        return ifade.isBlank();
    }

}

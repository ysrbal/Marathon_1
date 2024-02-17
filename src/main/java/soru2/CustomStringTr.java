package soru2;

public class CustomStringTr {
    private String ifade;

    public CustomStringTr(String expression) {
        this.ifade = expression;
    }

    /**
     * Metot, String ifadenin uzunluðunu bulmayý saðlar.
     * @return int
     */
    public int uzunluk() {
        return ifade.length();
    }

    /**
     * Metot, String ifade içerisinde istenilen indexteki karakteri bulmauý saðlar.
     * @param index --> Ýndex sayýsýný ifade eder.
     * @return char
     */
    public char karakterBul(int index) {
        return ifade.charAt(index);
    }

    /**
     * Metot, String ifadenin bütün karakterlerinin küçük harf olmasý saðlanýr.
     * @return String
     */
    public String hepsiKucukHarf() {
        return ifade.toLowerCase();
    }

    /**
     * Metot, String ifadenin bütün karakterlerinin büyük harf olmasý saðlanýr.
     * @return String
     */
    public String hepsiBuyukHarf() {
        return ifade.toUpperCase();
    }

    /**
     * Metot, ifade içerisinde istenilen içeriðin olup olmadýðýný bulmayý saðlar.
     * @param icerik --> Ýfadenin içerisinde aranacak ifade
     * @return boolean
     */
    public boolean iceriyorMu(String icerik) {
        return ifade.contains(icerik);
    }

    /**
     * Metot, ifade içerisinde baþlangýç ve bitiþ indeksi arasýndaki içeriði döner.
     *
     * @param index  -> baþlangýç indeksini ifade eder.
     * @param index2 -> bitiþ indeksini ifade eder.
     * @return String
     */
    public String altMetin(int index, int index2) {
        return ifade.substring(index, index2);
    }

    /**
     * Metot, bir deðeri baþka bir deðerle deðiþtirmeyi saðlar.
     * @param s1 --> Deðiþecek deðeri ifade eder.
     * @param s2 --> Yeni gelecek deðeri ifade eder.
     * @return String
     */
    public String degistir(String s1, String s2) {
        return ifade.replace(s1, s2);
    }

    /**
     * Metot, verilen deðerin kaçýncý indekste olduðunu bulmayý saðlar.
     * @param s1 --> Indexi bulunacak deðeri ifade eder.
     * @return int
     */
    public int kacinciIndex(String s1) {
        return ifade.indexOf(s1);
    }

    /**
     * Metot, ifade içeriðinin boþ olup olmadýðýný bulmayý saðlar.
     * @return boolean
     */
    public boolean bosMu() {
        return ifade.isEmpty();
    }

    /**
     * Metot, ifadenin içerisinde boþluk olup olmadýðýný bulmayý saðlar.
     * @return boolean
     */
    public boolean boslukVarMi() {
        return ifade.isBlank();
    }

}

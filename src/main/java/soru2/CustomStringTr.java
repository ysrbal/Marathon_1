package soru2;

public class CustomStringTr {
    private String ifade;

    public CustomStringTr(String expression) {
        this.ifade = expression;
    }

    /**
     * <p>String ifade uzunlu�unu bulma</p>
     * Metot, String ifadenin uzunlu�unu bulmay� sa�lar.
     * @return ifadenin uzunlu�unu d�ner.
     */
    public int uzunluk() {
        return ifade.length();
    }

    /**
     * <p>Indexi verilen karakteri bulma</p>
     * Metot, String ifade i�erisinde istenilen indexteki karakteri bulmau� sa�lar.
     * @param index --> �ndex say�s�n� ifade eder.
     * @return Indexin kar��l��� olan karakter d�ner.
     */
    public char karakterBul(int index) {
        return ifade.charAt(index);
    }

    /**
     * <p>Hepsini K���k Harf Yapma</p>
     * Metot, String ifadenin b�t�n karakterlerinin k���k harf olmas� sa�lan�r.
     * @return b�t�n karakterlerin k���k harfe d�n��m�� halini d�ner.
     */
    public String hepsiKucukHarf() {
        return ifade.toLowerCase();
    }

    /**
     * <p>Hepsini B�y�k Harf Yapma</p>
     * Metot, String ifadenin b�t�n karakterlerinin b�y�k harf olmas� sa�lan�r.
     * @return b�t�n karakterlerin b�y�k harfe d�n��m�� halini d�ner.
     */
    public String hepsiBuyukHarf() {
        return ifade.toUpperCase();
    }

    /**
     * <p>Girilen de�erin ifade i�inde Olup Olmad���n� Bulma</p>
     * Metot, ifade i�erisinde istenilen i�eri�in olup olmad���n� bulmay� sa�lar.
     * @param icerik --> �fadenin i�erisinde aranacak ifade
     * @return i�erik ifade i�inde varsa true, yoksa false d�ner.
     */
    public boolean iceriyorMu(String icerik) {
        return ifade.contains(icerik);
    }

    /**
     * <p>Verilen indexler Aras� Alt Metni Olu�turma</p>
     * Metot, ifade i�erisinde ba�lang�� ve biti� indeksi aras�ndaki i�eri�i d�ner.
     *
     * @param index  -> ba�lang�� indeksini ifade eder.
     * @param index2 -> biti� indeksini ifade eder.
     * @return index dahil, index2'ye kadar olan k�sm� d�ner.
     */
    public String altMetin(int index, int index2) {
        return ifade.substring(index, index2);
    }

    /**
     * <p>�fadeleri De�i�tirme</p>
     * Metot, bir de�eri ba�ka bir de�erle de�i�tirmeyi sa�lar.
     * @param s1 --> De�i�ecek de�eri ifade eder.
     * @param s2 --> Yeni gelecek de�eri ifade eder.
     * @return s1 de�erini, s2 de�eri ile de�i�tirerek b�t�n ifadeyi d�ner.
     */
    public String degistir(String s1, String s2) {
        return ifade.replace(s1, s2);
    }

    /**
     *<p>Girilen de�erin ilk indeksini bulma</p>
     * Metot, verilen de�erin ka��nc� indekste oldu�unu bulmay� sa�lar.
     * @param s1 --> Indexi bulunacak de�eri ifade eder.
     * @return Girilen de�er i�in ilk indeksi sonu� olarak d�ner.
     */
    public int kacinciIndex(String s1) {
        return ifade.indexOf(s1);
    }

    /**
     * <p>�fadenin Bo� Olup Olmad���n� Bulma</p>
     * Metot, ifade i�eri�inin bo� olup olmad���n� bulmay� sa�lar.
     * @return ifade bo� ise true, dolu ise false d�ner.
     */
    public boolean bosMu() {
        return ifade.isEmpty();
    }

    /**
     * <p>�fade ��inde Bo�luk Olup Olmad���n� Bulma</p>
     * Metot, ifadenin i�erisinde bo�luk olup olmad���n� bulmay� sa�lar.
     * @return ifade i�inde bo�luk varsa true, yoksa false d�ner.
     */
    public boolean boslukVarMi() {
        return ifade.isBlank();
    }

}

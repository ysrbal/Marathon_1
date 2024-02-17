package soru2;

public class CustomStringTr {
    private String ifade;

    public CustomStringTr(String expression) {
        this.ifade = expression;
    }

    /**
     * <p>String ifade uzunluðunu bulma</p>
     * Metot, String ifadenin uzunluðunu bulmayý saðlar.
     * @return ifadenin uzunluðunu döner.
     */
    public int uzunluk() {
        return ifade.length();
    }

    /**
     * <p>Indexi verilen karakteri bulma</p>
     * Metot, String ifade içerisinde istenilen indexteki karakteri bulmauý saðlar.
     * @param index --> Ýndex sayýsýný ifade eder.
     * @return Indexin karþýlýðý olan karakter döner.
     */
    public char karakterBul(int index) {
        return ifade.charAt(index);
    }

    /**
     * <p>Hepsini Küçük Harf Yapma</p>
     * Metot, String ifadenin bütün karakterlerinin küçük harf olmasý saðlanýr.
     * @return bütün karakterlerin küçük harfe dönüþmüþ halini döner.
     */
    public String hepsiKucukHarf() {
        return ifade.toLowerCase();
    }

    /**
     * <p>Hepsini Büyük Harf Yapma</p>
     * Metot, String ifadenin bütün karakterlerinin büyük harf olmasý saðlanýr.
     * @return bütün karakterlerin büyük harfe dönüþmüþ halini döner.
     */
    public String hepsiBuyukHarf() {
        return ifade.toUpperCase();
    }

    /**
     * <p>Girilen deðerin ifade içinde Olup Olmadýðýný Bulma</p>
     * Metot, ifade içerisinde istenilen içeriðin olup olmadýðýný bulmayý saðlar.
     * @param icerik --> Ýfadenin içerisinde aranacak ifade
     * @return içerik ifade içinde varsa true, yoksa false döner.
     */
    public boolean iceriyorMu(String icerik) {
        return ifade.contains(icerik);
    }

    /**
     * <p>Verilen indexler Arasý Alt Metni Oluþturma</p>
     * Metot, ifade içerisinde baþlangýç ve bitiþ indeksi arasýndaki içeriði döner.
     *
     * @param index  -> baþlangýç indeksini ifade eder.
     * @param index2 -> bitiþ indeksini ifade eder.
     * @return index dahil, index2'ye kadar olan kýsmý döner.
     */
    public String altMetin(int index, int index2) {
        return ifade.substring(index, index2);
    }

    /**
     * <p>Ýfadeleri Deðiþtirme</p>
     * Metot, bir deðeri baþka bir deðerle deðiþtirmeyi saðlar.
     * @param s1 --> Deðiþecek deðeri ifade eder.
     * @param s2 --> Yeni gelecek deðeri ifade eder.
     * @return s1 deðerini, s2 deðeri ile deðiþtirerek bütün ifadeyi döner.
     */
    public String degistir(String s1, String s2) {
        return ifade.replace(s1, s2);
    }

    /**
     *<p>Girilen deðerin ilk indeksini bulma</p>
     * Metot, verilen deðerin kaçýncý indekste olduðunu bulmayý saðlar.
     * @param s1 --> Indexi bulunacak deðeri ifade eder.
     * @return Girilen deðer için ilk indeksi sonuç olarak döner.
     */
    public int kacinciIndex(String s1) {
        return ifade.indexOf(s1);
    }

    /**
     * <p>Ýfadenin Boþ Olup Olmadýðýný Bulma</p>
     * Metot, ifade içeriðinin boþ olup olmadýðýný bulmayý saðlar.
     * @return ifade boþ ise true, dolu ise false döner.
     */
    public boolean bosMu() {
        return ifade.isEmpty();
    }

    /**
     * <p>Ýfade Ýçinde Boþluk Olup Olmadýðýný Bulma</p>
     * Metot, ifadenin içerisinde boþluk olup olmadýðýný bulmayý saðlar.
     * @return ifade içinde boþluk varsa true, yoksa false döner.
     */
    public boolean boslukVarMi() {
        return ifade.isBlank();
    }

}

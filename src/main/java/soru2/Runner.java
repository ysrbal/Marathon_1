package soru2;

public class Runner {
    public static void main(String[] args) {
        CustomStringTr ifade = new CustomStringTr("muvaffakiyetsizleþtiricileþtiriveremeyebileceklerimizdenmiþsinizcesine");
        System.out.println("Ýfadenin uzunluðu .................... : " + ifade.uzunluk());
        System.out.println("Ýfadenin 6. karakteri ................ : " + ifade.karakterBul(6));
        System.out.println("Ýfadenin hepsi küçük harf ............ : " + ifade.hepsiKucukHarf());
        System.out.println("Ýfadenin hepsi büyük harf ............ : " + ifade.hepsiBuyukHarf());
        System.out.println("Ýfade içerisinde içeriyor mu? ........ : " + ifade.iceriyorMu("tirici"));
        System.out.println("Ýfadenin 9 ve 16. indexleri arasý .... : " + ifade.altMetin(9, 16));
        System.out.println("Ýfadede f yerine a gelecek ........... : " + ifade.degistir("f", "a"));
        System.out.println("Ýfade içerisinde ilk kaçýncý indexte ? : " + ifade.kacinciIndex("c"));
        System.out.println("Ýfade tamamen boþ mu ? ............... : " + ifade.bosMu());
        System.out.println("Ýfadede boþluk var mý? ............... : " + ifade.boslukVarMi());

    }
}

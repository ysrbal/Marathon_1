package soru2;

public class Runner {
    public static void main(String[] args) {
        CustomStringTr ifade = new CustomStringTr("muvaffakiyetsizle�tiricile�tiriveremeyebileceklerimizdenmi�sinizcesine");
        System.out.println("�fadenin uzunlu�u .................... : " + ifade.uzunluk());
        System.out.println("�fadenin 6. karakteri ................ : " + ifade.karakterBul(6));
        System.out.println("�fadenin hepsi k���k harf ............ : " + ifade.hepsiKucukHarf());
        System.out.println("�fadenin hepsi b�y�k harf ............ : " + ifade.hepsiBuyukHarf());
        System.out.println("�fade i�erisinde i�eriyor mu? ........ : " + ifade.iceriyorMu("tirici"));
        System.out.println("�fadenin 9 ve 16. indexleri aras� .... : " + ifade.altMetin(9, 16));
        System.out.println("�fadede f yerine a gelecek ........... : " + ifade.degistir("f", "a"));
        System.out.println("�fade i�erisinde ilk ka��nc� indexte ? : " + ifade.kacinciIndex("c"));
        System.out.println("�fade tamamen bo� mu ? ............... : " + ifade.bosMu());
        System.out.println("�fadede bo�luk var m�? ............... : " + ifade.boslukVarMi());

    }
}

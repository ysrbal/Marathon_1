package soru2;

public class Runner {
    public static void main(String[] args) {
        CustomStringTr ifade = new CustomStringTr("muvaffakiyetsizleþtiricileþtiriveremeyebileceklerimizdenmiþsinizcesine");
        System.out.println(ifade.uzunluk());
        System.out.println(ifade.karakterBul(6));
        System.out.println(ifade.hepsiKucukHarf());
        System.out.println(ifade.hepsiBuyukHarf());
        System.out.println(ifade.iceriyorMu("tirici"));
        System.out.println(ifade.altKume(9,16));
        System.out.println(ifade.degistir("f","a"));
        System.out.println(ifade.kacinciIndex("c"));
        System.out.println(ifade.bosMu());
        System.out.println(ifade.boslukVarMi());



    }
}

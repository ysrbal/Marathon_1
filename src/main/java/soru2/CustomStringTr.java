package soru2;

public class CustomStringTr {
    private String ifade;

    public CustomStringTr(String expression) {
        this.ifade = expression;
    }

    public int uzunluk() {
        return ifade.length();
    }

    public char karakterBul(int index) {
        return ifade.charAt(index);
    }

    public String hepsiKucukHarf() {
        return ifade.toLowerCase();
    }

    public String hepsiBuyukHarf() {
        return ifade.toUpperCase();
    }

    public boolean iceriyorMu(String icerik) {
        return ifade.contains(icerik);
    }

    public String altMetin(int index, int index2) {
        return ifade.substring(index, index2);
    }

    public String degistir(String s1, String s2) {
        return ifade.replace(s1, s2);
    }

    public int kacinciIndex(String s1) {
        return ifade.indexOf(s1);
    }

    public boolean bosMu() {
        return ifade.isEmpty();
    }

    public boolean boslukVarMi() {
        return ifade.isBlank();
    }

}

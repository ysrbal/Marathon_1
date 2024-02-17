package soru1;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        EsnekSayiDizisi dizi = new EsnekSayiDizisi();
        dizi.add(12);
        dizi.add(1);
        dizi.add(3);
        dizi.add(5);
        System.out.println(Arrays.toString(dizi.listele()));
        System.out.println("-----------------------");
        dizi.add(2,2);
        System.out.println(Arrays.toString(dizi.listele()));
        System.out.println("-----------------------");
        dizi.remove(0);
        System.out.println(Arrays.toString(dizi.listele()));

    }
}

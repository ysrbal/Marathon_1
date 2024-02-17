package soru1;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        EsnekSayiDizisi dizi = new EsnekSayiDizisi();
        dizi.add(12); // Dizi i�ine 12 eklendi.
        dizi.add(1);  // Dizi i�ine 1 eklendi.
        dizi.add(3);  // Dizi i�ine 3 eklendi.
        dizi.add(5);  // Dizi i�ine 5 eklendi.
        System.out.println(Arrays.toString(dizi.listele())); // Dizinin elemanlar� kullan�c�ya g�sterildi.
        System.out.println("-----------------------");
        dizi.add(2, 2); // Dizinin 2. indeksine 2 rakam� eklendi.
        System.out.println(Arrays.toString(dizi.listele())); // Dizinin elemanlar� kullan�c�ya g�sterildi.
        System.out.println("-----------------------");
        dizi.remove(0); // Dizinin 0. indeksindeki eleman silindi.
        System.out.println(Arrays.toString(dizi.listele())); // Dizinin elemanlar� kullan�c�ya g�sterildi.

    }
}

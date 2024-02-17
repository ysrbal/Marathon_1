package soru1;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        EsnekSayiDizisi dizi = new EsnekSayiDizisi();
        dizi.add(12); // Dizi içine 12 eklendi.
        dizi.add(1);  // Dizi içine 1 eklendi.
        dizi.add(3);  // Dizi içine 3 eklendi.
        dizi.add(5);  // Dizi içine 5 eklendi.
        System.out.println(Arrays.toString(dizi.listele())); // Dizinin elemanlarý kullanýcýya gösterildi.
        System.out.println("-----------------------");
        dizi.add(2, 2); // Dizinin 2. indeksine 2 rakamý eklendi.
        System.out.println(Arrays.toString(dizi.listele())); // Dizinin elemanlarý kullanýcýya gösterildi.
        System.out.println("-----------------------");
        dizi.remove(0); // Dizinin 0. indeksindeki eleman silindi.
        System.out.println(Arrays.toString(dizi.listele())); // Dizinin elemanlarý kullanýcýya gösterildi.

    }
}

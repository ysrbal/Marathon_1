package soru1;

public class EsnekSayiDizisi {
    private int[] numbers;
    private int count;

    /**
     * <p>Dizi ��erisine Eleman Ekleme</p>
     * Dizi i�erisine bir eleman�n eklenmesini sa�lar.
     *
     * @param number --> Eklenecek say�y� giriniz.
     */
    public void add(int number) {
        count++;
        if (count == 1) {
            numbers = new int[1];
            numbers[0] = number;
        } else {
            int[] temp = new int[count];
            for (int i = 0; i < numbers.length; i++) {
                temp[i] = numbers[i];
            }
            temp[numbers.length] = number;
            numbers = temp;
        }
    }

    /**
     * <p>Dizi ��erisine �stenilen Indexe Eleman Ekleme</p>
     * Dizi i�erisine verilen index numaras�na bir eleman eklenmesini sa�lar.
     *
     * @param index  --> Eleman�n eklenece�i indexi giriniz.
     * @param number --> Eklenecek eleman� giriniz.
     */
    public void add(int index, int number) {
        count++;
        int tempCount = 0;
        int[] temp = new int[count];
        for (int i = 0; i < count; i++) {
            if (i == index) {
                temp[i] = number;
                tempCount--;
            } else if (i < index) {
                temp[i] = numbers[i];
            } else {
                temp[i] = numbers[i + tempCount];
            }
        }
        numbers = temp;
    }

    /**
     * <p>Dizilien Eleman Silme</p>
     * Dizi i�erisinde verilen indexteki eleman� siler.
     *
     * @param index --> Silinmesini istedi�iniz eleman�n indexini giriniz.
     */
    public void remove(int index) {
        int tempCount = 0;
        int[] temp = new int[numbers.length - 1];
        for (int i = 0; i < numbers.length; i++) {
            if (i == index) {
                tempCount++;
                continue;
            }
            temp[i - tempCount] = numbers[i];
        }
        numbers = temp;
        count--;
    }

    /**
     * <p>Diziyi Listeleme</p>
     * Dizinin g�r�nt�lenmesini sa�lar.
     *
     * @return Dizinin adresini d�ner.
     */
    public int[] listele() {
        return numbers;
    }

}

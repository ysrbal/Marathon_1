package soru1;

public class EsnekSayiDizisi {
    private int[] numbers;
    private int count;

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

    public int[] listele() {
        return numbers;
    }

}

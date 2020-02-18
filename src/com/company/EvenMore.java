package com.company;

public class EvenMore {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 5, 2, 3};
        int pairs = identicalPairs(array);
        System.out.println(pairs);
    }

    public static int identicalPairs(int[] array) {
        int pairs = 0;
        for (int index = 0; index < array.length; index++) {
            int value = array[index];

            for (int i = 0; i < array.length; i++) {
                if (i == index) {
                    //do nothing same index
                } else if (array[i] == value) pairs++;
            }
        }
        return pairs/2;
    }
}

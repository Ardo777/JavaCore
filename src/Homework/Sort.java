package Homework;

public class Sort {
    public static void main(String[] args) {
        int[] arrays = {4, 7, 1, 3, 9, 0, 2};
        int web;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = i; j < arrays.length; j++) {
                if (arrays[i] > arrays[j]) {
                    web = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = web;


                }

            }
            System.out.print(arrays[i]);

        }

    }


}
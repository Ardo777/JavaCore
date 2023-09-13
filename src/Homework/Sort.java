package Homework;

public class Sort {
    public static void main(String[] args) {
        int[] arrays = {4, 7, 1, 3, 9, 0, 2};
        int web;
        for (int i = 0; i < arrays.length; i++) {
            for (int k = i; k < arrays.length; k++) {
                if (arrays[i] > arrays[k]) {
                    web = arrays[i];
                    arrays[i] = arrays[k];
                    arrays[k] = web;


                }

            }
            System.out.print(arrays[i]);

        }

    }


}
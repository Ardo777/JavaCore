package Homework.dynamicarray;

public class DynamicArrayMethod {
    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size] = value;
        ++size;

    }

    private void extend() {
        int[] newarray = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            newarray[i] = array[i];

        }
        array = newarray;

    }

    public int getByIndex(int index) {
        if (index <= size && index >= 0) {
            return array[index];
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");

        }
    }

    public void deleteByIndex(int index) {
        if (index > 0 && index < size) {
            for (int j = index; j < size - 1; j++) {
                array[j] = array[j + 1];
            }
            size--;
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }

        } else
            System.out.println("Index not found");

    }

    public void set(int index, int value) {
        if (index <= size) {
            for (int i = 0; i < size; i++) {
                array[index] = array[index + 1];

            }
            array[index] = value;
            for (int i = 0; i < size; i++) {


                System.out.print(array[i] + " ");
            }
        } else
            System.out.println("Index not found");


    }

    public void add(int index, int value) {
        System.out.println();
        if (index > 0 && index < size) {
          int  newarray[]=new int[size+1];
            for (int i = 0; i < index; i++) {
                newarray[i]=array[i];

            }
            newarray[index]=value;
            for (int i = index+1; i < newarray.length ; i++) {
                newarray[i ] = array[i-1];
            }
            for (int j = 0; j < newarray.length; j++) {
                System.out.print(newarray[j] + " ");

            }
        } else
            System.out.println("Index not found");

    }

    public boolean exists(int value) {
        for (int i = 0; i < size; i++) {
            if (value == array[i]) {
                return true;
            }
        }
        return false;
    }

    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {

            if (value == array[i]) {
                return i;
            }
        }

        return -1;
    }
}





package Homework.dynamicarray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArrayMethod da = new DynamicArrayMethod();
        da.add(0);
        da.add(5);
        da.add(98);
        da.add(3);
        da.add(89);
        da.add(777);
        da.add(66);
        da.add(99);
        da.add(14);
        da.add(14);
        da.add(14);
        da.add(14);
       System.out.println("Printing all elements in array");
        da.print();
        System.out.println();
        System.out.println("Geting index 7");
        System.out.println(da.getByIndex(7));
//        System.out.println("Return true if the entered cost is in our array, if not return false");
//        System.out.println(da.exists(5));
//        System.out.println("Return the entered index value, if there are several identical ones, return the first index,if not -1");
//        System.out.println(da.getIndexByValue(66));
//        System.out.println("Deleting index 5");
//       // da.deleteByIndex(5);
//        System.out.println();
//        System.out.println("Add the entered value in the entered index, and shift the existing elements to the right,if there is no such index, print that it does not exist");
//        da.add(3, 10);
//        System.out.println();
//        System.out.println("The entered value in the entered index with the loss of the old value,if not -1");
//        da.set(3, 10);
//    }
}}
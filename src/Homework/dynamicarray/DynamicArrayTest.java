package Homework.dynamicarray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArrayMethod da = new DynamicArrayMethod();
        da.add(0);
        da.add(1);
        da.add(2);
        da.add(3);
        da.add(4);
        da.add(66);
        da.add(66);
        da.add(7);
        System.out.println("Printing all elements in array");
        da.print();
        System.out.println();
        System.out.println("Geting index 7");
        System.out.println(da.getByIndex(7));
        System.out.println(da.exists(5));
        System.out.println(da.getIndexByValue(66));
        da.deleteByIndex(3);
        da.add(7, 10);
        da.set(4, 7);
    }
}
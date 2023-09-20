package Homework.dynamicarray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArrayMethod da = new DynamicArrayMethod();
        da.add(7);
        da.add(15);
        da.add(1);
        da.add(11);
        da.add(8);
        da.add(54);
        da.add(5);
        da.add(4);
        da.add(14);
        da.add(21);
        da.add(21);
        da.add(25);
        System.out.println("Printing all elements in array");
        da.print();
        System.out.println();
        System.out.println("Geting index 0");
        System.out.println(da.getByIndex(0));

    }
}
package classwork.chapter3;

public class AverageTest {
    public static void main(String[] args) {
        double nums[]= {10.3,18.2,20.4,11.7};
        double sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum=sum+nums[i];}

            System.out.println("Среднее значение равно " + sum/5);


    }
}

package Ardo777codes;

public class example {
    public static void example7(int[] array){
        if(array.length>2){
            if(array.length%2==0){

                System.out.println(array[array.length/2-1]+" "+array[(array.length/2)]);
            }else { System.out.println(array[array.length/2]);
            }

        }else System.out.println("Error");

    }

    public static void main(String[] args) {
        int array[]= {7,46,32,64,1,52};
        example.example7(array);

    }
}

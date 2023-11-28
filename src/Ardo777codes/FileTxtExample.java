package Ardo777codes;


import java.io.File;
import java.io.InputStreamReader;

public class FileTxtExample {
    public static void main(String[] args) {
        File file777=new File( "..\\777\\777.txt");
        if (file777.exists()){
            file777.delete();
        }
    }
}

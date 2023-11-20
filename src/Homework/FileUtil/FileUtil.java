package Homework.FileUtil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    run = false;
                case "1":
                    createFileWithContent();
                    break;
                case "2":
                    fileSearch();
                    break;
                case "3":
                    contentSearch();
                    break;
                case "4":
                    findLines();
                    break;
                case "5":
                    printSizeOfPackage();
                    break;
                default:
                    System.out.println("Invalid command,Try again!");
            }
        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        System.out.println("Please write Path");
        String path = scanner.nextLine();
        System.out.println("Please write file name");
        String fileName = scanner.nextLine();
        String filePath = path + File.separator + fileName;
        File file = new File(filePath);
        System.out.println(file.exists());

    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() {
        System.out.println("Please write path");
        String path = scanner.nextLine();
        System.out.println("Please write keyword");
        String keyword = scanner.nextLine();
        File directory = new File(path);
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            for (File file : files) {
                if (file.getName().endsWith(".txt")) {
                    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))
                    ) {
                        String line = null;
                        while ((line = bufferedReader.readLine()) != null) {
                            if (line.contains(keyword)) {
                                System.out.println(file.getName());
                                break;
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {
        System.out.println("Please write txt format filepath");
        String txtFilePath = scanner.nextLine();
        System.out.println("Please write keyword");
        String keyword = scanner.nextLine();
        File file = new File(txtFilePath);
        int lineCount = 1;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line = " ";
            while (line.equals(bufferedReader.readLine())) {
                lineCount++;
                if (line.contains(keyword))
                    System.out.println("In " + file.getName() + " file, " + lineCount + " lines");
            }

        } catch (IOException e) {
           e.printStackTrace();
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("Please write path");
        String path = scanner.nextLine();
        File[] files = new File(path).listFiles();
        int size = 0;
        if (files == null) {
            System.out.println("File with this path " + path + " does not exist");
            return;
        }
        for (File file : files) {
            System.out.println("In this file " + file.getName() + " used " + size + "byte");
            size += file.length();
        }
        System.out.println("Total used = " + size + " byte");
    }


    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() {
        System.out.println("Please write path");
        String path = scanner.nextLine();
        System.out.println("Please write file name");
        String fileName = scanner.nextLine();
        System.out.println("Please write file contents");
        String contents = scanner.nextLine();
        String filePath = path + File.separator + fileName;
        File file = new File(filePath);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(contents);
            bufferedWriter.close();
        } catch (IOException e) {
            String message = e.getMessage();
            System.out.println(message);

        }

    }

}


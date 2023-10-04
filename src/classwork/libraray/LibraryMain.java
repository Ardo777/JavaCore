package classwork.libraray;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        bookStorage bookStorage = new bookStorage();
        boolean isrun = true;
        while (isrun) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for ADD BOOK");
            System.out.println("Please input 2 for SEARCH BOOK");
            System.out.println("Please input 3 for PRINT ALL BOOK");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isrun = false;
                    break;
                case "1":
                    System.out.println("Please input book title");
                    String title = scanner.nextLine();
                    System.out.println("Please input Author name");
                    String authorname = scanner.nextLine();
                    System.out.println("Please input price");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.println("Please input count");
                    int count = Integer.parseInt(scanner.nextLine());
                    Book book = new Book(title, authorname, price, count);
                    bookStorage.add(book);
                    System.out.println("Book created!");

                    break;
                case "2":
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    bookStorage.search(keyword);
                    break;
                case "3":
                    bookStorage.print();
                    break;
                default:
                    System.out.println("Invalid command,Try Again!");
            }
        }
    }
}


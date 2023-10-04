package classwork.libraray;

public class bookStorage {
    private Book[] books = new Book[10];
    private int size;

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;

    }

    private void extend() {
        Book[] tmp = new Book[books.length + 10];
        System.arraycopy(books, 0, tmp, 0, books.length);
        books = tmp;
    }

    public void print() {
        System.out.println("-----------------------");
        for (int i = 0; i < size; i++) {
            System.out.println(books[i].getTitle() + " " + books[i].getAuthorname() + " " + books[i].getPrice() + " " + books[i].getCount());

        }
        System.out.println("-----------------------");
    }

    public void search(String keyword) {

        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword) || books[i].getAuthorname().contains(keyword)) {
                System.out.println(books[i].getTitle() + " " + books[i].getAuthorname() + " " + books[i].getPrice() + " " + books[i].getCount());
            }

        }

    }
}

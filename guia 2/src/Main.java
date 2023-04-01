import Classes.Author;
import Classes.Book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Jony", "Taverna", "jonytaverna@gmail", 'm');
        Author author2 = new Author("pepe","argento","pepe@argento.com",'m');

        ArrayList<Author> lista = new ArrayList<>();

        Book book1 = new Book("Programacion", 1500.5, 22);

        //book1.viewBook();
        /* ej.e
        book1.setPrice(500.1);
        book1.setStock(50);
        book1.viewBook();
         */
        /* ej.g
        book1.messege();
         */
        book1.addAuthor(author1);
        book1.addAuthor(author2);

        System.out.println(book1.toString());

    }
}
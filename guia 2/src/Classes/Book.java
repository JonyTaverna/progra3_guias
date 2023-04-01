package Classes;

import java.util.ArrayList;

public class Book {
    private String title;
    private double price;
    private Integer stock;
    private ArrayList<Author> authors;

    public Book (){}
    public Book (String title, double price, Integer stock){
        this.title= title;
        this.price= price;
        this.stock= stock;
        this.authors= new ArrayList<>();
    }

    public double getPrice() {
        return price;
    }
    public Integer getStock() {
        return stock;
    }
    public String getTitle() {
        return title;
    }
    public void addAuthor(Author author){
        authors.add(author);
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    /*
    public void viewBook (){
        System.out.println("Book Data ---");
        System.out.println(this.title);
        System.out.println(this.price);
        System.out.println(this.stock);
        author.viewAuthor();
    }
    public void messege(){
        System.out.println("the book "+ getTitle() +" is from "+ author.toString()+". And it sells for "+ getPrice());
    }

     */

    @Override
    public String toString() {
        return "Book{ " +
                "title='" + title +'\''+
                ", price=" + price +
                ", stock=" + stock +
                ", autores=" + authors +
                '}';
    }

    /*
    public Author getAuthor (String name){
        Author autorBuscado = null;
        for (Author autorsito : authors){
            if (autorsito.getName().equals(name)) {
                autorBuscado=autorsito;
            }
        }
        return autorBuscado;
    }

     */
}

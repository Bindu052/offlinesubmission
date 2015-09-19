/**
 * Created by ABIR BINDU on 9/13/2015.
 */
public class testbook {
    public static void main(String[] args) {
        Author schildt= new Author("Herbert Schildt", "herbert@schildt.com");
        System.out.println(schildt.getName()+" at "+schildt.getEmail());

        Author bjarne= new Author("Bjarne Stroustrup");
        bjarne.setEmail("bjarne@bjarne.com");
        bjarne.print();

        book b1= new book("Teach Yourself C++", schildt);
        b1.setPrice(150.5);
        b1.setStock(50);
        System.out.println("Author: " + b1.getAuthorName() + " Name: " + b1.getName() + " Price: " + b1.getPrice() + " Stock: " + b1.getStock());
        b1.borrowBook(20);
        b1.returnBook(10);
        System.out.println("Author: " + b1.getAuthorName() + " Name: " + b1.getName() + " Price: " + b1.getPrice() + " Stock: " + b1.getStock());

        book b2= new book("The C++ Programming Language", bjarne, 200, 20);
        b2.print();
        b2.returnBook(10);
        b2.borrowBook(50);
        b2.print();

        b1.getAuthor().print();
        b2.getAuthor().print();

    }
}

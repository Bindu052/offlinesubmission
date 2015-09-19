/**
 * Created by ABIR BINDU on 9/13/2015.
 */
public class book {
    private String name;
    private Author author;
    private double price;
    private int stock;

    public book(String name, Author author )
    {
        this.name=name;
        this.author=author;
    }

    public book(String name, Author author,double price, int stock )
    {
        this.name=name;
        this.author=author;
        this.price=price;
        this.stock=stock;
    }



    public Author getAuthor(){
        return this.author;
    }

    public String getAuthorName(){
        Author author2;
        author2=this.author;
        return author2.getName();

    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public int getStock(){
        return this.stock;
    }

    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setStock(int stock){
        this.stock=stock;
    }

    public void borrowBook(int n){
        int a;
        if(n>this.stock){
            System.out.println("Borrowing amount exceeds the current stock!");
        }
        else{
            a=this.stock;
            a=a-n;
            this.stock=a;
        }
    }

    public void returnBook(int n){
        int a;
        a=this.stock;
        a=a+n;
        this.stock=a;
    }

    public void print(){
        System.out.println("Author: "+ author.getName()+"Book: "+ name+"Price:"+price+"Stock: "+ stock);
    }

}

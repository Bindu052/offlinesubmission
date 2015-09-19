/**
 * Created by ABIR BINDU on 9/13/2015.
 */
public class Author {
    private String name;
    private String email;

    public Author(){

    }
    public Author(String name){
        this.name=name;
    }

    public Author(String name, String email){
        this.name=name;
        this.email=email;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getName()
    {
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }

    public void print(){
        System.out.println(this.name+" at "+this.email);
    }

}

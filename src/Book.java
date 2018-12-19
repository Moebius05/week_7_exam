import java.util.ArrayList;
import java.util.List;

public class Book {
    List<Person> liste = new ArrayList<>();

    public int getZahlDerEinträge() {
        return zahlDerEinträge;
    }

    public  int     zahlDerEinträge =   0;

    void insert (int key, Person person){
        liste.add(key, person);
    }
    public void    bumpUpCounter(){
        zahlDerEinträge++;
    }

}

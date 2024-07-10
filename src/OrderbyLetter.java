import java.util.Comparator;

public class OrderbyLetter implements Comparator<Books> {

    @Override
    public int compare (Books b1, Books b2){
        return b1.getName().charAt(0) - b2.getName().charAt(0);
    }



}

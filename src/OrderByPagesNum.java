import java.util.Comparator;

public class OrderByPagesNum implements Comparator<Books> {

    @Override
    public int compare(Books b1, Books b2){
        return b1.getPages_num() - b2.getPages_num();
    }
}

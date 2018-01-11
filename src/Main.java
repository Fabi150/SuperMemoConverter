import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        CardList lista = CardList.getInstance();
        Menu menu = new Menu();
        menu.displayMenu(lista);

    }

}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.Scanner;

public class CardList {
    // Singleton
    // Prywatna zmienna statyczna przechowująca referencje do jedynej instancji obiektu
    private static CardList _me = null;
    private LinkedList<Card> list = new LinkedList<Card>();
    private Scanner x;

    // Konstruktor jest metodą prywatną więc blokowana jest możliwość tworzenia nowych instancji obiektu
    private CardList() {

    }

    // Metoda zwracająca referencje do jedynej instancji tej klasy (jeżeli taka instancja nie istniej to tworzy ją)
    public static CardList getInstance() {
        if (_me == null) {
            _me = new CardList();
        }
        return _me;
    }

    public void importTxt() {

        String fileName = "C:\\Users\\rados\\IdeaProjects\\SuperMemoConverter\\src\\it.txt";
        File textFile = new File(fileName);


        try {
            Scanner in = new Scanner(textFile);
            while (in.hasNext()) {
                String line = in.nextLine();
                this.addCard(line);
            }

            in.close();

        } catch (FileNotFoundException e) {
            System.out.println("nie ma pliku");
        }
    }

    public void exportTxt() throws FileNotFoundException, UnsupportedEncodingException {

        PrintWriter writer = new PrintWriter("C:\\Users\\rados\\IdeaProjects\\SuperMemoConverter\\src\\expot.txt", "UTF-8");
        for (Card temp : list) {
            writer.println("q: " + temp.getQ());
            writer.println("a: " + temp.getA());
            writer.println();
            temp.print();
        }
        writer.close();

    }

    public void openTxt() {

    }

    public void printAll() {
        for (Card temp : list) {
            temp.print();
        }

    }

    public void swapAll() {
        for (Card temp : list) {
            temp.swap();
        }
    }

    public void swapAndAdd() {


    }

    public void deleteOne() {

    }

    public void deleteAll() {

    }

    private void addCard(String line) {
        char separator = '—';
        int separatorPosition = line.indexOf(separator);

        String q = line.substring(0, separatorPosition - 1);
        String a = line.substring(separatorPosition + 2);

        this.list.push(new Card(q, a));
    }

}

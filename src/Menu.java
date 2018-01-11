import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Menu {

    public Menu() {
    }

    public static void displayMenu(CardList lista) throws FileNotFoundException, UnsupportedEncodingException {
        int select;
        do {
            System.out.println("\nPlease select menu item");
            System.out.println("" +
                    "1-Inport txt to convertion, \n" +
                    "2-Export to Q&A txt, \n" +
                    "3-Display all Cards, \n" +
                    "4-Swap all cards, \n" +
                    "5-Convert file to Q&A txt, \n" +

                    "0-Exit program \n" +
                    "--------------------------------------"
            );

            Scanner scanner = new Scanner(System.in);
            select = scanner.nextInt();

            switch (select) {
                case 1:
                    lista.importTxt();
                    System.out.println("  --->Cards imported");
                    break;
                case 2:
                    lista.exportTxt();
                    System.out.println("  --->Cards exported");
                case 3:
                    lista.printAll();
                    break;
                case 4:
                    lista.swapAll();
                    System.out.println("  --->All cards swapd");
                    break;
                case 5:
                    lista.importTxt();
                    lista.exportTxt();
                    System.out.println("  --->File converted to Q&A format");
                    break;
            }

        } while (select != 0);
    }
}

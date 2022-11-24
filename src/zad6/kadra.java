package zad6;
import java.util.Scanner;
public class kadra extends osoba {
    Scanner scan = new Scanner(System.in);
    String wyksztalceniejs;
    String stanowiskojs;
    void inicjuj1js()
    {
        System.out.println("Nazwisko: ");
        nazwiskojs = scan.nextLine();
        System.out.println("Imie: ");
        imiejs = scan.nextLine();
        System.out.println("Ulica: ");
        ulicajs = scan.nextLine();
        System.out.println("Kod: ");
        kodjs = scan.nextLine();
        System.out.println("Miasto: ");
        miastojs = scan.nextLine();
        System.out.println("Wyksztalcenie: ");
        wyksztalceniejs = scan.nextLine();
        System.out.println("Stanowisko: ");
        stanowiskojs = scan.nextLine();
    }
    void drukuj1js()
    {
        System.out.println(nazwiskojs + " " + imiejs + " " + ulicajs + " " + kodjs + " " + miastojs + " " + wyksztalceniejs + " " + stanowiskojs);
    }
}


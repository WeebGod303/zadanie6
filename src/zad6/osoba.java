package zad6;
import java.util.Scanner;
public class osoba  {
    Scanner scan = new Scanner(System.in);
    String nazwiskojs;
    String imiejs;
    String ulicajs;
    String kodjs;
    String miastojs;
    void inicjujjs()
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
    }
    void drukujjs()
    {
        System.out.println(nazwiskojs + " " + imiejs + " " + ulicajs + " " + kodjs + " " + miastojs);
    }
}


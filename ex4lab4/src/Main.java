import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int c = 0;

        Scanner scan = new Scanner(System.in);

        JOptionPane.showMessageDialog(null, "Bine ati venit la Quiz");
        JOptionPane.showMessageDialog(null, "                                                            Reguli  !!!\n"  +
                "Regulile sunt simple, ai 5 intrebari la care trebuie sa raspunzi cu varianta corecta");

        System.out.println("Ce tip de sport prefer eu ?");
        System.out.println("Fotbal");
        System.out.println("Baschet");
        System.out.println("Volei");
        System.out.println("Tenis\n");
        String in ;
        in = scan.nextLine();

        if (in.equalsIgnoreCase("Fotbal"))
        {
            System.out.println("Raspuns corect!!! \n");
            c++;
        }
        else {
            System.out.println("Raspusnul este gresit !!! ");
            System.out.println("Raspunsul corect este Fotbal \n");
        }
        System.out.println("In ce limaj este scris acest program ?");
        System.out.println("C++");
        System.out.println("C#");
        System.out.println("Java");
        System.out.println("Python\n");

        in = scan.nextLine();

        if (in.equalsIgnoreCase("Java"))
        {
            System.out.println("Raspuns corect!!! ");
            c++;
        }
        else {
            System.out.println("Raspusnul este gresit !!! ");
            System.out.println("Raspunsul corect este Java ");
        }

        System.out.println("Fotbalistul meu preferat este ?");
        System.out.println("Ramos");
        System.out.println("Ronaldo");
        System.out.println("Messi");
        System.out.println("Neymar\n");

        in = scan.nextLine();

        if (in.equalsIgnoreCase("Ramos"))
        {
            System.out.println("Raspuns corect!!! \n");
            c++;
        }
        else {
            System.out.println("Raspusnul este gresit !!! ");
            System.out.println("Raspunsul corect este Ramos \n");
        }

        System.out.println("Unde este situat Turnul Eiffel ");
        System.out.println("Kopenhaga");
        System.out.println("Londra");
        System.out.println("Paris");
        System.out.println("Praga\n");

        in = scan.nextLine();

        if (in.equalsIgnoreCase("Paris"))
        {
            System.out.println("Raspuns corect!!! \n");
            c++;
        }
        else {
            System.out.println("Raspusnul este gresit !!! ");
            System.out.println("Raspunsul corect este Paris \n");
        }

        System.out.println("Cati ani am eu ? ");
        System.out.println("18");
        System.out.println("19");
        System.out.println("20");
        System.out.println("21\n");

        in = scan.nextLine();

        if (in.equals("20"))
        {
            System.out.println("Raspuns corect!!! \n");
            c++;
        }
        else {
            System.out.println("Raspusnul este gresit !!! ");
            System.out.println("Raspunsul corect este 20 \n");
        }
System.out.println(c+" din 5 raspunsuri corecte");
System.out.print("Ai atins "+ 100* c/5 + "% " + "din raspunsuri");

    }
}

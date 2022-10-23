import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ghicestenumar();
    }

    public static void ghicestenumar() {
        Scanner inputDevice = new Scanner(System.in);
        int cauta, e, d = 0;
        int numar = 1 + (int) (100 * Math.random());
        for (e = 0; e <= d; e++) ;

        {

            {
                System.out.println("Introduceti numarul ");
                cauta = inputDevice.nextInt();
                if (cauta == numar) {
                    System.out.println("Ati ghicit numarul");
                    d++;

                }
                else if (cauta > numar) {

                    System.out.println("Numarul dumneavoastra e mai mare ");
                    d++;
                } else if (cauta < numar)

                    System.out.println("Numarul dumneavoastra este mai mic ");
                d++;
            }
            System.out.println("Numarul de incercari " + d);
        }
    }
}




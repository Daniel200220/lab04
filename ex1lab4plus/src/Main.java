import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int nota=0,m=0;
        float max=0,min=0,medie=0;
        System.out.println("Introducerea cifrei (99) inseamna iesirea din program");
        while (nota!=99) {
            System.out.println("Introduceti nota ");
            nota=scanner.nextInt();
            m++;
                if (nota<10)
                    System.out.println("Introducerea acestei note nu este posibila");
                else {
                    if (nota>min)min=nota;
                    if(nota<max)max=nota;
                    medie=nota+medie;
                }
        }
        System.out.println("Numarul de note introduse este: "+m+"");
medie=medie/m ;
        System.out.println("Media notelor este: "+medie+"");
        System.out.println("Minimul este: "+min+"");
        System.out.println("Maximul este: "+max+"");
        }
    }

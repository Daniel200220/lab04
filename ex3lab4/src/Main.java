import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner inputDevice=new Scanner(System.in);
        int numar;
        System.out.println("Adaugati un numar");
        numar= inputDevice.nextInt();
        perfect(numar);

    }
    public static void  perfect(int y)
    {
        int x=0;
        for(int i=1;i<=y/2;i++)
        {
            if(y%i==0)
            {
                x = i + x;
            }

        }
        if(x==y)
        {
            System.out.println("Numarul este perfect");
        }
        else
        {
            System.out.println("Numarul  nu este perfect");
        }

    }

}
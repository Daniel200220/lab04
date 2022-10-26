public class Main {
    public static void main(String[] args) {
display();
    }
    public static void display()
    {
        int lucrator, productie=4000;
        for(int i=1;i<=24;i++) {
            lucrator=(6*productie)/100;
                    productie=lucrator+productie;
            if(productie>7000)
            {
                System.out.println("Producita a depasit limita de 7000 piese, lucratorul merita marire"+ " in luna "+i+"\n");

            }
    }
    }

}
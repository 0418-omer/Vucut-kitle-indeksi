import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double kilo , boy , kitle
               ;

        Scanner inp = new Scanner(System.in);

        System.out.println("boyunuzu giriniz ");
        boy = inp.nextDouble();

        System.out.println("kilonuzu giriniz");
        kilo= inp.nextDouble();





        kitle=(kilo /(boy*boy));
        System.out.println("vucut kitle indeksiniz "+kitle);


    }
}
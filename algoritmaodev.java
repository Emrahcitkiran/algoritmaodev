package odev;
import java.util.Scanner;

public class algoritmaodev  {


    public static void main(String [] args) {

        Scanner input = new Scanner(System.in) ;
        System.out.printIn("Bir sayı giriniz : ");
        int n = input.nextInt();

        int total = 0;
        for (int i = 1; i < n; i++) {

            if (n % i == 0 ) {
                total += i;
            }
        }

        if (total == n) {

            System.out.printIn(n + "Sayısı Mükemmel Bir Sayıdır. ");

        }
        else {
            System.out.printIn(n + "Sayısı Mükemmel Bir Sayı Değildir. ");
        }

    }
}
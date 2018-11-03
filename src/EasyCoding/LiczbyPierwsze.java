package EasyCoding;

import java.util.Scanner;

public class LiczbyPierwsze {

    public static void main(String[] args) {

        System.out.println("Type number");

        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();

        int check = n % 2;

        if (check != 0)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}

package EasyCoding;

import java.util.Scanner;

public class DwieCyfrySilni {
    public static void main(String[] args) {

        int result = 1;

        System.out.println("Type number");

        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();

        if (n <= 1)
        {
            System.out.println("Tens : 0");
            System.out.println("Units : 1");
        }
        else
            {
            for (int i = 1; i <= n; i++)
                result = result * i;


            int tens = result / 10;
            int units = result - (tens * 10);

            System.out.println("Tens: " + tens);
            System.out.println("Units: " + units);
            }
    }
}

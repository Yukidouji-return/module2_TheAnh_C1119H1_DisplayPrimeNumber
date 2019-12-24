import java.util.Scanner;

public class DisplayPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter the number:");
        int number = sc.nextInt();
        System.out.println(number + " prime number first:");

        int amout = 0;

        for (int i = 2; amout < number; i++) {
            int count = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                amout++;
                System.out.print(i + " ");
            }
        }


    }
}
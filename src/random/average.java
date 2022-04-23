package random;

import java.sql.SQLOutput;
import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        boolean go = true;

        while(go) {
            long index = 0;
            long sum = 0;

            int range = 100;
            int repeatRange = 1000;

            System.out.println("Random Statistics | Average Calculation");

            System.out.println("\nCalculation Parameter");
            System.out.print(" |range: ");
            Scanner rangeInput = new Scanner(System.in);
            range = rangeInput.nextInt();
            System.out.print(" |repeatRange: ");
            Scanner repeatRangeInput = new Scanner(System.in);
            repeatRange = repeatRangeInput.nextInt();

            System.out.println("\n\nstart calculation?(true/false)\n");
            Scanner start = new Scanner(System.in);

            if (start.nextBoolean()) {
                for (int i = 0; i <= repeatRange; i++) {
                    int randomNum = getRandomNumber(0, range + 1);
                    sum += randomNum;
                    index++;
                    System.out.println("Num: " + randomNum + " | Current Average: " + (sum / index) + " | Index: " + index);
                }
            }

            System.out.println("\n calculation finished");

            System.out.println("\n--------------- result ---------------");
            System.out.println("range: " + range);
            System.out.println("repeatRange: " + repeatRange);
            System.out.println("average: " + (sum / index));

            System.out.println("\nCalculation System Variables:");
            System.out.println(" sum: " + sum);
            System.out.println(" index: " + index);


            System.out.println("\n\n\nrestart?(true/false)");
            Scanner restartInput = new Scanner(System.in);
            go = restartInput.nextBoolean();
        }
    }

    public static int getRandomNumber(int startNum, int endNum) {
        return (int)(Math.floor(Math.random() * (endNum - startNum)) + startNum);
    }
}

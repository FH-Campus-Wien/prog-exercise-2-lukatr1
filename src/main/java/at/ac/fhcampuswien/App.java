package at.ac.fhcampuswien;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;
import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here

        int c = 0;     // counter
        int g = 1;     // number for input
        double largest = -1;
        Scanner num = new Scanner(System.in);


        while (c != -1) {
            System.out.print("Number " + g + ": ");
            double n = num.nextDouble();
            c++;
            g++;
              if (n > largest) {
                largest = n;
            } if (n < 0 && c == 1) {
                System.out.println("No number entered.");
                break;
            } if (n < 0 && c > 2) {
                System.out.printf("The largest number is %.2f", largest);
                System.out.println();
                break;
            }
        }
    }

    //todo Task 2
    public void stairs(){
        // input your solution here

        Scanner lines = new Scanner(System.in);
        int l = lines.nextInt();
        int r = 0;  //rows
        int c = 0;   //colons
        int n = 1;  //numbers
        System.out.print("n: ");

        if (l <= 0)
            System.out.println("Invalid number!");

        for (r = 0; r < l; r++) {
            for (c = 0; c <= l; c++) {
                if (r >= c)
                    System.out.print(n++ + " ");
                else
                    break;
            }
            System.out.println();
        }

    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        for (int row1 = 1; row1 <= 6; row1++) {
            for (int spaces = row1; spaces < 6; spaces++) {
                System.out.print(" ");
            }
            for (int row2 = 1; row2 < (row1 * 2); row2++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        // input your solution here
        Scanner mark = new Scanner(System.in);

        int g = 1;
        int counter = 0;
        int f = 5;
        double average;
        double s = 0;
        int five = 0;


        while (counter != -1000) {
            System.out.print("Mark " + g + ": ");
            int n = mark.nextInt();
            g++;

            s = s + n;
            counter++;

            if (n > f || n < 0) {
                g--;
                counter--;
                s = s - n;
                System.out.println("Invalid mark!");


            }if (n == 5) {
                five++;

            }
            if (n == 0) {
                counter--;
                if (counter == 0) {
                    System.out.println("Average: 0.00");
                    System.out.println("Negative marks: " + five);
                    break;

                }
                average = s/counter;
                System.out.printf("Average: %.2f" , average);
                System.out.println();
                System.out.println("Negative marks: " + five);
                break;
            }

        }
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
         Scanner number = new Scanner(System.in);
         System.out.print("n: ");
         int n = number.nextInt();
         int sum = 0;
         int copy = n;

         while (copy > 9) {

             while (copy > 0) {
                 int mod = copy % 10;
                 sum = sum + (int) Math.pow(mod, 2);
                 copy = copy / 10;

             }
             copy = sum;
             sum = 0;
         }
         if (copy == 1) {
             System.out.println("Happy number!");

         }else
             System.out.println("Sad number!");

    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}
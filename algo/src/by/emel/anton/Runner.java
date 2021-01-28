package by.emel.anton;

import by.emel.anton.maxeven.MaxEven;
import by.emel.anton.multiplication.Multiplication;
import by.emel.anton.nok.Nok;

import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("Enter NOK, MAXEVEN, MULTI or EXIT");
            String s = scanner.nextLine();
            if (s.equals("NOK")) {
                System.out.println("enter first number");
                int a = Integer.parseInt(scanner.nextLine().trim());
                System.out.println("enter second number");
                int b = Integer.parseInt(scanner.nextLine().trim());
                System.out.println(new Nok().lcm(a, b));
            }
            else if (s.equals("EXIT")) {
                System.out.println("exit from progm");
                flag = false;
                scanner.close();
            }
            else  if(s.equals("MAXEVEN")) {
                System.out.println("enter number for max even");
                int a = Integer.parseInt(scanner.nextLine().trim());
                System.out.println(new MaxEven().findMaxEven(a));
            }
            else if(s.equals("MULTI")) {
                System.out.println("enter number for multi");
                int a = Integer.parseInt(scanner.nextLine().trim());
                System.out.println(new Multiplication().multiplicate(a));
            }
        }

    }
}

package day7;

import java.util.Scanner;

public class userinput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Welcome"+name+"!!!");



        System.out.println("Welcome " + name + "!!!");
    }
}

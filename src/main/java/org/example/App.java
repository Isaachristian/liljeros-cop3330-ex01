package org.example;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.next();

        String welcome = "Hello, " + name + ", nice to meet you!";
        System.out.println(welcome);
    }
}

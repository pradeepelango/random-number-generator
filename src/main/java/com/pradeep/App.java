package com.pradeep;

import com.pradeep.service.RandomNumberGeneratorService;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws Exception {
        int number = 1;
        while (number > 0) {
            Scanner input = new Scanner(System.in);
            System.out.print("How many TOTO numbers to generate? ");
            number = input.nextInt();
            System.out.println(RandomNumberGeneratorService.generateTotoNumbers(number));
        }
    }
}

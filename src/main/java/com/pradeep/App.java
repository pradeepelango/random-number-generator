package com.pradeep;

import com.pradeep.service.RandomNumberGeneratorService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) throws Exception
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many TOTO numbers to generate? ");
        int number = input.nextInt();
        System.out.println(RandomNumberGeneratorService.generateTotoNumbers(number));
    }
}

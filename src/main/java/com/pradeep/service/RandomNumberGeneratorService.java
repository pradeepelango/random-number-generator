package com.pradeep.service;

import java.util.*;

public class RandomNumberGeneratorService {

    public static Set<Integer> generateTotoNumbers() {
        Random random = new Random();
        Set<Integer> numbers = new TreeSet<>();
        while (numbers.size() < 6) {
            numbers.add(random.ints(1, (50)).findFirst().getAsInt());
        }
        return numbers;
    }

    public static List<Set<Integer>> generateTotoNumbers(int numberOfTotoNumbers) throws Exception {
        Random random = new Random();
        List<Set<Integer>> listOfTotoNumbers = new ArrayList<>();
        Set<Integer> numbers = new TreeSet<>();
        while (listOfTotoNumbers.size() < numberOfTotoNumbers) {
            while (numbers.size() < 6) {
                numbers.add(random.ints(1, (50)).findFirst().getAsInt());
            }
            System.out.println(numbers);
            if (NumberStrategyService.isBalanced(numbers)) {
                listOfTotoNumbers.add(new TreeSet<>(numbers));
            }
            numbers.clear();

        }

        return listOfTotoNumbers;
    }
}

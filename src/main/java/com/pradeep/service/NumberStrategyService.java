package com.pradeep.service;

import java.util.Set;

public class NumberStrategyService {

    public static boolean isBalanced(Set<Integer> number) {
        return (isSumBalanced(number) && isHighLowBalanced(number) && isOddEvenBalanced(number) && isNumberGroupBalanced(number));
    }

    public static boolean isSumBalanced(Set<Integer> number) {
        int total = 0;
        for (Integer i : number) {
            total += i;
        }
        return (total >= 115 && total <= 185);
    }

    public static boolean isHighLowBalanced(Set<Integer> number) {
        int count = 0;
        for (Integer i : number) {
            if (i > 0 && i <= 24) {
                count++;
            }
        }
        return (count >= 2 && count <= 4);
    }

    public static boolean isOddEvenBalanced(Set<Integer> number) {
        int count = 0;
        for (Integer i : number) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return (count >= 2 && count <= 4);
    }

    public static boolean isNumberGroupBalanced(Set<Integer> number) {
        int onesCount = 0;
        int tensCount = 0;
        int twentiesCount = 0;
        int thirtiesCount = 0;
        int fortiesCount = 0;
        for (Integer i : number) {
            if (i == 10) {
                onesCount++;
                continue;
            }
            switch (i / 10) {
                case 0:
                    onesCount++;
                    break;
                case 1:
                    tensCount++;
                    break;
                case 2:
                    twentiesCount++;
                    break;
                case 3:
                    thirtiesCount++;
                    break;
                case 4:
                    fortiesCount++;
                    break;
            }
        }
        for (Integer i : number) {
            switch (i) {
                case 10:
                    tensCount--;
                    onesCount++;
                    break;
                case 20:
                    twentiesCount--;
                    tensCount++;
                    break;
                case 30:
                    thirtiesCount--;
                    twentiesCount++;
                    break;
                case 40:
                    fortiesCount--;
                    thirtiesCount++;
                    break;
            }
        }
        return (onesCount == 0 || tensCount == 0 || twentiesCount == 0 || thirtiesCount == 0
                || fortiesCount == 0);
    }


}



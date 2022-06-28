package com.practice.happyNumbers;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.HashSet;
import java.util.Set;

public class HappyNumbers {
    public boolean isHappy(int n) {
        if(n < 1) {
            throw new IllegalArgumentException("Argument must be greater than 0");
        }
        Set<Integer> visited = new HashSet<>();
        int current = n;
        while(current != 1 && !visited.contains(current)) {
            visited.add(current);
            current = sumSquaresOfDigits(current);
        }
        return !visited.contains(current);
    }

    int sumSquaresOfDigits(int n) {
        int total = 0;
        CharacterIterator iterator = new StringCharacterIterator(String.valueOf(n));
        while(iterator.current() != CharacterIterator.DONE) {
            int digit = Integer.parseInt(String.valueOf(iterator.current()));
            total += (digit * digit);
            iterator.next();
        }
        return total;
    }
}

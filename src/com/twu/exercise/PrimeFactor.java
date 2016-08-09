package com.twu.exercise;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public static List<Integer> generate(int n) {
        List<Integer> factors = new ArrayList<>();
        List<Integer> primesBelow = primesBelowN(n);
        for (Integer t: primesBelow) {
            if (n % t == 0)
                factors.add(t);
        }
        return factors;
    }

    public static List<Integer> primesBelowN(int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; ++i) {
            if (isPrime(i))
                primes.add(i);
        }
        return primes;
    }

    public static boolean isPrime(int n) {
        int end = (int)Math.sqrt(n) + 1;
        for (int i = 2; i < end; ++i) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        List<Integer> ret = PrimeFactor.generate(210);
        for (Integer i : ret)
            System.out.println(i);
    }

}

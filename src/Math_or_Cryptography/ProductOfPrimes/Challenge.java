package Math_or_Cryptography.ProductOfPrimes;

public class Challenge {
    public static boolean productOfPrimes(int num) {
        return checkPrime(factors(num));
    }

    static boolean checkPrime(int [] factors) {
        boolean factor0 = false, factor1 = false;
        // Edge Cases
        if(factors[0] <= 1 || factors[1] <= 1) return false;
        if(factors[0] <= 3) factor0 = true;
        if(factors[1] <= 3) factor1 = true;
        if(factor0 && factor1) return true;
        // Note: All integers can be rewritten 6k-1, 6k+0, 6k+1, 6k+2, 6k+3, 6k+4
        // Checks cases d = 6k+0, 6k+2, 6k+3, 6k+4 assuming factor isn't already found to be true
        if(factor0) {
            if(factors[1] % 2 == 0 || factors[1] % 3 == 0) return false;
        }
        else if(factor1) {
            if(factors[0] % 2 == 0 || factors[0] % 3 == 0) return false;
        }
        else {
            if (factors[0] % 2 == 0 || factors[0] % 3 == 0 || factors[1] % 2 == 0 || factors[1] % 3 == 0) {
                return false;
            }
        }
        // Checks remaining cases (6k-1, 6k+1) assuming the factor isn't already found to be true
        if(!factor0) {
            for (int i = 5; i * i < factors[0]; i += 6) {
                if (factors[0] % i == 0 || factors[0] % (i + 2) == 0) return false;
            }
        }
        if(!factor1) {
            for (int i = 5; i * i < factors[1]; i += 6) {
                if (factors[1] % i == 0 || factors[1] % (i + 2) == 0) return false;
            }
        }
        return true;
    }

    static int[] factors(int num) {
        // Edge Cases
        if(num <= 1) return new int[]{-1, -1};
        if(num == 2) return new int[]{1, 2};
        if(num == 3) return new int[]{1, 3};
        // Note: All integers can be rewritten 6k-1, 6k+0, 6k+1, 6k+2, 6k+3, 6k+4
        // Checks cases d = 6k+0, 6k+2, 6k+3, 6k+4
        if(num % 2 == 0) return new int[]{2, num / 2};
        if(num % 3 == 0) return new int[]{3, num / 3};
        // Checks remaining cases (6k-1, 6k+1)
        for (int i = 5; i * i <= num; i += 6) {
            if(num % i == 0) return new int[]{i, num / i};
            if(num % (i + 2) == 0) return new int[]{i + 2, num / (i + 2)};
        }
        return new int[]{-1, -1};
    }
}

package Recursion.Persistence;

public class Challenge {
    public static int additivePersistence(int n) {
        int m, i=0, sum=0;
        if(n<10) return 0;
        else {
            i++;
            while(n>0) {
                m = n % 10;
                sum = sum + m;
                n = n / 10;
            }
        return i + additivePersistence(sum);
        }
    }

    public static long multiplicativePersistence(long n) {
        long m, i=0, prod=1;
        if(n<10) return 0;
        else {
            i++;
            while(n>0) {
                m = n % 10;
                prod = prod * m;
                n = n / 10;
            }
            return i + multiplicativePersistence(prod);
        }
    }
}

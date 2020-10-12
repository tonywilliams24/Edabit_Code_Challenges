package Math_or_Cryptography.DifferenceCipher;

import java.util.Arrays;
import static Math_or_Cryptography.DifferenceCipher.Challenge.decrypt;
import static Math_or_Cryptography.DifferenceCipher.Challenge.encrypt;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(encrypt("Hello")));
        System.out.println(Arrays.toString(encrypt("Sunshine")));
        System.out.println(decrypt(new int[] {72, 33, -73, 84, -12, -3, 13, -13, -68}));
    }
}

package Math_Cryptography.DifferenceCipher;

public class Challenge {
    public static int[] encrypt(String str) {
        int charArr[] = new int[str.length()];
        int intArr[] = new int[str.length()];
        for(int i=0; i<str.length(); i++) charArr[i] = (int)str.charAt(i);
        intArr[0] = charArr[0];
        for(int j=1; j<str.length(); j++) {
        intArr[j] = charArr[j-1]-charArr[j];
        }
        return intArr;
    }

    public static String decrypt(int[] arr) {
        char charArr[] = new char[arr.length];
        charArr[0] = (char)arr[0];
        for(int i=1; i<arr.length; i++) {
            charArr[i] = (char)((int)charArr[i-1] + arr[i]);
        }
        String txt = String.valueOf(charArr);
        return txt;
    }
}

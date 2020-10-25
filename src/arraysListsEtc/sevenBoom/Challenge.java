package arraysListsEtc.sevenBoom;

public class Challenge {

    public static String sevenBoom(int[] arr) {

        for(int num : arr) if(num==7 || Integer.toString(num).contains("7")) return "Boom!";
        return "there is no 7 in the array";

    }
}

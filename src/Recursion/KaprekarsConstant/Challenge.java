package Recursion.KaprekarsConstant;

import java.util.Arrays;
import java.util.Collections;

public class Challenge {
    public static int kaprekar(int num) {

        if(num==6174) return 1;
        else {
            String numStr = Integer.toString(num);
            String [] numDescArr = new String[4];
            String [] numAscArr = new String[4];
            StringBuilder numDescBuilder = new StringBuilder();
            StringBuilder numAscBuilder = new StringBuilder();

            // Adds leading zeros to array if number is less than 1000
            int leadZeros = 4-numStr.length();
            int i=0;
            while(leadZeros>0) {
                numDescArr[i] = "0";
                i++;
                leadZeros--;
            }

            // Adds digits from number to remaining spots in array, sorts array, and populates another array in reverse order
            for(int j=0;i<4; i++, j++) {
                numDescArr[i]=Character.toString(numStr.charAt(j));
            }
            Arrays.sort(numDescArr, Collections.reverseOrder());
            for(int j=0, k=3; j<4; j++, k--) {
                numAscArr[j]=numDescArr[k];
            }

            // Converts arrays to StringBuilders for easily conversion to String then int
            for(int j=0; j<4; j++) {
                numDescBuilder.append(numDescArr[j]);
                numAscBuilder.append(numAscArr[j]);
            }
            int numDescInt = Integer.parseInt(numDescBuilder.toString());
            int numAscInt = Integer.parseInt(numAscBuilder.toString());

            // Takes the difference in numbers and recursively calls function using the difference as a parameter.
            // Will add one to the return if the diff does not equal 6174.
            int numDiff = numDescInt-numAscInt;
            if(numDiff==6174) return kaprekar(6174);
            return 1 + kaprekar(numDescInt-numAscInt);
        }
    }
}

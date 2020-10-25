package recursionLoopsEtc.josephusProblem;

import java.util.ArrayList;

public class Challenge {
    public static int josephus(int n, int i) {

        ArrayList<Integer> soldiersList = new ArrayList<>(n);
        int gap = i-1;
        int index = gap;

        for(int j=0; j<n; j++) soldiersList.add(j+1);
        while(n>1) {
                soldiersList.remove(index%n);
                n--;
                index=(index+gap)%n;
        }
        return soldiersList.get(0);
    }
}

package collection.comporator;

import collection.Students;

import java.util.Comparator;

public class SortNames implements Comparator<Students>{


    @Override
    public int compare(Students o1, Students o2) {
        char[] result1 = o1.getName().toCharArray();
        char[] result2 = o2.getName().toCharArray();
        int x = (int) result1[0];
        int y = (int) result2[0];

        if (x == y){
            return 0;
        } else if (x>y){
            return -1;
        }
        return 1;
    }
}

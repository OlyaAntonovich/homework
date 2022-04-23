package collection.comporator;

import collection.Students;

import java.util.Comparator;

public class SortMarks implements Comparator<Students>{


    @Override
    public int compare(Students o1, Students o2) {
        if (o1.getMark()== o2.getMark()){
            return 0;
        } else if (o1.getMark()>o2.getMark()){
            return -1;
        }
        return 1;
    }
}

package collection.comporator;

import collection.Students;

import java.util.Comparator;

public class SortAge implements Comparator<Students>{


    @Override
    public int compare(Students o1, Students o2) {
        if (o1.getAge()== o2.getAge()){
            return 0;
        } else if (o1.getAge()>o2.getAge()){
            return -1;
        }
        return 1;
    }
}

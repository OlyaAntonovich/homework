package home_work_4.comporators;

import home_work_4.DataChel;

import java.util.Comparator;

public class DataChelAgeComporator implements Comparator<DataChel> {

    @Override
    public int compare(DataChel o1, DataChel o2) {
        if (o1.getAge()== o2.getAge()){
            return 0;
        } else if (o1.getAge()>o2.getAge()){
            return -1;
        }
        return 1;
    }

}

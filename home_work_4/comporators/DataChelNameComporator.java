package home_work_4.comporators;

import home_work_4.DataChel;

import java.util.Comparator;

public class DataChelNameComporator implements Comparator<DataChel> {

    @Override
    public int compare(DataChel o1, DataChel o2) {
        return (o1.getName()).compareTo((o2.getName()));
    }
}

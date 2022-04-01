package home_work_2.sorts;

import home_work_2.utils.SortsUtils;

import java.util.Arrays;

public class SortsMain {

    public static void main(String[] args) {
        int [] x = {1,2,3,4,5,6};

        Arrays.toString(x);
        System.out.println("Массив до сортировки:" + Arrays.toString(x));

        SortsUtils.buble (x);

        Arrays.toString(x);
        System.out.println("Массив после сортировки:" + Arrays.toString(x));

    }




}

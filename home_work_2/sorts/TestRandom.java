package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

import java.util.Arrays;

public class TestRandom {
    public static void main(String[] args) {
        int x=50;
        int y=100;

        int [] array = ArraysUtils.arrayRandom (x, y);
        System.out.println("Массив до сортировки:" + Arrays.toString(array));

        SortsUtils.buble(array);
        System.out.println("Массив после сортировки:" + Arrays.toString(array));

        int [] arr = ArraysUtils.arrayFromConsole();

        System.out.println("Массив до сортировки:" + Arrays.toString(arr));

        SortsUtils.shake (arr);
        System.out.println("Массив после сортировки:" + Arrays.toString(arr));

    }





}

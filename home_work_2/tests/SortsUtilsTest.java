package home_work_2.tests;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static home_work_2.arrays.ArraysTasks.*;


public class ArrayTasksTest {

    @Test
    public void summTest (){

        Random random = new Random();
        int [] container = new int [10];


        for (int i = 0; i <container.length ; i++) {
            container[i] = random.nextInt(9);
        }

        System.out.println(Arrays.toString(container));

        System.out.println(summ(container));
        System.out.println(maxElement(container));
        System.out.println(minSrednee(container));
        System.out.println(Arrays.toString(twoMin(container)));
        System.out.println(sumNum(container));
    }
}

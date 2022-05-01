package home_work_2.tests;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;


import static home_work_2.utils.SortsUtils.buble;
import static home_work_2.utils.SortsUtils.shake;


public class SortsUtilsTest {

    @Test
    public void SortsUtilsTest (){

        Random random = new Random();
        int [] container = new int [10];

        for (int i = 0; i <container.length ; i++) {
            container[i] = random.nextInt(9);
        }

        System.out.println(Arrays.toString(container));
        buble(container);
        System.out.println(Arrays.toString(container));


        int [] container1 = new int [10];

        for (int i = 0; i <container1.length ; i++) {
            container1[i] = random.nextInt(9);
        }

        System.out.println(Arrays.toString(container1));
        shake(container1);
        System.out.println(Arrays.toString(container1));
    }
}

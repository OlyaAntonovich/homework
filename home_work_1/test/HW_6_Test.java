package home_work_1.test;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static home_work_1.HW_6.createPhoneNumber;

public class HW_6_Test {

    @Test
    public void createPhoneNumberOne (){
        Random random = new Random();
        int [] mass = new int [10];
        for (int i = 0; i < mass.length; i++) {
            mass [i]=random.nextInt(10);
        }

        System.out.println(createPhoneNumber(mass));

    }
}

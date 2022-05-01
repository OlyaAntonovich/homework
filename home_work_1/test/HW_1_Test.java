package home_work_1.test;

import home_work_1.HW_5_5_1;
import home_work_1.HW_5_5_2;
import home_work_1.HW_5_5_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_1.HW_4.sleepin;


public class HW_1_Test {


    @Test
    public  void sleepinOne (){
        boolean weekday = true;
        boolean vacation = false;
        boolean day = sleepin (weekday,vacation);
        System.out.println(day);
        Assertions.assertFalse(day);

    }

    @Test
    public void welcomIfElse (){

        HW_5_5_1 name = new HW_5_5_1 ();
        name.welcom("вася");
        System.out.println(name.welcom("вася"));


    }
    @Test
    public void welcomIfElseIF (){
        HW_5_5_2 name = new HW_5_5_2 ();
        name.welcom("вася");
        System.out.println(name.welcom("вася"));
    }
    @Test
    public void welcomSwitch (){
        HW_5_5_3 name = new HW_5_5_3 ();
        name.welcom("анастасия");
        System.out.println(name.welcom("анастасия"));
    }


}

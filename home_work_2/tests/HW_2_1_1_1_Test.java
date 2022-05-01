package home_work_2.tests;

import home_work_2.loops.HW_2_1_1_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HW_2_1_1_1_Test {

    @Test
    public  void Mach (){

    HW_2_1_1_1 param = new HW_2_1_1_1 ();

        Assertions.assertTrue(param.Mach("3"));
        param.fac("3");
    }

}

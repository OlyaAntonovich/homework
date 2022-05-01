package home_work_2.tests;

import home_work_2.loops.HW_2_1_3_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HW_2_1_3_1_Test {
    @Test
    public void machElseOne (){
        HW_2_1_3_1 step = new HW_2_1_3_1();
        System.out.println(step.mach("4"));
        Assertions.assertTrue(step.mach("4"));

        System.out.println(step.mach1("99.5"));
        Assertions.assertTrue(step.mach1("99.5"));

        System.out.println(step.calDeg(22.1, 3));
        System.out.println(step.printStep("22.1", "-12"));
    }
}

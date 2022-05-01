package home_work_2.tests;

import home_work_2.loops.HW_2_1_2_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HW_2_1_2_1_Test {
    @Test
    public void machElseOne (){
        HW_2_1_2_1 fac = new HW_2_1_2_1();
        System.out.println(fac.machElse("4"));
        Assertions.assertTrue(fac.machElse("4"));

        System.out.println(fac.machElse1("99.5"));
        Assertions.assertTrue(fac.machElse1("99.5"));

        System.out.println(fac.facOne("4278"));
    }
}

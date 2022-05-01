package home_work_2.tests;

import home_work_2.arrays.ForEachOperation;
import home_work_2.arrays.ForOperation;
import org.junit.jupiter.api.Test;

public class ForOperationTest {
    @Test
    public void ForOperationTest (){
        ForOperation array = new ForOperation ();
        int [] arr =  {5, 2, 8, 7, 9};
        array.vyvodVse (arr);
        array.vyvodNaoborot(arr);
        array.vyvodVtoroj(arr);

       
    }
}

package home_work_2.tests;

import home_work_2.arrays.ForOperation;
import home_work_2.arrays.WhileOperation;
import org.junit.jupiter.api.Test;

public class WhileOperationTest {
    @Test
    public void WhileOperationTest (){
        WhileOperation array = new WhileOperation ();
        int [] arr =  {5, 2, 8, 7, 9};
        array.vyvodVse (arr);
        array.vyvodNaoborot(arr);
        array.vyvodVtoroj(arr);

       
    }
}

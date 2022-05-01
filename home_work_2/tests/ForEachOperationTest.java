package home_work_2.tests;

import home_work_2.arrays.DoWhileOperation;
import home_work_2.arrays.ForEachOperation;
import org.junit.jupiter.api.Test;

public class ForEachOperationTest {
    @Test
    public void ForEachOperationTest (){
        ForEachOperation array = new ForEachOperation ();
        int [] arr =  {5, 2, 8, 7, 9};
        array.vyvodVse (arr);
        array.vyvodNaoborot(arr);
        array.vyvodVtoroj(arr);

       
    }
}

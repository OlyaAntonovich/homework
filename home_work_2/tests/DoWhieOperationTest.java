package home_work_2.tests;

import home_work_2.arrays.DoWhileOperation;
import org.junit.jupiter.api.Test;

public class DoWhieOperationTest {
    @Test
    public void DoWhieOperationTest (){
        DoWhileOperation array = new DoWhileOperation ();
        int [] arr =  {5, 2, 8, 7, 9};
        array.vyvodVse (arr);
        array.vyvodNaoborot(arr);
        array.vyvodVtoroj(arr);


    }
}

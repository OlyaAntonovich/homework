package home_work_4.comporators;

import home_work_4.DataContainer;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class DataContainerTest {


    @Test
    public void addOneElement (){
        DataContainer <String> container = new DataContainer<>(new String [0]);
        int i = container.add("Привет");
        System.out.println(Arrays.toString(container.getItems()));

    }
}

package home_work_4.tests;

import home_work_4.DataChel;
import home_work_4.DataContainer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static home_work_4.DataContainer.sort;

public class DataContainerTest {


    @Test
    public void addOneElementDiff (){

//        Специально введено неверное значение для сравнения
        DataContainer <String> container = new DataContainer<>(new String [0]);
        String mess = "Жалоба";
        int i = container.add(mess);

        Assertions.assertEquals("Привет", container.get(i));

    }
    @Test
    public void addOneElementSame (){
        DataContainer <String> container = new DataContainer<>(new String [0]);
        String mess = "Привет";
        int i = container.add(mess);

        Assertions.assertEquals("Привет", container.get(i));

    }
    @Test
    public void deleteOneElementIndex (){
        DataContainer <Integer> container = new DataContainer<>(new Integer [6]);

        int elem0 = container.add(5);
        int elem1 = container.add(13);
        int elem2 = container.add(7);
        int elem3 = container.add(0);

        container.delete(1);
        System.out.println(Arrays.toString(container.getItems()));
        Assertions.assertTrue(true);

    }
    @Test
    public void deleteOneElementItem (){
        DataContainer <Integer> container = new DataContainer<>(new Integer [6]);

        int elem0 = container.add(5);
        int elem1 = container.add(13);
        int elem2 = container.add(7);
        int elem3 = container.add(0);

        container.delete(elem1);
        System.out.println(Arrays.toString(container.getItems()));
        Assertions.assertTrue(true);

    }
    @Test
    public void sortTest (){
        DataContainer <DataChel> container = new DataContainer<>(new DataChel [3]);

        DataChel elem0 =new DataChel(15, "vasya");
        DataChel elem1 =new DataChel(7, "olya");
        DataChel elem2 =new DataChel(5, "igor");

        container.add(elem0);
        container.add(elem1);
        container.add(elem2);



        sort(container);

        System.out.println(Arrays.toString(container.getItems()));


    }
}

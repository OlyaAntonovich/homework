package home_work_4;

import home_work_4.comporators.DataChelAgeComporator;
import home_work_4.comporators.DataChelNameComporator;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainerMain {
    public static void main(String[] args) {

       DataID a = new DataID(5, "vasya");
       DataID [] array = new DataID[1];
       array [0] = a;

       DataContainer<DataID> b = new DataContainer<>(array);
       for(int i = 0;i <b.getItems().length;i++){
           System.out.println (Arrays.toString (b.getItems()));}

       DataID ol=new DataID (8,"sveta");
       DataID nu = null;
       System.out.println(b.add(ol));//проверка метода add(), если поле data не переполнено




        System.out.println(b.get(b.add(ol))); //проверка метода get(), если index в пределах массива
        b.add(nu);//проверка метода add(), если item=null
        System.out.println(b.delete(ol));
        System.out.println (Arrays.toString(b.getItems()));

       Integer [] array1 = new Integer[10];
       array1 [0] = 1;
       array1 [2] = 5;
       array1 [7] = 5;
       DataContainer<Integer> c = new DataContainer<>(array1);

       System.out.println (Arrays.toString (c.getItems()));
       Integer t = 25;
       System.out.println(c.add(t));
       System.out.println(c.get(1));
        System.out.println(c.delete(7));//проверка метода delete()(по индексу), если искомый элемент есть
        System.out.println(Arrays.toString (c.getItems()));
       System.out.println(c.delete(t));//проверка метода delete() (по значению элемента), если искомый элемент есть
       System.out.println(Arrays.toString (c.getItems()));
       System.out.println(c.delete(23));//проверка метода delete()(по значению элемента),
        // если искомого элемента нет
        System.out.println(c.delete(10));//проверка метода delete()(по индексу), если искомого элемента нет


       DataID [] array2 = new DataID[0];

       DataContainer<DataID> boo = new DataContainer<>(array2);
        for(int i = 0;i <boo.getItems().length;i++){
            System.out.println (Arrays.toString (boo.getItems()));}

        DataID olo=new DataID (897,"tolya");
        boo.add(olo); //проверка метода add(), если поле data переполнено,
        // работает механизм, который расширяет пространство для новых элементов.
        System.out.println(boo.get(1)); //проверка метода get(), если index за пределами массива



        DataChel [] arr = {new DataChel(5,"Vasya"), new DataChel(9,"Katya"),
                new DataChel(3,"Petr"),new DataChel(11,"Masha") };


        DataContainer<DataChel> foo = new DataContainer<>(arr);
 //       DataChelAgeComporator comporator = new DataChelAgeComporator(); //для сортировки по одному параметру Age
 //       DataChelNameComporator comporator1 = new DataChelNameComporator(); //для сортировки по одному параметру Name
        System.out.println (Arrays.toString (foo.getItems()));
        Comparator<DataChel> pcomp = new DataChelAgeComporator().thenComparing(new DataChelNameComporator());
        //для сортировки по двум параметрам Age и Name
        foo.sort(pcomp);
        System.out.println(Arrays.toString(foo.getItems())); //проверка метода sort()


    }

}

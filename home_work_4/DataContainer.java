package home_work_4;
/**
 * Класс DataContainer, у которого есть один дженерик (обобщение), литерал T.
 * Данный класс будет хранить неограниченное количество передаваемых объектов
 * обобщённого типа и совершать с ними различные операции
 */

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class DataContainer <T> {
    private  T [] data;
    private T item;
    private int index;



    public DataContainer(T[] data) {

        this.data = data;
    }

    /**
     * метод возвращает, переданный в конструктор массив
     * @return переданный в конструктор массив
     */
    public T []  getItems() {
        return data;
   }

    /**
     *метод int add(T item), который добавляет данные
     * во внутреннее поле data и возвращает номер позиции,
     * в которую были вставлены данные, начиная с 0
     * @param item параметр типа T
     * @return номер позиции, в которую были вставлены данные
     */
   public int add (T item) {

       T [] data1;
        if (item == null) {
            index = -1;

        } else {
            if (data.length ==0 ||data[data.length-1]!=null) {
                data1 = Arrays.copyOf(data, data.length+1);
                data1 [data1.length-1] = item;
                index = data1.length-1;
                data = data1;
                System.out.println (Arrays.toString (data1));

                }else {
                for (int i = 0; i <data.length; i++) {
                    if (data [i]==null){
                    data [i]=item;
                        index = i;
                    System.out.println (Arrays.toString (data));
                    break;}
                }

                }

        }
 //      System.out.println(number);
        return index;
   }

    /**
     * метод получает из DataContainer'а, из поля data,
     * предварительно сохранённый объект,
     * который мы передали на предыдущем шаге через метод add
     * @param index индекс объекта массива типа T
     * @return объект массива типа T
     */
   public T get (int index){

       T obj;
       if (index>= data.length){
           obj = null;
       }else {
           obj = data [index];
       }

       return obj;
   }

    /**
     * метод boolean delete(int index), который удаляет элемент
     * из поля data полностью. если такой элемент есть, то
     * возвращает значение true, если нет - false
     * @param index искомый элемент
     * @return true/false
     */
    public boolean delete (int index){
        boolean delete = false;

        for (int i = 0; i < data.length-1; i++) {
            if(i == index){
                T []  data1 = Arrays.copyOf(data, data.length-1);
                for(int j = 0; j < i; j++){
                    data1[j] = data[j];
                }
                for(int j = i; j < data.length - 1; j++){
                    data1[j] = data[j+1];
                }
                data = data1;
                delete = true;
                break;
            } else{
                delete = false;
            }
        }
        return delete;
    }

    /**
     * метод boolean delete(T item), который удаляет элемент
     * из поля data полностью. если такой элемент есть, то
     * возвращает значение true, если нет - false
     * @param item искомый элемент
     * @return true/false
     */
   public boolean delete (T item){
       boolean delete = false;

       for (int i = 0; i < data.length-1; i++) {
           if(data[i] == item){
               T []  data1 = Arrays.copyOf(data, data.length-1);
               for(int j = 0; j < i; j++){
                   data1[j] = data[j];
               }
               for(int j = i; j < data.length - 1; j++){
                   data1[j] = data[j+1];
               }
               data = data1;
               delete = true;
               break;
           } else{
               delete = false;
           }
       }
       return delete;
   }

    /**
     * метод занимается сортировкой данных,
     * записанных в поле data, используя реализацию сравнения
     * из переданного объекта comparator
     * @param comparator переданный объект comparator
     */
   public void sort (Comparator<T>comparator){
       T x = null;

       for(int i=0;i< data.length;i++){
           for (int j=(data.length-1); j>i; j--){
               if (comparator.compare((T) data[j],(T) data[j-1])<0){
                   x = data [j-1];
                  data [j-1] = data [j];
                  data[j] =x;

               }
           }
      }

    }

    /**
     * метод sort, который принимает объект DataContainer с дженериком extends Comparable и
     * сортирует элементы в переданном объекте
     * @param container объект DataContainer
     * @param <T> дженерик
     */
    public static <T extends Comparable<T>> void sort (DataContainer <T> container){


        T x = null;


        for(int i=0;i< container.data.length;i++){
            if (container.data[i] == null) {
                System.out.println("низзя");
                break;
            } else {
                for (int j = (container.data.length - 1); j > i; j--) {
                    if (container.data[j] == null || container.data[j - 1] == null) {
                        System.out.println("низзя");
                        break;
                    } else {
                        if (container.data[j].compareTo(container.data[j - 1]) < 0) {
                            x = container.data[j - 1];
                            container.data[j - 1] = container.data[j];
                            container.data[j] = x;
                        }
                    }
                }
            }

        }
        System.out.println(Arrays.toString(container.data));
        }

    /**
     * метод sort принимает объект DataContainer и реализацию интерфейса Comparator,
     * сортирует элементы в переданном объекте DataContainer
     * @param comparator объект интерфейса Comparator
     * @param <T> дженерик
     */
    public static <T> void sort (DataContainer <T> container, Comparator<T>comparator){
        T x = null;


        for(int i=0;i< container.data.length;i++) {
            if (container.data[i] == null) {
                System.out.println("низзя");
                break;
            } else {

                for (int j = (container.data.length - 1); j > i; j--) {
                    if (container.data[j] == null || container.data[j - 1] == null) {
                        System.out.println("низзя");
                        break;
                    } else {
                        if (comparator.compare((T) container.data[j], (T) container.data[j - 1]) < 0) {
                            x = container.data[j - 1];
                            container.data[j - 1] = container.data[j];
                            container.data[j] = x;
                        }
                    }
                }

            }
        }
       System.out.println(Arrays.toString(container.data));
    }

    /**
     * метод реализует интерфейс Iterable и
     * получает все элементы объекта DataContainer по одному
     * @param container объект DataContainer
     * @param <T> дженерик
     */

    public static <T extends Iterable<T>> void perebor (DataContainer <T> container){

        for(T item : container.data)
        {
            System.out.println(item);
        }
    }


    @Override
    public String toString() {
       String print = "";
       String v= "";
        for (int i = 0; i < data.length ; i++) {
            if (data[i]==null){
                print ="";
            }else{print =""+ data[i];}
            v=v+" "+print;


        }
        return("["+ v.replaceAll("\\s+", " ")+"]");
    }



}

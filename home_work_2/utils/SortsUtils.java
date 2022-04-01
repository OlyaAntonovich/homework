package home_work_2.utils;

public class SortsUtils {

    /**
     * Метод сортирует переданный ему массив
     * при помощи алгоритма пузырьковая сортировка
     * @param arr получаемый методом массив чисел
     */

    public static void buble (int [] arr){
        int i= 0;
        int n = arr.length;


        for(i=0;i<n;i++){                    //Внешнее кольцо цикла - перебираем i-ые элементы (от 0 до n-го)
            for (int j=(n-1); j>i; j--){    //Внутреннее кольцо цикла (перебираем j-ые элементы
                                            // (обратный порядок от n до 0);

                if (arr [j-1]>arr[j]){      //Задаем условие, в котором сравниваем предыдущий элемент с текущим
                    int f = arr [j-1];      //Если условие выполняется, производим замену элементов, если нет -
                                            //переходим на новую итерацию внешнего цикла
                    arr [j-1] = arr[j];
                    arr[j] = f;

                }
            }
        }

    }

    /**
     *Метод сортирует переданный ему массив
     * при помощи алгоритма шейкерная сортировка
     * @param arr получаемый методом массив чисел
     */

    public static void shake (int [] arr){

        int i=0;
        int r = arr.length-1;
        int f=1;
        int l=0;

        while ((i<r)&&f>0){
            f=0;
            for(i=0; i<r; i++){
                if (arr[i]>arr[i+1]){
                    int v = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = v;
                    f=1;
                }
            }
            r--;


            for(i=(arr.length-1); i>l; i--){
                if (arr[i-1]>arr[i]){
                    int v = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = v;
                    f=1;
                }
                l++;

            }
        }





    }


}

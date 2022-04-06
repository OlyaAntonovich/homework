package home_work_2.arrays;

//Перебор массива при помощи do....while, while, for, foreach


public class ArraysIteration {
    public static void main(String[] args) {

        String vesmassiv = vyvodVse ();
        System.out.println (vesmassiv);

        String polmassiva = vyvodVtoroj ();
        System.out.println (polmassiva);

        String massivnaoborot = vyvodNaoborot ();
        System.out.println (massivnaoborot);



    }

    /**
     * Выводит все элементы массива в консоль, используя все типы циклов
     * @return элементы массива в виде строки
     */

    public static String vyvodVse (){

        int [] container = home_work_2.arrays.ArraysUtils.arrayFromConsole ();
        String v = " ";
        int i = 0;


        for (i=0;i<container.length; i++) {
            int x = container [i];
            if (i==0){v =Integer.toString (x);
            } else {v = v + "," + Integer.toString (x);}
        }


        i=0;
        v="";

        do {
            int x = container [i];
            if (i==0){v =Integer.toString (x);
            } else {v = v + "," + Integer.toString (x);}
            i++;

        } while (i < container.length);



        v=" ";

        for ( int l:container) {
            if (l==container[0]){v =Integer.toString (l);
            } else {v = v + "," + Integer.toString (l);}}


        i=0;
        v="";

        while (i < container.length){
            int x = container [i];
            if (i==0){v =Integer.toString (x);
            } else {v = v + "," + Integer.toString (x);}
            i++;
        }

        return ("{"+ v + "}"+"\n");
    }

    /**
     * Выводит каждый второй элемент массива в консоль, используя все типы циклов
     * @return каждый второй элемент массива в виде строки
     */


    public static String vyvodVtoroj () {

        int [] container = home_work_2.arrays.ArraysUtils.arrayFromConsole ();
        String v = " ";
        int i = 0;
        for (i=0;i<container.length; i++) {
            int x = container [i];
            if (i%2!=0){v =v+" "+ Integer.toString (x);
            }
        }


        i=0;
        v="";

        do {
            int x = container [i];
            if (i%2!=0){v = v+" "+Integer.toString (x);
            }
            i++;

        } while (i < container.length);



        v=" ";
        int n =0;

        for ( int l:container) {
            n++;
            if (n%2==0){v =v+" "+Integer.toString (l);
            }
        }


        i=0;
        v="";

        while (i < container.length){
            int x = container [i];
            if (i%2!=0){v =v+" "+Integer.toString (x);
            }
            i++;
        }

        return v;

    }

    /**
     * Выводит все элементы массива в консоль в обратном порядке, используя все типы циклов
     * @return все элементы массива в консоль в обратном порядке
     */

    public static String vyvodNaoborot (){
        int [] container = home_work_2.arrays.ArraysUtils.arrayFromConsole ();
        String v = " ";
        int i = 0;


        for (i=0;i<container.length; i++) {
            int x = container [i];
            if (i==0){v =Integer.toString (x);
            } else {v = Integer.toString (x)+","+v;}
        }


        i=0;
        v="";

        do {
            int x = container [i];
            if (i==0){v =Integer.toString (x);
            } else {v = Integer.toString (x)+","+v;}
            i++;

        } while (i < container.length);



        v=" ";

        for ( int l:container) {
            if (l==container[0]){v =Integer.toString (l);
            } else {v = Integer.toString (l)+","+v;}


        i=0;
        v="";

        while (i < container.length){
            int x = container [i];
            if (i==0){v =Integer.toString (x);
            } else {v = Integer.toString (x)+","+v;}
            i++;
        }

   }
        return ("{"+ v + "}"+"\n");

}
}

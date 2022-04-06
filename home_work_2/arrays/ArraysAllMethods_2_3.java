package home_work_2.arrays;

public class ArraysAllMethods_2_3 {
    public static void main(String[] args) {
        int x=1;
        int y=1;

        int [] conteiner = home_work_2.arrays.ArraysUtils.arrayRandom (x, y);

        DoWhileOperation arr = new DoWhileOperation();
        arr.vyvodVse (conteiner);
        arr.vyvodVtoroj (conteiner);
        arr.vyvodNaoborot (conteiner);

        WhileOperation array = new WhileOperation();
        array.vyvodVse (conteiner);
        array.vyvodVtoroj (conteiner);
        array.vyvodNaoborot (conteiner);


       ForOperation arrfor = new ForOperation();
       arrfor.vyvodVse (conteiner);
       arrfor.vyvodVtoroj (conteiner);

    arrfor.vyvodNaoborot (conteiner);

        ForEachOperation arreach = new ForEachOperation();

        arreach.vyvodVse (conteiner);
        arreach.vyvodVtoroj (conteiner);
        arreach.vyvodNaoborot (conteiner);



    }
}

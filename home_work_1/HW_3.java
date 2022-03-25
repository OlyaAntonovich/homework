package home_work_1;

public class HW_3 {
    public static void main(String[] args) {
        System.out.println ("Победит тот игрок, кто вытянет карточку с большим числом" + "\nЕсли числа будут равны, то никто не победил");
        int a = (int) (Math.random ()*100); //выпадает первое случайное число
        System.out.print("Первый игрок тяните карточку: "+ a);
        int b = (int) (Math.random ()*100); //выпадает второе случайное число
        System.out.print("\nВторой игрок тяните карточку: "+b);

        int c = Math.max(a,b); //Выбирает число с максимальным значением

        if (a!=b) {System.out.print("\nПобедил игрок, вытянувший карточку: "+c);}
        else {System.out.print("\nК сожалению, никто не выиграл");}

    }
}


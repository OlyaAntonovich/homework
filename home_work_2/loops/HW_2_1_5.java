package loops;

// Вывести таблицу умножения в консоль (простым способом/до просмотра видео)
public class HW_2_1_5 {
    public static void main(String[] args) {

        int i = 1;
        int j = 1;

        for ( i = 1; i<11; i++ ) {
            for ( j = 2; j < 6; j++) {
                System.out.print(j + "*"+ i + "=" + i*j + "\t");
            }

            System.out.println(" ");
        }
        System.out.println(" ");
        for ( i = 1; i<11; i++ ) {
            for ( j = 6; j < 10; j++) {
                System.out.print(j + "*"+ i + "=" + i*j + "  ");
            }

            System.out.println(" ");
        }

        }

}

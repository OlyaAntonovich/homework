package collection;

import collection.comporator.SortAge;
import collection.comporator.SortMarks;
import collection.comporator.SortNames;

import java.util.*;


public class StudentMain1 {
    public static void main(String[] args) {
        List<Students> student = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i <=5 ; i++) {

            Students stud = new Students();
            stud.setNumber(random.nextInt(15_000));
            stud.setName((String.valueOf(mass()).toLowerCase(Locale.ROOT)));
            stud.setAge(7+(random.nextInt(10)));
            stud.setMark(0.0+(random.nextDouble()*10.0));
            stud.setOlimp(random.nextBoolean());
            student.add(stud);
        }

        System.out.println (Arrays.toString(student.toArray()));

        List<Students> student1;
        student1 = filterAge (student);

        System.out.println (Arrays.toString(student1.toArray()));

        List<Students> student2;
        student2 = filterMark (student);
//      System.out.println (Arrays.toString(student2.toArray()));
//      System.out.println (middleAge(student1));
        student1.sort (new SortMarks());
        student1.sort (new SortNames());
        System.out.println(sortMarkAge (student1));



    }

    public static char [] mass (){
        char[] mass = new char[5];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass [i] = (char)(1040+(random.nextInt(65)));

        }
          return mass;

    }


    public static List <Students> filterAge (List<Students> student){
        List<Students> student1 = new ArrayList<>();
        int i = 0;

        do  {
            if ((student.get(i).getAge()>=12 && student.get(i).getAge()<=17)){

                student1.add(student.get(i));
            }
            i++;

        } while (i<student.size());
        return student1;
    }

    public static List <Students> filterMark(List<Students> student){
        List<Students> student1 = new ArrayList<>();
        int i = 0;

        do  {
            if ((student.get(i).getMark()>=8)){

                student1.add(student.get(i));
            }
            i++;

        } while (i<student.size());
        return student1;
    }

    public static double middleAge (List<Students> student){
        double middleAge;
        int summ=0;

        for (int i = 0; i<student.size(); i++) {
            summ = summ+(student.get(i).getAge());

        }
        middleAge=(double)(summ/(student.size()));

        return middleAge;
    }

    public static List <Students> sortMarkAge(List<Students> student){

        for (int i = 0; i < student.size(); i++) {
            student.sort (new SortAge());
            for (int j = 0; j < student.size(); j++) {
                student.sort (new SortMarks());
            }

        }
        return student;
    }


}

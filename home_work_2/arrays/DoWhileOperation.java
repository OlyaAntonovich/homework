package home_work_2.arrays;

import org.jetbrains.annotations.NotNull;

public class DoWhileOperation implements IArraysOperation {

    @Override

    public void vyvodVse(int [] x) {

        int i=0;
        StringBuilder v = new StringBuilder(" ");

        do {
            int y = x [i];
            if (i==0){
                v = new StringBuilder(Integer.toString(y));
            } else {
                v.append(",").append(y);}
            i++;

        } while (i < x.length);

        System.out.print("{"+ v + "}"+"\n");

    }

    @Override
    public void vyvodVtoroj(int [] x) {
        int i=0;
        StringBuilder v= new StringBuilder();

        do {
            int y = x [i];
            if (i%2!=0){
                v.append(" ").append(y).append(',');
            }
            i++;

        } while (i < x.length);
        System.out.println ("{"+ v + "}"+"\n");

    }

    @Override
    public void vyvodNaoborot(int[] x) {
        int i=0;
        StringBuilder v= new StringBuilder();

        do {
            int y = x [i];
            if (i==0){
                v = new StringBuilder(Integer.toString(y));
            } else {
                v.insert(0, y + ",");}
            i++;

        } while (i < x.length);
        System.out.println ("{"+ v + "}"+"\n");

    }
}

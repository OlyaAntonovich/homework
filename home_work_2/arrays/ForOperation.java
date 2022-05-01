package home_work_2.arrays;

public class ForOperation implements IArraysOperation {

    @Override
    public void vyvodVse(int[] x) {

        StringBuilder v = new StringBuilder(" ");
        int i = 0;


        for (i=0;i<x.length; i++) {
            int y = x [i];
            if (i==0){
                v = new StringBuilder(Integer.toString(y));
            } else {
                v.append(",").append(y);}
        }

        System.out.println ("{"+ v + "}"+"\n");
    }

    @Override
    public void vyvodVtoroj(int[] x) {

        StringBuilder v = new StringBuilder(" ");
        int i = 0;
        for (i=0;i<x.length; i++) {
            int y = x [i];
            if (i%2!=0){
                v.append(" ").append(y).append(',');
            }
        }
        System.out.println ("{"+ v + "}"+"\n");

    }

    @Override
    public void vyvodNaoborot(int[] x) {
        StringBuilder v = new StringBuilder(" ");
        int i = 0;


        for (i=0;i<x.length; i++) {
            int y = x [i];
            if (i==0){
                v = new StringBuilder(Integer.toString(y));
            } else {
                v.insert(0, y + ",");}
        }

        System.out.println ("{"+ v + "}"+"\n");

    }
}

package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation {
    @Override
    public void vyvodVse(int[] x) {
        StringBuilder v = new StringBuilder(" ");

        for ( int i:x) {
            if (i==x[0]){
                v = new StringBuilder(Integer.toString(x[0]));
            } else {
                v.append(",").append(i);}}

        System.out.println ("{"+ v + "}"+"\n");
    }

    @Override
    public void vyvodVtoroj(int[] x) {
        StringBuilder v = new StringBuilder(" ");
        int l=0;
        for ( int i:x) {
            l++;
            if (l%2==0){
                v.append(" ").append(i).append(',');
            }
        }

        System.out.println ("{"+ v + "}"+"\n");
    }

    @Override
    public void vyvodNaoborot(int[] x) {
        StringBuilder v = new StringBuilder(" ");
        for ( int i:x) {
            if (i==x[0]){
                v = new StringBuilder(Integer.toString(x[0]));
            } else {
                v.insert(0, i + ",");}}

        System.out.println ("{"+ v + "}"+"\n");
    }
}

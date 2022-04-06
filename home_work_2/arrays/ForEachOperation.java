package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation {
    @Override
    public void vyvodVse(int[] x) {
        String v = " ";

        for ( int i:x) {
            if (i==x[0]){v =Integer.toString (x[0]);
            } else {v = v + "," + Integer.toString (i);}}

        System.out.println ("{"+ v + "}"+"\n");
    }

    @Override
    public void vyvodVtoroj(int[] x) {
        String v = " ";
        int l=0;
        for ( int i:x) {
            l++;
            if (l%2==0){v =v+" "+Integer.toString (i);
            }
        }

        System.out.println ("{"+ v + "}"+"\n");
    }

    @Override
    public void vyvodNaoborot(int[] x) {
        String v = " ";
        for ( int i:x) {
            if (i==x[0]){v =Integer.toString (x[0]);
            } else {v = Integer.toString (i)+","+v;}}

        System.out.println ("{"+ v + "}"+"\n");
    }
}

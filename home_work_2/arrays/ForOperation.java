package home_work_2.arrays;

public class ForOperation implements IArraysOperation {

    @Override
    public void vyvodVse(int[] x) {

        String v = " ";
        int i = 0;


        for (i=0;i<x.length; i++) {
            int y = x [i];
            if (i==0){v =Integer.toString (y);
            } else {v = v + "," + Integer.toString (y);}
        }

        System.out.println ("{"+ v + "}"+"\n");
    }

    @Override
    public void vyvodVtoroj(int[] x) {

        String v = " ";
        int i = 0;
        for (i=0;i<x.length; i++) {
            int y = x [i];
            if (i%2!=0){v =v+" "+ Integer.toString (y);
            }
        }
        System.out.println ("{"+ v + "}"+"\n");

    }

    @Override
    public void vyvodNaoborot(int[] x) {
        String v = " ";
        int i = 0;


        for (i=0;i<x.length; i++) {
            int y = x [i];
            if (i==0){v =Integer.toString (y);
            } else {v = Integer.toString (y)+","+v;}
        }

        System.out.println ("{"+ v + "}"+"\n");

    }
}

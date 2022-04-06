package home_work_2.arrays;

import org.jetbrains.annotations.NotNull;

public class DoWhileOperation implements IArraysOperation {

    @Override

    public void vyvodVse(int [] x) {

        int i=0;
        String v = " ";

        do {
            int y = x [i];
            if (i==0){v =Integer.toString (y);
            } else {v = v + "," + Integer.toString (y);}
            i++;

        } while (i < x.length);

        System.out.print("{"+ v + "}"+"\n");

    }

    @Override
    public void vyvodVtoroj(int [] x) {
        int i=0;
        String v="";

        do {
            int y = x [i];
            if (i%2!=0){v = v+" "+Integer.toString (y);
            }
            i++;

        } while (i < x.length);
        System.out.println ("{"+ v + "}"+"\n");

    }

    @Override
    public void vyvodNaoborot(int[] x) {
        int i=0;
        String v="";

        do {
            int y = x [i];
            if (i==0){v =Integer.toString (y);
            } else {v = Integer.toString (y)+","+v;}
            i++;

        } while (i < x.length);
        System.out.println ("{"+ v + "}"+"\n");

    }
}

package home_work_2.arrays;

public class WhileOperation implements IArraysOperation {
    @Override
    public void vyvodVse(int[] x) {
        int i=0;
        String v="";

        while (i < x.length){
            int y = x [i];
            if (i==0){v =Integer.toString (y);
            } else {v = v + "," + Integer.toString (y);}
            i++;
        }
        System.out.println ("{"+ v + "}"+"\n");
    }

    @Override
    public void vyvodVtoroj(int[] x) {
        int i=0;
        String v="";

        while (i < x.length){
            int y = x [i];
            if (i%2!=0){v =v+" "+Integer.toString (y);
            }
            i++;
        }

        System.out.println ("{"+ v + "}"+"\n");

    }

    @Override
    public void vyvodNaoborot(int[] x) {
        int i=0;
        String v="";

        while (i < x.length){
            int y = x [i];
            if (i==0){v =Integer.toString (y);
            } else {v = Integer.toString (y)+","+v;}
            i++;
        }
        System.out.println ("{"+ v + "}"+"\n");
    }
}

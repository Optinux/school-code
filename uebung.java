public class uebung {
    int[] c = new int[10000];

    public uebung(){
        this.c[1] = 0;
    }

    public int[] fill(){
        for(int i = 0; i < 10000; i++){
            c[i] = i;
        }
        return c;
    }

   public int[] remove(){
        for (int f = 0; f < 500; f++) {
            for (int i = 0; i < 10000; i = i + 3) {

                if(c[i] == 0){}else{
                c[i] = 0;}
            }
        }
        for (int i : c) {
            if(i == 0){}else{
            System.out.print(i + ", "); }
        }
        return c;
   }


    public static void main(String[] args) {
        uebung u1 = new uebung();
        u1.fill();
        u1.remove();
    }
}

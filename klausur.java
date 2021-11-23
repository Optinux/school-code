public class klausur {
    int a;
    int b;
    int c;
    double d;
    boolean AnAus;
    int f;

    public klausur(){
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
    }

    public double calculate(int a, int b, int c){
        double temp2;
        double temp;

        temp2 = a + b;
        temp = temp2 / c;

        d = temp;
        return d;
            }

            public void printResult(){
                System.out.println("Result a: " + a);
                System.out.println("Result b: " + b);
                System.out.println("Result c: " + c);
                System.out.println("Result d: " + d);
            }

        public double calculate2(int a, int b, int c, boolean AnAus, int f){
        int temp;
        for(int i = 0; i < 8; i++){    //broken due to the values always getting set to the same numbers lol
            temp = a + b;
            d = temp * c;
            }

        if(AnAus == true){
            if (d > f) {
                System.out.println("Größer als " + f);
            } else {
                System.out.println("Kleiner als " + f);
            }
        }else{System.out.println("Keine Überprüfung durchgeführt!");}

        return d;
        }

        public void resetValues(){
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        }


    public static void main(String[] args) {
      klausur k1 = new klausur();
      k1.calculate(40,5,6);
      k1.printResult();
      k1.resetValues();
      k1.printResult();
      k1.calculate2(4, 5, 3, true, 28);
      k1.printResult();
    }
}

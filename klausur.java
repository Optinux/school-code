public class klausur {
    int a;
    int b;
    int c;
    double d;

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
        System.out.println("Result: " + d);
            }


    public static void main(String[] args) {
      klausur k1 = new klausur();
      k1.calculate(40,5,6);
      k1.printResult();
    }
}

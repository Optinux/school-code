public class demo {
    int b;
    int a;
    String cock;

    public demo(){
        this.a = 0;
        this.b = 0;
        this.cock = "cbt";

    }

    public void print(int a, int b, String cock){
        double temp;
        temp = a + b / 3.14;
        System.out.println(a + " " + b + " " + cock + " " + temp);

    }

    public static void main(String[] args) {
        demo d1 = new demo();
        d1.print(4,2,"mogus");
    }
}

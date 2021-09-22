import java.util.Random;

public class tutorial{
   String text;
   int n;
   int a;
   int b;
  
   public tutorial(String text1){
      this.text = text1;
      this.n = 0;
      this.a = 0;
      this.b = 0;

   }
  
   public void print(String input){
      System.out.println(input);
   }
  
   public void print2(String NewWord){
        System.out.println("Neues Wort: " + NewWord + " ; " + "Altes Wort: " + text);
        text = NewWord;
   }


   public int[] uebung(int n, int b, int a) {
       Random rand = new Random();  //create random
       int[] mongus = new int[n];   //create array w/ entry point value
       if (b < a) {                     //check if b < a
           int temp = b;               //if yes then switch them around
           b = a;
           a = temp;
           System.out.println("Switching required!");          //print whether or not switching required
       } else System.out.println("no switching required!");         //print whether or not switching required
           for (int i = 0; i < n; i++) {  //loop through array
               mongus[i] = rand.nextInt(b - a + 1) + a;    //declare numbers for each slot
           }
           for (int i = 0; i < n; i++) {    //loop through array again
               System.out.print(mongus[i] + " ");   //print the array by going through each slot
           }
           return mongus;
       }

  
   public static void main(String[] args) {
       tutorial t1 = new tutorial("dummy");
       t1.print2("mongus");
       t1.print2("sussy");
       t1.print2("obama");
       t1.uebung(20, 11, 36);
   }
  
  }

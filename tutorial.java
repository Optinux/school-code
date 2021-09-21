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
      this.b = 10;
   }
  
   public void print(String input){
      System.out.println(input);
   }
  
   public void print2(String NewWord){
        System.out.println("Neues Wort: " + NewWord + " ; " + "Altes Wort: " + text);
        text = NewWord;
   }


   public int[] uebung(int n){
           Random rand = new Random();  //create random
           int[] mongus = new int[n];   //create array w/ entry point value
           for(int i = 0 ; i < n ; i++){  //loop through array
              mongus[i] = rand.nextInt(b);    //declare numbers for each slot
           }
           for(int i = 0 ; i < n ; i++){    //loop through array again
               System.out.println(mongus[i]);   //print the array by going through each slot
           }                
      return mongus;
   }
  
   public static void main(String[] args) {
       tutorial t1 = new tutorial("dummy");
       t1.print2("mongus");
       t1.print2("sussy");
       t1.print2("obama");
       t1.uebung(9);              
   }
  
  }
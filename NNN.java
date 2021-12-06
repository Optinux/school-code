import java.util.Random;

public class NNN {
    double inp1;
    double inp2;
    double rand1;
    double rand2;


    public NNN(){
        this.inp1 = 0;
        this.inp2 = 0;
        this.rand1 = 0;
        this.rand2 = 0;
        }

    public double[] thingy(double inp1, double inp2){ //how to return multiple doubles 2012 HD Hindi Tutorial [720p]
        Random rand = new Random();
        double rand1 = rand.nextInt(20);
        double rand2 = rand.nextInt(20);

    double temp = 0;
    double temp2 = 0;
    double temp3 = 0;
    temp = inp1 * rand1;
    temp2 = inp2 * rand2;


    temp3 = temp + temp2;

    System.out.println(temp);
    System.out.println(temp2);

    if(temp < 1){

        if(temp > 0){
        backpropagation();

        }else{System.out.println("temp > 0. Temp3:" + temp3);}

    }

    else{
        System.out.println("temp < 1. Temp3:" + temp3);
        backpropagation();
    }

    return new double[]{rand1, rand2};
    }

 public double[] backpropagation(){         //how to return multiple doubles 2012 HD FREE Hindi Tutorial [720p]
     Random rand = new Random();

     rand1 = rand1 * rand.nextInt(20);
     rand2 = rand2 * rand.nextInt(20);

     thingy(rand1, rand2);
     return new double[]{rand1, rand2};
 }

    public static void main(String[] args) {
        NNN n1 = new NNN();
        n1.thingy(2,1);




    }


}

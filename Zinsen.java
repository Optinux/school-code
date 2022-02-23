public class Zinsen {

  public static double Zinssatz;
  public static double Kontostand;

  public void setValues(double Zinssatz_temp, double Kontostand_temp) {
    Zinssatz = Zinssatz_temp;
    Kontostand = Kontostand_temp;
  }

  public double calcZinsen() {
    Kontostand = Kontostand * Zinssatz;
    return Kontostand;
  }

  public void printResult() {
    System.out.println(
      "Kontostand: " + Kontostand + "€ (aktuelle Zinssatz: " + Zinssatz + ")"
    );
  }

  public double erhöheZinssatz(double Änderungsrate) {
    Zinssatz = Zinssatz + Änderungsrate;
    return Zinssatz;
  }

  public static void main(String[] args) {
    Zinsen a1 = new Zinsen();
    a1.setValues(1.05, 1000);
    a1.calcZinsen();
    a1.printResult();
    a1.erhöheZinssatz(0.05);
    a1.calcZinsen();
    a1.printResult();
  }
}

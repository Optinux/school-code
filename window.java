import javax.swing.*;

public class window extends JFrame{

    public window(){
        this.getContentPane().setLayout(null);
    }

   public static void placeStuff(JPanel p1){
     p1.setLayout(null);

     JTextField textfield_mongus = new JTextField(20);
     textfield_mongus.setBounds(200,20,165,25);
     p1.add(textfield_mongus);

     JButton button_mongus = new JButton("Click Me");
     button_mongus.setBounds(200, 80, 165, 25);
     p1.add(button_mongus);

   }
   public static void main(String[] args) {
    JFrame w1 = new JFrame("Le Window Au Chocolat");
    w1.setSize(600, 600);
    w1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel p1 = new JPanel();    
    w1.add(p1);
    w1.setVisible(true);
    placeStuff(p1);
  }  
}
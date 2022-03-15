import javax.swing.*;
import java.awt.*;

public class JFrameMostrarCal extends JFrame{
   Calculadora2P mostrar = new Calculadora2P();
   
    public JFrameMostrarCal(){
      initComponents();
   }
   
   private void initComponents(){
      setSize(300, 300);
      setTitle("Calculadora");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setContentPane(mostrar);
      setVisible(true);
       
   }   
}

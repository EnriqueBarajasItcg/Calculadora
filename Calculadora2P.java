import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora2P extends JPanel implements ActionListener{
  private JButton btn1, btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnS,btnR,btnDiv,btnM,btnDot,btnE,btnCE,btnSalir;
  private JTextField txtRes;
  private JPanel panelPantalla, panelBtn,panelOp;
  private double  x,y,res;
  private String cad="",cadA="", op="";
  private boolean dot=false;
   public Calculadora2P(){
      
      JPanel panelOp = new JPanel();
      panelOp.setLayout(new GridLayout(1,2));
      
      JPanel panel = new JPanel();
      panel.setLayout(new BorderLayout());
      
      panelPantalla = new JPanel();
      txtRes= new JTextField("0",20);
      txtRes.setHorizontalAlignment(JTextField.RIGHT);
      txtRes.setEditable(false);
      panelPantalla.add(txtRes);
       
      panelPantalla = new JPanel();
      add(txtRes);
      panelBtn = new JPanel();      
      panelBtn.setLayout(new GridLayout(4,4));
    
      btnE = new JButton("=");
      btnE.addActionListener(this);
    
      btn1 = new JButton("1");
      btn1.addActionListener(this);
    
      btn2 = new JButton("2");
      btn2.addActionListener(this);
    
      btn3 = new JButton("3");
      btn3.addActionListener(this);
    
      btn4 = new JButton("4");
      btn4.addActionListener(this);
       
      btn5 = new JButton("5");
      btn5.addActionListener(this);
      
      btn6 = new JButton("6");
      btn6.addActionListener(this);
       
      btn7 = new JButton("7");
      btn7.addActionListener(this);
       
      btn8 = new JButton("8");
      btn8.addActionListener(this);
      
      btn9 = new JButton("9");
      btn9.addActionListener(this);
       
      btn0 = new JButton("0");
      btn0.addActionListener(this);
      
      btnS = new JButton("+");
      btnS.addActionListener(this);
       
      btnR = new JButton("-");
      btnR.addActionListener(this);
       
      btnM = new JButton("X");
      btnM.addActionListener(this);
       
      btnDiv = new JButton("/");
      btnDiv.addActionListener(this);
       
      btnDot = new JButton(".");
      btnDot.addActionListener(this);
       
      btnCE = new JButton("CE");
      btnCE.addActionListener(this);
       
      btnSalir = new JButton("Salir");
      btnSalir.addActionListener(this);

      panelBtn.add(btn1);
      panelBtn.add(btn2);
      panelBtn.add(btn3);
      panelBtn.add(btn4);
      panelBtn.add(btn5);
      panelBtn.add(btn6);
      panelBtn.add(btn7);
      panelBtn.add(btn8);
      panelBtn.add(btn9);
      panelBtn.add(btn0);
      panelBtn.add(btnS);
      panelBtn.add(btnR);
      panelBtn.add(btnDiv);
      panelBtn.add(btnM);
      panelBtn.add(btnDot);
      panelBtn.add(btnE);
       
      add(panelBtn);
      
      btnCE = new JButton("CE");
      btnCE.addActionListener(this);
       
      btnSalir = new JButton("Salir");
      btnSalir.addActionListener(this);
       
      panelOp.add(btnCE);
      panelOp.add(btnSalir);
      
      add(panelOp);
     }
   public void error(){
      JOptionPane.showMessageDialog(null, "Valor no valido",
            "Aviso", JOptionPane.INFORMATION_MESSAGE);
         cad="";
         txtRes.setText("0");
   } 
   public void cambio(){
      cadA=cad;
      cad="";
      txtRes.setText("0");
   }
   public boolean validar(){
      if(cad.charAt(cad.length()-1)=='.')
         return false;
      return true;
   }
   public void resolver(){
      try{
         x=Double.parseDouble(cad);
         y=Double.parseDouble(cadA);
         if(op=="/"){
            if(x==0){
               cad="";
               cadA="";
               op="";
               txtRes.setText("Error");
            }else{
               res=y/x;
               cad=String.valueOf(res);
               cadA="";
               op="";
               txtRes.setText(String.valueOf(res));  
            }
         }else
            if(op=="+")
               res=y+x;
            else
               if(op=="-")
                  res=y-x;
               else
                  if(op=="X")
                     res=y*x;
            cad=String.valueOf(res);
            cadA="";
            op="";
            txtRes.setText(String.valueOf(res));
      }catch(NumberFormatException e){
         error();
      }
   }
   
  
   public void actionPerformed(ActionEvent e){
   //colocar numeros  
      if(e.getSource()==btn1){
         if(cad.length()<21){
            cad+="1";
            txtRes.setText(cad);
         }
      }
      if(e.getSource()==btn2){
          if(cad.length()<21){
            cad+="2";
            txtRes.setText(cad);
         }
      }
      if(e.getSource()==btn3){
         if(cad.length()<21){
            cad+="3";
            txtRes.setText(cad);
         }
      }
      if(e.getSource()==btn4){
         if(cad.length()<21){
            cad+="4";
            txtRes.setText(cad);
         }
      }
      if(e.getSource()==btn5){
         if(cad.length()<21){
            cad+="5";
            txtRes.setText(cad);
         }
      }
      if(e.getSource()==btn6){
         if(cad.length()<21){
            cad+="6";
            txtRes.setText(cad);
         }
      }
      if(e.getSource()==btn7){
         if(cad.length()<21){
            cad+="7";
            txtRes.setText(cad);
         }      }
      if(e.getSource()==btn8){
         if(cad.length()<21){
            cad+="8";
            txtRes.setText(cad);
         }
      }
      if(e.getSource()==btn9){
         if(cad.length()<21){
            cad+="9";
            txtRes.setText(cad);
         }
      }
      if(e.getSource()==btn0){
         if(cad.length()<21){
            cad+="0";
            txtRes.setText(cad);
         }
      }
   if(e.getSource()==btnDot){
      if(cad.length()<21){
         if(dot==false){
            if(cad=="")
               cad=cad+"0.";
            else
               cad=cad+".";
            txtRes.setText(cad);
            dot=true;   
         }
      }
   }
   //operaciones
   if(e.getSource()==btnR){
      if(validar()){
         if(op=="" && cadA==""){
            cambio();
            op="-";
         }else
            if(op!="" && cadA=="")
               op="-";
            else
               resolver();
      }else{
         error();  
       }
   }
   if(e.getSource()==btnS){
      if(validar()){
         if(op=="" && cadA==""){
            cambio();
            op="+";
         }else
            if(op!="" && cadA=="")
               op="+";
            else
               resolver();
      }else{
         error();  
       }
   }
   if(e.getSource()==btnM){
      if(validar()){
         if(op=="" && cadA==""){
            cambio();
            op="X";
         }else
            if(op!="" && cadA=="")
               op="X";
            else
               resolver();
      }else{
         error();  
       }
   }
   if(e.getSource()==btnDiv){
      if(validar()){
         if(op=="" && cadA==""){
            cambio();
            op="/";
         }else
            if(op!="" && cadA=="")
               op="/";
            else
               resolver();
      }else{
         error();  
       }
   }
   if(e.getSource()==btnE){
      resolver();
      op="";
   }
   //botones opciones
   if(e.getSource()==btnSalir){
      System.exit(0);
   }
   if(e.getSource()==btnCE){
      txtRes.setText("0");
      cad="";
      op="";
      cadA="";
      dot=false;
   }
   }
   
 
}
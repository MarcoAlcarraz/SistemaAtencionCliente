
package Formatos;
//libreria
import javax.swing.JOptionPane;
public class Mensajes {
    
   public static void M1(String mensaje){
       JOptionPane.showMessageDialog(null,mensaje);
   }
   
   public static int M2(String mensaje){
       return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
   }
   
   public static int M3(String titulo,String mensaje){      
       return JOptionPane.showConfirmDialog(null, mensaje, titulo,JOptionPane.OK_CANCEL_OPTION);  
       //ok==0
   }
           
}//fin clase

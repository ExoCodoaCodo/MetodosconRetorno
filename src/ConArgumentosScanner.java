
import javax.swing.JOptionPane;
import java.util.Scanner;


public class ConArgumentosScanner {
    
    
    
    
    public void saludar(String nombre){
    
        
        
        System.out.println(nombre);
        System.out.println("Bienvenido al metodo con argumentos");
       
    }
    
    
    
    public static void main(String[] args){
    
      
        ConArgumentosScanner objeto1 = new ConArgumentosScanner();
        
    Scanner ingreso = new Scanner(System.in);
    
    String palabra;
    
        System.out.print("Ingrese su nombre: ");
        palabra=ingreso.next();
     
    
    objeto1.saludar(palabra);
    
    
    
    }
    
    
    
    
}

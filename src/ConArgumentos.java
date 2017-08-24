
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose.zapatagom
 */
public class ConArgumentos {
    
    
    
    public void saludar(String saludo){
    
        System.out.println(saludo);
        System.out.println("Bienvenido al metodo sin argumentos");
        JOptionPane.showMessageDialog(null,saludo);
    }
    
    
    
    public static void main(String[] args){
    
        
    ConArgumentos objeto = new ConArgumentos();
        
    
    
    
    objeto.saludar("Bienvenido");
    
    
    
    }
    
    
    
    
    
}

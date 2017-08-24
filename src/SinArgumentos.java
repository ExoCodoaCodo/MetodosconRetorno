/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author jose.zapatagom
 */
public class SinArgumentos {
    
    
    public void saludar(){
    
        System.out.println("Bienvenido");
        System.out.println("Bienvenido al metodo sin argumentos");
        JOptionPane.showMessageDialog(null,"metodo sin argumentos");
    }
    
    
    
    public static void main(String[] args){
    
        
    SinArgumentos objeto1 = new SinArgumentos();
        
    objeto1.saludar();
    
    
    
    }
    
    
}

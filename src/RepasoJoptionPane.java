

import javax.swing.JOptionPane;


public class RepasoJoptionPane {
    
public static void main(String [] args){

String nombre;
 int num1;  
int num2;
int suma;
    
 nombre=JOptionPane.showInputDialog("ingrese su nombre");
    
JOptionPane.showMessageDialog(null,nombre);

num1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
num2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));

suma=num1+num2;

JOptionPane.showMessageDialog(null,nombre+"\n La suma de los numeros ingresados es: " + num1);


}    
    
}

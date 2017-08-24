/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose.zapatagom
 */
public class ConRetorno {
    
    
    public int devolverentero(){
    
    int a=10;
    int b=30;
    int suma= a+b;
    
    return suma;
    
    }
    
    
    
    
    public static void main(String[] args){
    
    ConRetorno objeto1 = new ConRetorno();
        
    int totalsuma;    
    
    totalsuma=objeto1.devolverentero();
        
    System.out.println(totalsuma);
    
    }
    
    
    
    
}

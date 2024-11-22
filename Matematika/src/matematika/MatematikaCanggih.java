/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematika;

/**
 *
 * @author dimas
 */
public class MatematikaCanggih extends Matematika{
    private int modulus;
    
    void setModulus (int a, int b){
        modulus = a % b;
    }
    
    int getModulus(){
        return modulus;
    }
}

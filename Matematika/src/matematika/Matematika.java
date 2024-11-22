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
public class Matematika {
   private int bagi;
   private int tambah;
   private int kurang;
   private int kali;
   
    public void pertambahan (int a, int b){
        tambah = a + b;
    }
    public void perkurangan(int a, int b){
        kurang = a - b;
    }
    public void perkalian(int a, int b){
        kali = a * b;
    }
    public void pembagian(int a, int b){
        bagi = a / b;
    }
    
    int getPertambahan(){
        return tambah;
    }
    int getPengurangan(){
        return kurang;
    }
    int getPembagian(){
        return bagi;
    }
    int getPerkalian(){
        return kali;
    }
}

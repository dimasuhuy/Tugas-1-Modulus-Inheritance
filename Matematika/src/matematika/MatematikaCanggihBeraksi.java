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
public class MatematikaCanggihBeraksi {
        public static void main(String[] args) {
        MatematikaCanggih run = new MatematikaCanggih();
        
        run.pertambahan(4, 5);
        System.out.println("Hasil pertambahan : " + run.getPertambahan());
        
        run.perkurangan(10, 5);
        System.out.println("Hasil pengurangan : " + run.getPengurangan());
        
        run.perkalian(10, 5);
        System.out.println("Hasil perkalian : " + run.getPerkalian());
        
        run.pembagian(45, 5);
        System.out.println("Hasil pembagian: " + run.getPembagian());

        run.setModulus(10, 3);
        System.out.println("Hasil modulus: " + run.getModulus());
    }
}

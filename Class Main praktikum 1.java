/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author USER
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran hai = new Lingkaran();
        
        System.out.println("Luas Lingkaran");
        System.out.println("---------------------");
        hai.Input();
        System.out.println(" ");
        hai.Hitung();
        System.out.println(" ");
        System.out.println("Hasil = "+hai.Hasil());
        
        System.out.println(" ");
        System.out.println("-------------------------------");
        System.out.println(" ");
        
        Persegi halo = new Persegi();
        
        System.out.println("Luas Persegi");
        System.out.println("-----------------------");
        halo.masuk();
        System.out.println(" ");
        halo.menghitung();
        System.out.println(" ");
        System.out.println("Hasil = "+halo.hasil());
        
        
        
    }
}

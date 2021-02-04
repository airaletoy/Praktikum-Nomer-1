/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Lingkaran {
    double r;
    double HasilLuasLingkaran;
    
    void Input(){
        System.out.println("Silahkan masukkan jari-jari lingkaran");
        Scanner sc = new Scanner(System.in);
        System.out.println("Jari-jari = ");
        r = sc.nextDouble();
    }
    void Hitung(){
        System.out.println("Saatnya proses menghitung");
        HasilLuasLingkaran = 3.14*r*r;
    }
    double Hasil(){
        return HasilLuasLingkaran;
    }
}

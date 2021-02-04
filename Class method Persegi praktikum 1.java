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
public class Persegi {
    double s;
    double HasilLuasPersegi;
    
    void masuk(){
        System.out.println("Silahkan masukkan sisi dari persegi");
        Scanner sc = new Scanner(System.in);
        System.out.println("Sisi = ");
        s = sc.nextDouble();
    }
    void menghitung(){
        System.out.println("Saatnya menghitung");
        HasilLuasPersegi = s*s;
    }
    double hasil(){
        return HasilLuasPersegi;
    }
}

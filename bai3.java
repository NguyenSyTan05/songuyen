/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.songuyen;

/**
 *
 * @author Nguyen Sy Tan
 */
public class bai3 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (Kiemtra_sn(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean Kiemtra_sn(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

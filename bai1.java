/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.songuyen;

/**
 *
 * @author Nguyen Sy Tan
 */
public class bai1 {
     public static void main(String[] args) {
        String chan = "";
        String le = "";

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                chan += i + " ";
            } else {
                le += i + " ";
            }
        }

        System.out.println("So chan : " + chan);
        System.out.println("So le : " + le);

    }
}

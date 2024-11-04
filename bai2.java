/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.songuyen;

import java.util.Scanner;

/**
 *
 * @author Nguyen Sy Tan
 */
public class bai2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap n :");
        n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println("Tong " + sum);
    }
}
